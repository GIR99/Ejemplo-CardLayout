/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1;

import Bd.Conexion;

/**
 *
 * @author AGKF5ZZ
 */
public class Contructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Prueba de conexion a la bd
        System.out.println("Prueba de conexion");
        Conexion cn=new Conexion();
                cn.Conexion();
    }
    
}
