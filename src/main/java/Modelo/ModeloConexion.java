/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author hello
 */
public class ModeloConexion {
    
    Connection conectar = null;
    
    public static Connection Conectar() {
            String user = "sa",bd="bolsaFinal",ip="localhost",puerto="1433";
            Connection conectar = null;
        try {
            String url = "jdb:sqlserver://localhost:"+puerto+";"+"databaseName="+bd;
            conectar = DriverManager.getConnection(url);
            JOptionPane.showMessageDialog(null, "Se conecto correctamente");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "No se pudo conectar " + e.getMessage());
        }
        return conectar;
    }
}
