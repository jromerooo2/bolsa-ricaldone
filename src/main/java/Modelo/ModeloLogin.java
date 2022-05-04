/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author hello
 */
public class ModeloLogin {
    public static int Login(String user, char [] pass){
        return "".equals(user) ? 2:1;
    }
}
