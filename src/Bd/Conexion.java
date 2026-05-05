/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bd;

import java.sql.Connection;
import java.sql.DriverManager;



/**
 *
 * @author AGKF5ZZ
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    
    public static void main(String[] args) {
       
    }
    
        public  void Conexion()
        {
        String url2 = "jdbc:sqlite:./bds/app.db";
        try (Connection conn = DriverManager.getConnection(url2)) {
            if (conn != null) {
                System.out.println("Conexión exitosa a SQLite.");
                System.out.println("La ruta relativa es:" );
                System.getProperty(url2);   
            }
        } catch (SQLException e){
            System.out.println("Error al conectar con SQLite: " + e.getMessage());
            }
        }
        
        
      
}

    

