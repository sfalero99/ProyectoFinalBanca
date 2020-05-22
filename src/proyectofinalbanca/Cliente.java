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
    static ArrayList<Cliente> clientes = new ArrayList<> ();
    
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

    public void Ingresar(double dinero, int cuenta){
        if (Cuenta.cuentas.size()<= cuenta){
            Cuenta.cuentas.get(cuenta).setSaldo(Cuenta.cuentas.get(cuenta).getSaldo()+dinero);
            System.out.println("Ingreso realizado");
        }else{
            System.out.println("Cuenta inexistente");
        }         
    }
    
    public void Retirar(double dinero, int cuenta){
        if(Cuenta.comprobarSaldo(dinero, cuenta)){
            Cuenta.cuentas.get(cuenta).setSaldo(Cuenta.cuentas.get(cuenta).getSaldo() - dinero);
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

        
    @Override
    public String toString() {
        return "login=" + login + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", DNI=" + DNI + ", telefono=" + telefono + ", edad=" + edad + '}';
    }  
}
