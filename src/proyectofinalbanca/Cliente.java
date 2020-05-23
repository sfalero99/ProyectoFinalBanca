/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalbanca;

import java.util.ArrayList;
/**
 * Clase con todos los datos del cliente y las operaciones que puede realizar.
 * 
 * @author Sergio
 * @version 1.0
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
    public static ArrayList<Cliente> clientes = new ArrayList<> ();
    
    /**
     * Constructor de la clase Cliente
     * 
     * @param login Login de usuario para el inicio de sesion
     * @param password Contraseña para el acceso del usuario
     * @param nombre Nombre del usuario
     * @param apellidos Apellido del usuario
     * @param direccion Direccion del usuario
     * @param DNI Documento Nacional de Identidad del usuario
     * @param telefono Telefono personal del usuario
     * @param edad Edad del usuario
     */     
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

    /**
     * Metodo para ingresar dinero a la cuenta de un usuario
     * 
     * @param dinero Importe que el usuario quiere ingresar
     * @param cuenta La posicion de la cuenta en el array de cuentas
     */
    public static void Ingresar(double dinero, int cuenta){
        if (Cuenta.cuentas.size()>= cuenta){
            Cuenta.cuentas.get(cuenta).setSaldo(Cuenta.cuentas.get(cuenta).getSaldo()+dinero);
            System.out.println("Ingreso realizado");
        }else{
            System.out.println("Cuenta inexistente");
        }         
    }
    
    /**
     * Metodo para retirar dinero de la cuenta de un usuario
     * 
     * @param dinero Importe que el usuario quiere retirar
     * @param cuenta La posicion de la cuenta en el array de cuentas
     */
    public static void Retirar(double dinero, int cuenta){
        if(Cuenta.cuentas.size()>= cuenta){    
            if(Cuenta.comprobarSaldo(dinero, cuenta)){
                Cuenta.cuentas.get(cuenta).setSaldo(Cuenta.cuentas.get(cuenta).getSaldo() - dinero);
                System.out.println("Retirada de dinero completada con exito");
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Cuenta inexistente");
        }
    }    
    
    /**
     * Devuelve el login del usuario.
     * 
     * @return Login user
     */
    public String getLogin() {
        return login;
    }

    /**
     * Establece el login del usuario
     * 
     * @param login Login user
     */
    public void setLogin(String login) {
        this.login = login;
    }
    
    /**
     * Devuelve la password del usuario.
     * 
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece la password del usuario.
     * 
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Devuelve el nombre del usuario.
     * 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     * 
     * @param nombre nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve los apellidos del usuario.
     * 
     * @return apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del usuario.
     * 
     * @param apellidos apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Devuelve la direccion fiscal del usuario.
     * 
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la direccion fiscal del usuario.
     * 
     * @param direccion direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve el DNI del usuario.
     * 
     * @return DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Establece el DNI del usuario.
     * 
     * @param DNI DNI
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * Devuelve el Telefono del usuario.
     * 
     * @return Telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el Telefono del usuario.
     * 
     * @param telefono Telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve la edad del usuario.
     * 
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del usuario.
     * 
     * @param edad edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Devuelve el toString de la clase Cliente sin mostrar la contraseña.
     * 
     * @return toString clase Cliente
     */    
    @Override
    public String toString() {
        return "login=" + login + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", DNI=" + DNI + ", telefono=" + telefono + ", edad=" + edad + '}';
    }  
}
