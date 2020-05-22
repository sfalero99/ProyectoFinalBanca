/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalbanca;

/**
 *
 * @author Sergio
 */
public class Cliente extends Usuario{
    
    String direccion;
    String DNI;
    String telefono;
    int edad;
    
    public Cliente(String login, String password, String nombre, String apellidos, String direccion, String DNI, String telefono, int edad) {
        super(login, password, nombre, apellidos);
        this.direccion = direccion;
        this.DNI = DNI;
        this.telefono = telefono;
        this.edad = edad;
    }
    
    
}
