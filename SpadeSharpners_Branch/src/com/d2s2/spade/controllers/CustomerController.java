/**
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package com.d2s2.spade.controllers;

import com.d2s2.spade.dbconnection.DBConnection;
import com.d2s2.spade.dbconnection.DBHandler;
import com.d2s2.spade.dbconnection.DBQueryGenerator;
import com.d2s2.spade.models.Customer;
import com.d2s2.spade.models.CustomerTelephone;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.d2s2.spade.models.CustDebt;

/**
 *
 * @author Heshan Sandamal
 */
public class CustomerController {

    //add customer to database
    public static boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getDBConnection().getConnection();       //get connection from singleton dbConnection class

        String customerId = customer.getCustomerId();
        String name = customer.getName();
        String address = customer.getAddress();
        ArrayList<CustomerTelephone> telList = customer.getTelNoList();

        try {
            connection.setAutoCommit(false);        //disabling the autocommiting feature
            String sqlCustomer = DBQueryGenerator.insertQuery(Customer.class.getSimpleName(), 3);             //build insert query
            int setData = DBHandler.setData(connection, sqlCustomer, new Object[]{customerId, name, address});           //set data to customerTable

            if (setData > 0) {              //check customer data is added

                for (CustomerTelephone customerTelephone : telList) {

                    CustomerTelephoneController.addCustomerTelephone(customerTelephone);
                    String sqlTelephone = DBQueryGenerator.insertQuery(CustomerTelephone.class.getSimpleName(), 2);       //use this way to get db table name.because model name is same as db table name

                    //add data using prepared statements.refer handler class
                    int addedTel = DBHandler.setData(connection, sqlTelephone, new Object[]{customerTelephone.getCustomerId(), customerTelephone.getTelNo()});

                    if (addedTel <= 0) {            //check customer telephone data is added
                        connection.rollback();      //if error then rool back
                        return false;
                    }
                }

            } else {
                connection.rollback();      //if error then rool back
                return false;
            }

            connection.commit();        //when no error commit 
            return true;

        } catch (Exception e) {
            connection.rollback();      //if error then rool back
            throw e;
        } finally {
            connection.setAutoCommit(true);     //enabling auto commit
        }

    }

    public static boolean updateCustomer(Customer oldCustomer, Customer customer) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getDBConnection().getConnection();       //get connection from singleton dbConnection class

        String customerId = customer.getCustomerId();
        String name = customer.getName();
        String address = customer.getAddress();
        ArrayList<CustomerTelephone> telList = customer.getTelNoList();

        try {
            connection.setAutoCommit(false);        //disabling the autocommiting feature
            String deletesql = DBQueryGenerator.deleteQuery("Customer", "customerId"); // build delete query
            String sqlCustomer = DBQueryGenerator.insertQuery(Customer.class.getSimpleName(), 3);             //build insert query
            int deleteData = 0;
            deleteData = DBHandler.deleteData(connection, deletesql, new Object[]{oldCustomer.getCustomerId()});

            if (deleteData != 0) {
                int setData = DBHandler.setData(connection, sqlCustomer, new Object[]{customerId, name, address});           //set data to customerTable

                if (setData > 0) {              //check customer data is added

                    for (CustomerTelephone customerTelephone : telList) {

                        // CustomerTelephoneController.addCustomerTelephone(customerTelephone)
                        String sqlTelephone = DBQueryGenerator.insertQuery(CustomerTelephone.class.getSimpleName(), 2);       //use this way to get db table name.because model name is same as db table name

                        //add data using prepared statements.refer handler class
                        int addedTel = DBHandler.setData(connection, sqlTelephone, new Object[]{customerTelephone.getCustomerId(), customerTelephone.getTelNo()});

                        if (addedTel <= 0) {            //check customer telephone data is added
                            connection.rollback();      //if error then rool back
                            return false;
                        }
                    }

                } else {
                    connection.rollback();      //if error in adding data then rool back
                    return false;
                }
            } else {
                connection.rollback();      //if error in deleting then rool back
                return false;
            }
            connection.commit();        //when no error commit 
            return true;

        } catch (Exception e) {
            connection.rollback();      //if error then rool back
            throw e;
        } finally {
            connection.setAutoCommit(true);     //enabling auto commit
        }

    }

    /**
     * method to get details of all customers without the phone number
     *
     * @return
     */
    public static ArrayList<Customer> viewCustomers() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = DBQueryGenerator.selectAllQuery(Customer.class.getSimpleName());
        ResultSet resultSet = DBHandler.getData(connection, sql);

        ArrayList<Customer> customerList = new ArrayList<Customer>();

        while (resultSet.next()) {
            String customerId = resultSet.getString(Customer.CUSTOMERID);
            String name = resultSet.getString(Customer.NAME);
            String address = resultSet.getString(Customer.ADDRESS);
            customerList.add(new Customer(customerId, name, address));

        }
        return customerList;
    }

    public static ArrayList<Customer> getCustomersBasicInfo() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = DBQueryGenerator.selectLimitedColumnsQuery(new String[]{Customer.NAME, Customer.CUSTOMERID}, Customer.class.getSimpleName());
        ResultSet resultSet = DBHandler.getData(connection, sql);

        ArrayList<Customer> customerListBasic = new ArrayList<>();

        while (resultSet.next()) {
            String customerId = resultSet.getString(Customer.CUSTOMERID);
            String name = resultSet.getString(Customer.NAME);
            customerListBasic.add(new Customer(customerId, name, null));
        }
        return customerListBasic;
    }

    public static ArrayList<String> viewCustomerPhone(String tableName, String customerId) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = DBQueryGenerator.selectwhereQuery(tableName, "customerId");
        ResultSet resultSet = DBHandler.getData(connection, sql, new Object[]{customerId});
        ArrayList<String> telephoneNoList = new ArrayList<>();

        while (resultSet.next()) {
            String teleNo = resultSet.getString("telNo");
            telephoneNoList.add(teleNo);
        }

        return telephoneNoList;
    }

    public static String getLastPaymentId() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT paymentId FROM custpayment ORDER BY paymentId DESC LIMIT 1";
        ResultSet resultSet = DBHandler.getData(connection, sql);
        resultSet.next();
        return resultSet.getString("paymentId");
    }

    public static boolean deleteCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        int executed = 0;
        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = DBQueryGenerator.deleteQuery("Customer", "customerId");
        executed = DBHandler.deleteData(connection, sql, new Object[]{customer.getCustomerId()});

        if (executed == 0) {
            return false;
        } else {
            return true;
        }

    }

}
