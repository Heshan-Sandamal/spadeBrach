/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.d2s2.spade.controllers.item;

import com.d2s2.spade.dbconnection.DBConnection;
import com.d2s2.spade.dbconnection.DBHandler;
import com.d2s2.spade.dbconnection.DBQueryGenerator;
import com.d2s2.spade.models.Kiyath;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Heshan Sandamal
 */
public class KiyathController {

    public static boolean addItem(Kiyath kiyath) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = DBQueryGenerator.insertQuery(Kiyath.class.getSimpleName(), 3);


        try {
            connection.setAutoCommit(false);

            Object[] ob = new Object[]{kiyath.getCode(), kiyath.getSize(), kiyath.getNoOfTips()};
            boolean itemDetailAdded = ItemController.addItem(kiyath);
            if (itemDetailAdded) {
                boolean kiyathAdded = DBHandler.setData(connection, sql, ob) > 0 ? true : false;
                if (kiyathAdded) {
                    connection.commit();
                    return true;
                } else {
                    connection.rollback();
                    return false;
                }

            } else {
                connection.rollback();
                return false;
            }

        } catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }


    }

    public static Kiyath getDetailsOfItem(String code) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = DBQueryGenerator.selectLimitedColumnswhereQuery(new String[]{Kiyath.SIZE, Kiyath.NOOFTIPS}, Kiyath.class.getSimpleName(), Kiyath.CODE);
        ResultSet data = DBHandler.getData(connection, sql, new Object[]{code});
        data.next();
        return new Kiyath(data.getString(Kiyath.SIZE), data.getInt(Kiyath.NOOFTIPS));
    }
    
    
    public static boolean updateItem(Kiyath kiyath) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = DBQueryGenerator.updateQuery(new String[]{Kiyath.SIZE,Kiyath.NOOFTIPS},Kiyath.class.getSimpleName(), Kiyath.CODE);


        try {
            connection.setAutoCommit(false);

            Object[] ob = new Object[]{kiyath.getSize(), kiyath.getNoOfTips(), kiyath.getCode()};
            boolean itemDetailAdded = ItemController.updateItem(kiyath);
            if (itemDetailAdded) {
                boolean kiyathAdded = DBHandler.setData(connection, sql, ob) > 0 ? true : false;
                if (kiyathAdded) {
                    connection.commit();
                    return true;
                } else {
                    connection.rollback();
                    return false;
                }

            } else {
                connection.rollback();
                return false;
            }

        } catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    
    }

    public static String getCodeOfItem(String supplierId,String itemCode,String brandId,String kiyathSize, String kiyathTips)throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = DBQueryGenerator.selectLimitedColumnswhereQueryWIthLike(new String[]{Kiyath.CODE}, Kiyath.class.getSimpleName(),new String[]{Kiyath.SIZE, Kiyath.NOOFTIPS},Kiyath.CODE);
        String like=itemCode+":"+brandId+":"+supplierId+":%";
        System.out.println(sql +" "+like);
        ResultSet data = DBHandler.getData(connection, sql, new Object[]{kiyathSize,kiyathTips,like});
        data.next();
        return data.getString(Kiyath.CODE);
    }

    public static ArrayList<Kiyath> getKiyathDetailsForCombo(String code) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql=DBQueryGenerator.selectLimitedColumnLikeQuery(new String[]{Kiyath.SIZE}, Kiyath.class.getSimpleName(),Kiyath.CODE);
        System.out.println(sql+code);
         final ResultSet data = DBHandler.getData(connection, sql, new Object[]{code+"%"});
        ArrayList<Kiyath> l = new ArrayList<Kiyath>();
        
        while (data.next()) {
            l.add(new Kiyath() {
                {
                    setSize(data.getString(Kiyath.SIZE));
                }
            });
        }

        return l;
        
    }
    
    
     public static ArrayList<Kiyath> getKiyathDetailsForTipsCombo(String code,String size) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql=DBQueryGenerator.selectLimitedColumnswhereQueryWIthLike(new String[]{Kiyath.SIZE}, Kiyath.class.getSimpleName(),new String[]{Kiyath.SIZE},Kiyath.CODE);
        System.out.println(sql+code);
         final ResultSet data = DBHandler.getData(connection, sql, new Object[]{size,code+"%"});
        ArrayList<Kiyath> l = new ArrayList<Kiyath>();
        
        while (data.next()) {
            l.add(new Kiyath() {
                {
                    setSize(data.getString(Kiyath.SIZE));
                }
            });
        }

        return l;
        
    }
    
    
}
