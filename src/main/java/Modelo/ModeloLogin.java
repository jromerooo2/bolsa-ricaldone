/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.ControladorConexion;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author hello
 */
public class ModeloLogin {
    public static String Login() throws Exception{
            Statement sql = ControladorConexion.getConection().createStatement();
            String base = "";
            String consulta = "SELECT Department FROM Departments" ;
            ResultSet res = sql.executeQuery(consulta);            
            while (res.next()) {
                base += res.getString(1) + "\n";                
            }
            
            return base;
    }
}
