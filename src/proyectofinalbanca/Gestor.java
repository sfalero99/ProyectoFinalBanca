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

    public void CrearPerfil(){
    
    }
    
    public void CrearCuenta(){
    
    }
    
    public void CrearTarjeta(){
    
    }
    
    public void ModificarPerfil(){
    
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    
    @Override
    public String toString() {
        return "login=" + login + ", nombre=" + nombre + ", apellidos=" + apellidos + " | Gestor";
    }
       
    
}
