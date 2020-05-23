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
 *
 * @author Sergio
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
