
package com.mycompany.bikecontrol.Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Connection conn;
    private static String Driver = "com.mysql.jdbc.Driver";
    private static String user = "Daniel";
    private static String pass = "1234567890";
    private static String url = "jdbc:mysql://localhost:3306/BCDAA";
    
    public Conexion(){
        conn = null;
        try{
            Class.forName(Driver);
            conn = DriverManager.getConnection(url, user, pass);
            if(conn!=null){
                System.out.println("Conexión establecida");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error conectando " +e.getMessage()); 
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public void close(){
        conn = null;
        System.out.println("Conexión cerrada");
    }
    
    
}
