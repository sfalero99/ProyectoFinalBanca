/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalbanca;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class Cliente{
    String login;
    String password;
    String nombre;
    String apellidos;
    String direccion;
    String DNI;
    String telefono;
    int edad;
    ArrayList<Cliente> clientes = new ArrayList<> ();
    ArrayList<Cuenta> cuentas = new ArrayList<> ();
    
    public Cliente(String login, String password, String nombre, String apellidos, String direccion, String DNI, String telefono, int edad) {
        this.login = login;
        this.password = password;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.DNI = DNI;
        this.telefono = telefono;
        this.edad = edad;
    }

    
    
    @Override
    public String toString() {
        return "login=" + login + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", DNI=" + DNI + ", telefono=" + telefono + ", edad=" + edad + '}';
    }

       
    
    
    
}
