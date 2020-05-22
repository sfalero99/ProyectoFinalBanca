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
public abstract class Usuario {
    String login;
    String password;
    String nombre;
    String apellidos;

    public Usuario(String login, String password, String nombre, String apellidos) {
        this.login = login;
        this.password = password;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }   
    
}
