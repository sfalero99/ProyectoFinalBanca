/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalbancatest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import proyectofinalbanca.*;

/**
 * Clase para realizar todos los tests y comprobar que todo esta correcto.
 * 
 * @author Sergio
 * @version 1.0
 */
public class ProyectoFinalBancaTest {
    
    public ProyectoFinalBancaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    
    /**
     * PRUEBAS CLASE CLIENTE
     */
    /**
     * Se ingresa dinero en cada una de las cuentas, para la cuenta 1 se ingresa 
     * un valor y para la segunda se hace el ingreso dos veces para comprobar que 
     * no se queda bloqueado de alguna forma y simplemente suma los dos valores. 
     * Se comprueba si el valor final es el que tiene que ser y también se comprueba 
     * si es falso que el saldo sea 0 o sea uno de los ingresos parciales.
     */
    @Test
    public void clienteIngresar() {
        Cuenta cuenta0 = new Cuenta (1234,500);
        Cuenta cuenta1 = new Cuenta (2541, 1000, 500);
        
        Cuenta.cuentas.add(cuenta0);
        Cuenta.cuentas.add(cuenta1);
        
        Cliente.Ingresar(500, 0);
        Cliente.Ingresar(25, 0);
        Cliente.Ingresar(100, 1);        
                
        assertTrue(Cuenta.cuentas.get(0).getSaldo() == 525);
        assertFalse(Cuenta.cuentas.get(0).getSaldo() == 500);
        assertFalse(Cuenta.cuentas.get(0).getSaldo() == 0);        
        
        assertTrue(Cuenta.cuentas.get(1).getSaldo() == 1100);
        assertFalse(Cuenta.cuentas.get(1).getSaldo() == 100);
        assertFalse(Cuenta.cuentas.get(1).getSaldo() == 0); 
        Cuenta.cuentas.clear();
    }
    
   /**
    * Se retira dinero una sola vez de una cuenta y de la otra se encadenan dos 
    * retiradas. En el primer caso se retira mas de lo que hay en la cuenta para 
    * provocar el error Saldo insuficiente al comprobar el saldo, por lo tanto, 
    * el estado de esa cuenta debería ser el inicial, sin modificar nada, y de 
    * la otra se comprueba si es lo que tiene que ser, es alguno de los parciales 
    * o no se ha modificado.
    */
    @Test
    public void clienteRetirar() {   
        Cuenta cuenta1 = new Cuenta (1234,525, 500);
        Cuenta cuenta2 = new Cuenta (2541, 1100, 500);
        
        Cuenta.cuentas.add(cuenta1);
        Cuenta.cuentas.add(cuenta2);
        
        Cliente.Retirar(550, 0);
        Cliente.Retirar(200, 1);
        Cliente.Retirar(500, 1);
                
        assertTrue(Cuenta.cuentas.get(0).getSaldo() == 525);
        assertFalse(Cuenta.cuentas.get(0).getSaldo() == 0);
        assertFalse(Cuenta.cuentas.get(0).getSaldo() == -25);
        
        assertTrue(Cuenta.cuentas.get(1).getSaldo() == 400);
        assertFalse(Cuenta.cuentas.get(1).getSaldo() == 900);
        assertFalse(Cuenta.cuentas.get(1).getSaldo() == 600);
        assertFalse(Cuenta.cuentas.get(1).getSaldo() == 1100);
        Cuenta.cuentas.clear();
    }     
        
    
    
    /**
     * PRUEBAS CLASE GESTOR
     */
    /**
     * Se genera dos clientes nuevos con todos sus datos y luego se compara si 
     * cada uno tiene el login tiene que tener y después se comprueba que algunos 
     * de los valores del primer cliente sean correctos.
     */
    @Test
    public void gestorCrearPerfil(){
        Gestor.CrearPerfil("sfalero99", "12345", "Sergio", "Falero Montero", "Av. America, 25", "12345678B", "912345678", 21);
        Gestor.CrearPerfil("agustin342", "54321", "Agustin", "Garcia Perez", "Av. America, 12", "98745632J", "987654321", 26);
        
        
        assertTrue(Cliente.clientes.get(0).getLogin().equals("sfalero99"));
        assertFalse(Cliente.clientes.get(0).getLogin().equals("agustin342"));
        assertFalse(Cliente.clientes.get(1).getLogin().equals("sfalero99"));
        assertTrue(Cliente.clientes.get(1).getLogin().equals("agustin342"));
        assertTrue(Cliente.clientes.get(0).getNombre().equals("Sergio"));
        assertTrue(Cliente.clientes.get(0).getDNI().equals("12345678B"));
        assertTrue(Cliente.clientes.get(0).getEdad() == 21);
        
    }
    
