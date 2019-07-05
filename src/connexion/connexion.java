/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class connexion {
    private static String driver="com.mysql.jdbc.Driver";
    private static String serverName="";
    private static String port="";
    private static String database="";
    private static String url;
    private static String users;
    private static String password;
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        url = "http//"+serverName+":"+port+"/"+database;
        Class.forName(driver);
        connection = (Connection) DriverManager.getConnection(url, users, password);
        statement=connection.createStatement();
        resultSet=statement.executeQuery("SELECT * FROM personne");
        System.out.println(resultSet);
    }
    public static Connection getConnection() throws ClassNotFoundException,SQLException{
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/annuaire"+"?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC ","root","");
            return con;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
