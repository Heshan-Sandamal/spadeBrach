/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.d2s2.spade.controllers.item;

import com.d2s2.spade.dbconnection.DBConnection;
import com.d2s2.spade.dbconnection.DBHandler;
import com.d2s2.spade.dbconnection.DBQueryGenerator;
import com.d2s2.spade.models.Item;
import com.d2s2.spade.models.ItemCategory;
import com.d2s2.spade.models.Kiyath;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Heshan Sandamal
 */
public class ItemController {
    
    public static boolean addItem(Item item) throws ClassNotFoundException, SQLException{
        Connection connection=DBConnection.getDBConnection().getConnection();
        String sql=DBQueryGenerator.insertQuery(Item.class.getSimpleName(), 6);
        
        String code=item.getCode();
        String itemCode=item.getItemCode();
        String subId=item.getSubId();
        String supplierId=item.getSupplierId();
        String brandId=item.getBrandId();
        String saleType=item.getSaleType();
        
        Object[] ob=new Object[]{code,itemCode,subId,brandId,supplierId,saleType};
        
        
        return DBHandler.setData(connection, sql,ob)>0 ? true:false;
    }
    
    public static String getLastSubId(Item item) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = "SELECT subId FROM Item WHERE itemCode=? and brandId=? and supplierId=? ORDER BY subId DESC LIMIT 1";
        Object[] ob=new Object[]{item.getItemCode(),item.getBrandId(),item.getSupplierId()};
        ResultSet resultSet = DBHandler.getData(connection, sql,ob);
        resultSet.next();
        return resultSet.getString(Item.SUBID);
    }
    
    
    public static ArrayList<Item> getAllItems()throws ClassNotFoundException, SQLException{
        
        Connection connection=DBConnection.getDBConnection().getConnection();
        String sql=DBQueryGenerator.selectAllQuery(Item.class.getSimpleName());
        ResultSet resultSet=DBHandler.getData(connection, sql);
        
        ArrayList<Item> itemList=new ArrayList<>();
        
        while(resultSet.next()){
            
            String code=resultSet.getString(Item.CODE);
            String brandId=resultSet.getString(Item.BRANDID);
            String supplierId=resultSet.getString(Item.SUPPLIERID);
            String subId=resultSet.getString(Item.SUBID);
            String itemCode=resultSet.getString(Item.ITEMCODE);
            String salesType=resultSet.getString(Item.TYPE);
            
            itemList.add(new Item(code,itemCode,subId,brandId,supplierId,salesType));     
        }
        
        return itemList;
    }

    public static boolean checkExistence(String code) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql =DBQueryGenerator.checkExistencywhereQuery(Item.class.getSimpleName(), Item.CODE);
        Object[] ob=new Object[]{code};
        ResultSet resultSet = DBHandler.getData(connection, sql,ob);
        resultSet.next();
        return resultSet.getInt("mycheck")==1 ? true:false;
    }

    static boolean updateItem(Item item) throws ClassNotFoundException, SQLException{
        Connection connection=DBConnection.getDBConnection().getConnection();
        String sql=DBQueryGenerator.updateQuery(new String[]{Item.TYPE},Item.class.getSimpleName(), Item.CODE);
        
        
        Object[] ob=new Object[]{item.getSaleType(),item.getCode()};
        
        
        return DBHandler.setData(connection, sql,ob)>0 ? true:false;
    }

    public static ArrayList<ItemCategory> getSupplierItems(String supplierId) throws ClassNotFoundException, SQLException{
        
        Connection connection=DBConnection.getDBConnection().getConnection();
        String sql=DBQueryGenerator.selectLimitedColumnswhereQuery(new String[]{"Distinct "+Item.ITEMCODE},Item.class.getSimpleName(),Item.SUPPLIERID);
        
        ResultSet resultSet=DBHandler.getData(connection, sql,new Object[]{supplierId});
        
        ArrayList<ItemCategory> itemList=new ArrayList<>();
        
        while(resultSet.next()){
            

            //final String brandId=resultSet.getString(Item.BRANDID);
            final String itemCode=resultSet.getString(Item.ITEMCODE);
            
            itemList.add(new ItemCategory(){{setItemCode(itemCode);
            }});     
        }
        
        return itemList;
    }

    public static ArrayList<Item> getSupplierItems(String supplierId, String categoryId) throws ClassNotFoundException, SQLException{
        
        Connection connection=DBConnection.getDBConnection().getConnection();
        String sql=DBQueryGenerator.selectLimitedColumnswhereQuery(new String[]{"Distinct "+Item.BRANDID},Item.class.getSimpleName(),new String[]{Item.SUPPLIERID,Item.ITEMCODE});
        System.out.println(sql);
        ResultSet resultSet=DBHandler.getData(connection, sql,new Object[]{supplierId,categoryId});
        
        ArrayList<Item> itemList=new ArrayList<>();
        
        while(resultSet.next()){
            

            //final String brandId=resultSet.getString(Item.BRANDID);
            final String brand=resultSet.getString(Item.BRANDID);
            
            itemList.add(new Item(){{setBrandId(brand);
            }});     
        }
        
        return itemList;
    }
    
}
