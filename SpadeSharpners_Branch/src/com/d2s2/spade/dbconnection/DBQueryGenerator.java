/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.d2s2.spade.dbconnection;


/**
 *
 * @author Heshan Sandamal
 */
public class DBQueryGenerator {
    
    
    
    public static String insertQuery(String tableName,int parameterCount){
        String sql="INSERT INTO "+tableName +" Values(";
        
        for (int i = 0; i < parameterCount; i++) {
            sql+="?";
            if(i!=parameterCount-1){
                sql+=",";
            }
            
        }
        return sql+")";
    }
    
    public static String selectAllQuery(String tableName){
        return "SELECT * FROM "+tableName;
    }
    
    public static String selectwhereQuery(String tableName, String columnName){
        return "SELECT * FROM "+tableName+" WHERE " +columnName+"= ?" ;
    }
    
    public static String selectLimitedColumnswhereQuery(String[] columns,String tableName, String beforeequal ){
        
        String a="SELECT ";
        for (int i = 0; i < columns.length; i++) {
            a+=columns[i];
            if(i!=columns.length-1){
                a+=",";
            }
        }
        return a+" FROM "+tableName+" WHERE " +beforeequal+"=?" ;
    }
    
    public static String checkExistencywhereQuery(String tableName, String beforeequal ){
        return "SELECT EXISTS(SELECT 1 FROM "+tableName+" WHERE " +beforeequal+"=?) AS mycheck" ;
    }
    public static String selectLimitedColumnsQuery(String[] columns,String tableName){
        
        String a="SELECT ";
        for (int i = 0; i < columns.length; i++) {
            a+=columns[i];
            if(i!=columns.length-1){
                a+=",";
            }
        }
        return a+" FROM "+tableName ;
    }
    
    public static String updateQuery(String[] columns,String tableName, String beforeequal ){
        
        String a="UPDATE "+tableName+" SET ";
        for (int i = 0; i < columns.length; i++) {
            a+=columns[i]+="=?";
            if(i!=columns.length-1){
                a+=",";
            }
            
        }
        return a+" WHERE " +beforeequal+"=?" ;
    }
    public static String deleteWhereQuery(String tableName,String columnName){
       
        return "DELETE  FROM "+tableName+" WHERE " +columnName+"= ?" ;
    }
    
    public static String deleteQuery(String tablename, String columnName){
        return "DELETE FROM " +tablename+ " WHERE " +columnName+ "=?";
    }
    public static String insertQueryBranch(String tableName){
        String sql="INSERT INTO "+tableName +" (supplierId,branchName,address,contactName,telNo)Values("+"?,"+"?,"+"?,"+"?,"+"?)";
        return sql;
        
    }

    public static String selectLimitedColumnswhereQuery(String[] columns, String tableName, String[] conditions) {
        String a="SELECT ";
        for (int i = 0; i < columns.length; i++) {
            a+=columns[i];
            if(i!=columns.length-1){
                a+=",";
            }
        }
        
        a=a+" FROM "+tableName+" WHERE " ;
        for (int i = 0; i < conditions.length; i++) {
            a+=conditions[i]+"=?";
            if(i!=conditions.length-1){
                a+=" and ";
            }
        }
        
        return a;
    }
    
    public static String selectLimitedColumnswhereQueryWIthLike(String[] columns, String tableName, String[] conditions,String like) {
        String a="SELECT ";
        for (int i = 0; i < columns.length; i++) {
            a+=columns[i];
            if(i!=columns.length-1){
                a+=",";
            }
        }
        
        a=a+" FROM "+tableName+" WHERE " ;
        for (int i = 0; i < conditions.length; i++) {
            a+=conditions[i]+"=? and ";
            
        }
        
        a+=like+" like ? ";
        
        return a;
    }

    public static String getLastIDQuery(String tableName, String columnName){
        String sql = "SELECT "+columnName+" FROM "+tableName+" ORDER BY "+columnName+" DESC LIMIT 1";
        
        return sql;
        

    }
    public static String selectLimitedColumnLikeQuery(String[] columns, String tableName, String like) {
         String a="SELECT distinct ";
        for (int i = 0; i < columns.length; i++) {
            a+=columns[i];
            if(i!=columns.length-1){
                a+=",";
            }
        }
        
        a=a+" FROM "+tableName+" WHERE " ;
       
        
        a+=like+" like ? ";
        
        return a;

    }
    
    
    
}
