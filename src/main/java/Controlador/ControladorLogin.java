/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloLogin;

/**
 *
 * @author hello
 */
public class ControladorLogin {
    public static int Login(String user, char []contra) {
        return ModeloLogin.Login(user, contra);
    }
}
