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
     * 
     * @return Devuelve el login del usuario.
     */
    public String getLogin() {
        return login;
    }

    /**
     * 
     * @param login Establece el login del usuario
     */
    public void setLogin(String login) {
        this.login = login;
    }
    
    /**
     * 
     * @return Devuelve la password del usuario.
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password Establece la password del usuario.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 
     * @return Devuelve el nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre Establece el nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return Devuelve los apellidos del usuario.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * 
     * @param apellidos Establece los apellidos del usuario.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * 
     * @return Devuelve la direccion fiscal del usuario.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * 
     * @param direccion Establece la direccion fiscal del usuario.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * 
     * @return Devuelve el DNI del usuario.
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * 
     * @param DNI Establece el DNI del usuario.
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * 
     * @return Devuelve el Telefono del usuario.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * 
     * @param telefono Establece el Telefono del usuario.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * 
     * @return Devuelve la edad del usuario.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * 
     * @param edad Establece la edad del usuario.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * 
     * @return Devuelve el toString de la clase Cliente sin mostrar la contraseña.
     */    
    @Override
    public String toString() {
        return "login=" + login + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", DNI=" + DNI + ", telefono=" + telefono + ", edad=" + edad + '}';
    }  
}
