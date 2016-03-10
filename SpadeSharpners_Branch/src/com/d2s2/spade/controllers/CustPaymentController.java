/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.d2s2.spade.controllers;

import com.d2s2.spade.dbconnection.DBConnection;
import com.d2s2.spade.dbconnection.DBHandler;
import com.d2s2.spade.dbconnection.DBQueryGenerator;
import com.d2s2.spade.models.CustDebt;
import com.d2s2.spade.models.CustPayment;
import com.d2s2.spade.models.paymentType;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dimuth Tharaka
 */
public class CustPaymentController {
    public static double getCustomerDebt(String customerID) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = DBQueryGenerator.selectAllQuery(CustDebt.class.getSimpleName());
        ResultSet resultSet = DBHandler.getData(connection, sql,new Object[]{customerID});
        resultSet.next();
        return resultSet.getInt(CustDebt.AMOUNT);
    }

    public static ArrayList<CustPayment> getPaymentInfo() throws ClassNotFoundException, SQLException{
        ArrayList<CustPayment> CustPayment=new ArrayList<>();
        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = DBQueryGenerator.selectAllQuery("CustPayment");
        ResultSet data = DBHandler.getData(connection, sql);
        data.next();
        CustPayment cp;
        while(data.next()){
            cp=new CustPayment();
            cp.setPaymentId(data.getString("paymentId"));
            cp.setAmount(data.getDouble("amount"));
            cp.setDate(data.getDate("date").toString());
            cp.setDiscount(data.getFloat("discount"));
            cp.setType(data.getString("type"));
            cp.setCustomerId(data.getString("customerId"));
            CustPayment.add(cp);
        }
        
        return CustPayment;
        
    }
    public static boolean addPaymentInfo(CustPayment custPayment) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getDBConnection().getConnection();  
        String paymentId=custPayment.getPaymentId();
        String customerId=custPayment.getCustomerId();
        String type=custPayment.getType();
        double discount=custPayment.getDiscount();
        double amount=custPayment.getAmount();
        String date=custPayment.getDate();
        
        System.out.println(type);
        
        try{
            connection.setAutoCommit(false);
            String sqlAddPayment=DBQueryGenerator.insertQuery(CustPayment.class.getSimpleName(), 6);
            int rowsAffected=DBHandler.setData(connection, sqlAddPayment, new Object[]{paymentId,customerId,type,amount,discount,date});    
            if (rowsAffected>0) {
                // Success
                connection.commit();
                return true;
            }else{
               connection.rollback();      //if error then roll back
               return false;
            }
            
        } catch (Exception e) {
            connection.rollback();      //if error then roll back
            throw e;
        } finally {
            connection.setAutoCommit(true);     //enabling auto commit
        }
        
    }   
}
