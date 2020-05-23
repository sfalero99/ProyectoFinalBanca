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
public class Gestor{
    String login;
    String password;
    String nombre;
    String apellidos;    
    ArrayList<Gestor> gestores = new ArrayList<> ();
    
    /**
     * Constructor de la clase Gestor
     * 
     * @param login Login de usuario para el inicio de sesion
     * @param password Contraseña para el acceso del usuario
     * @param nombre Nombre del usuario
     * @param apellidos Apellido del usuario
     */
    public Gestor(String login, String password, String nombre, String apellidos) {
        this.login = login;
        this.password = password;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    /**
     * Metodo para crear un nuevo usuario
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
    
    /**
     * Metodo para la creacion de una nueva cuenta con el saldo
     * 
     * @param numero Numero de cuenta
     * @param saldo Saldo inicial de la cuenta
     * @param limite Limite para las operaciones de la cuenta
     */
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
    
    /**
     * Metodo para la creacion de una nueva cuenta sin el saldo
     * 
     * @param numero Numero de cuenta
     * @param limite Limite para las operaciones de la cuenta
     */
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
    
    /**
     * Metodo para la creacion de una nueva tarjeta
     * 
     * @param numero Numero de la tarjeta
     * @param limite_retirada Limite de retirada o pagos mediante la tarjeta
     * @param limite_pagoOnline Limite de pagos por internet
     */
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
    
    /**
     * Metodo para modificar el perfil de un usuario
     * 
     * @param numero Posicion del usuario en el arraylist
     * @param login Login de usuario para el inicio de sesion
     * @param password Contraseña para el acceso del usuario
     * @param nombre Nombre del usuario
     * @param apellidos Apellido del usuario
     * @param direccion Direccion del usuario
     * @param DNI Documento Nacional de Identidad del usuario
     * @param telefono Telefono personal del usuario
     * @param edad Edad del usuario
     */
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
    
    /**
     * 
     * @return Devuelve el login del usuario.
     */
    public String getLogin() {
        return login;
    }

    /**
     * 
     * @param login Establece el login del usuario.
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
     * @return Devuelve el toString de la clase Gestor
     */
    @Override
    public String toString() {
        return "login=" + login + ", nombre=" + nombre + ", apellidos=" + apellidos + " | Gestor";
    }
}