    /**
     * Se crean dos nuevas cuentas, una con cada uno de las dos formas posibles, 
     * con saldo y sin saldo, luego se comprueba que los números de cuenta de cada 
     * uno de ellas esta correcto y se comprueba que el saldo se ha añadido 
     * correctamente recordando que el saldo de la forma sin saldo es igual a 0. 
     * Se comprueba también que el limite de las dos cuentas está correcto. 
     */
    @Test
    public void gestorCrearCuenta(){
        Gestor.CrearCuenta(1235, 500, 500);
        Gestor.CrearCuenta_v2(2541, 500);
        
        assertTrue(Cuenta.cuentas.get(0).getNum_cuenta() == 1235);
        assertTrue(Cuenta.cuentas.get(1).getNum_cuenta() == 2541);
        assertTrue(Cuenta.cuentas.get(0).getSaldo() == 500);
        assertFalse(Cuenta.cuentas.get(0).getSaldo() == 0);
        assertTrue(Cuenta.cuentas.get(1).getSaldo() == 0);
        assertFalse(Cuenta.cuentas.get(1).getSaldo() == 500);
        assertTrue(Cuenta.cuentas.get(0).getLimite() == 500 && Cuenta.cuentas.get(1).getLimite()==500);
        Cuenta.cuentas.clear();
    }

    /**
     * Crea dos tarjetas con distintos datos y luego los compara uno a uno para 
     * cada tarjeta.
     */
    @Test
    public void gestorCrearTarjeta(){
        Gestor.CrearTarjeta(987465, 500, 250);
        Gestor.CrearTarjeta(369854, 1000, 500);
        
        assertTrue(Tarjeta.tarjetas.get(0).getNum_tarjeta() == 987465);
        assertTrue(Tarjeta.tarjetas.get(1).getNum_tarjeta() == 369854);
        assertTrue(Tarjeta.tarjetas.get(0).getLimite_retirada() == 500);
        assertTrue(Tarjeta.tarjetas.get(1).getLimite_retirada() == 1000);
        assertTrue(Tarjeta.tarjetas.get(0).getLimite_pagoOnline() == 250);
        assertTrue(Tarjeta.tarjetas.get(1).getLimite_pagoOnline() == 500);        
    }
    
    /**
     * Se insertan todos los datos del cliente modificando algunos datos los cuales 
     * luego son comparados para confirmar el cambio correctamente. Después se 
     * vuelve a modificar el mismo usuario, pero esta vez indicando mal la posición 
     * del array, en este caso al comprobar que el login no coincide, no debería 
     * cambiar ningún dato y mostrar el mensaje de login incorrecto. Se realiza la 
     * prueba para confirmar que la contraseña no ha cambiado, pero también se revisa 
     * que no haya cambiado por error la contraseña del otro usuario. 
     */
    @Test
    public void gestorModificarPerfil(){
        Gestor.ModificarPerfil(0, "sfalero99", "987465", "Sergio", "Falero Montero", "Calle del Sol, 12", "12345678B", "601545365", 22);
        
        assertTrue(Cliente.clientes.get(0).getLogin().equals("sfalero99"));
        assertTrue(Cliente.clientes.get(0).getPassword().equals("987465"));
        assertTrue(Cliente.clientes.get(0).getDireccion().equals("Calle del Sol, 12"));
        assertFalse(Cliente.clientes.get(0).getDireccion().equals("Av. America, 25"));
        assertTrue(Cliente.clientes.get(0).getEdad() == 22);
        assertFalse(Cliente.clientes.get(0).getEdad() == 21);
        
        Gestor.ModificarPerfil(1, "sfalero99", "123456", "Sergio", "Falero Montero", "Calle del Sol, 12", "12345678B", "601545365", 22);
        assertFalse(Cliente.clientes.get(0).getPassword().equals("123456"));
        assertTrue(Cliente.clientes.get(0).getPassword().equals("987465"));
        assertFalse(Cliente.clientes.get(1).getPassword().equals("123456"));
        assertTrue(Cliente.clientes.get(1).getPassword().equals("54321"));
    }
    
    
    /**
     * PRUEBAS CLASE CUENTA
     */
    /**
     * Se le añade una cuenta y se realizan pruebas para comprobar si devuelve 
     * true o false según le pidamos dinero
     */
    @Test
    public void cuentaComprobarSaldo(){
        Cuenta cuenta0 = new Cuenta (1234, 1000, 500);          
        Cuenta.cuentas.add(cuenta0);
        
        assertTrue(Cuenta.comprobarSaldo(1000, 0));
        assertTrue(Cuenta.comprobarSaldo(500, 0));
        assertFalse(Cuenta.comprobarSaldo(1001, 0));
        assertFalse(Cuenta.comprobarSaldo(2500, 0));
        Cuenta.cuentas.clear();
    }    
}
