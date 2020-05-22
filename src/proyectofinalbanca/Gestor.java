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

    public void CrearPerfil(String login, String password, String nombre, String apellidos, String direccion, String DNI, String telefono, int edad){
        boolean existe=false;
        for (int i = 0; i < Cliente.clientes.size(); i++) {
            if (Cliente.clientes.get(i).getLogin().equals(login)) existe = true;
        }
        if (!existe){
            Cliente newClient = new Cliente (login, password, nombre, apellidos, direccion, DNI, telefono, edad);
            Cliente.clientes.add(newClient);
        }else{
            System.out.println("Usuario ya existente");
        }
        
    }
    
    public void CrearCuenta(int numero, double saldo, double limite){
        boolean existe=false;
        for (int i = 0; i < Cuenta.cuentas.size(); i++) {
            if (Cuenta.cuentas.get(i).getNum_cuenta() == numero) existe = true;
        }
        if (!existe){
            Cuenta newCuenta = new Cuenta (numero, saldo, limite);
            Cuenta.cuentas.add(newCuenta);
        }else{
            System.out.println("Cuenta ya existente");
        }
    }
    
    public void CrearCuenta_v2(int numero, double limite){
        boolean existe=false;
        for (int i = 0; i < Cuenta.cuentas.size(); i++) {
            if (Cuenta.cuentas.get(i).getNum_cuenta() == numero) existe = true;
        }
        if (!existe){
            Cuenta newCuenta = new Cuenta (numero, limite);
            Cuenta.cuentas.add(newCuenta);
        }else{
            System.out.println("Cuenta ya existente");
        }
    }
    
    public void CrearTarjeta(int numero, double limite_retirada, double limite_pagoOnline){
        boolean existe=false;
        for (int i = 0; i < Tarjeta.tarjetas.size(); i++) {
            if (Tarjeta.tarjetas.get(i).getNum_tarjeta() == numero) existe = true;
        }
        if (!existe){
            Tarjeta newTarjeta = new Tarjeta (numero, limite_retirada, limite_pagoOnline);
            Tarjeta.tarjetas.add(newTarjeta);
        }else{
            System.out.println("Cuenta ya existente");
        }
    }
    
    public void ModificarPerfil(int numero, String login, String password, String nombre, String apellidos, String direccion, String DNI, String telefono, int edad){
        if(Cliente.clientes.size()<=numero){
            if(Cliente.clientes.get(numero).getLogin().equals(login)){
                Cliente.clientes.get(numero).setPassword(password);
                Cliente.clientes.get(numero).setNombre(nombre);
                Cliente.clientes.get(numero).setApellidos(apellidos);
                Cliente.clientes.get(numero).setDireccion(direccion);
                Cliente.clientes.get(numero).setDNI(DNI);
                Cliente.clientes.get(numero).setTelefono(telefono);
                Cliente.clientes.get(numero).setEdad(edad);  
            }else{
                System.out.println("Login incorrecto");
            }            
        }else{
            System.out.println("Cliente inexistente");
        }
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
