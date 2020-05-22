/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalbanca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Gestor{
    static Scanner sc = new Scanner (System.in);
    
    String login;
    String password;
    String nombre;
    String apellidos;    
    ArrayList<Gestor> gestores = new ArrayList<> ();
    
    public Gestor(String login, String password, String nombre, String apellidos) {
        this.login = login;
        this.password = password;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "login=" + login + ", nombre=" + nombre + ", apellidos=" + apellidos + " | Gestor";
    }
       
    
}
