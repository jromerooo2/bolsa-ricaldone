/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hello
 */
public class ModeloConexion {    
    public static Connection Conectar() throws Exception {
        String url = "jdbc:sqlserver://localhost:1433;"
                + "database=bolsaFinal;"
                + "user=sa;"
                + "password=Kevin123;"
                +"encrypt=true;trustServerCertificate=true";
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException e) {
             System.out.println(e.toString());
             return null;
        }
    }
}
