/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalbanca;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Clase para almacenar todos los datos acerca de la cuenta del cliente con su
 * metodo para comprobar el saldo.
 * 
 * @author Sergio
 * @version 1.0
 */
public class Cuenta {
    int num_cuenta;
    double saldo;
    double limite;
    LocalDate fecha_apertura;
    double saldo_medio;    
    public static ArrayList<Cuenta> cuentas = new ArrayList<> ();
    
    /**
     * Constructor 1 de la clase Cuenta para establecer el saldo inicial
     * 
     * @param numero Numero de cuenta
     * @param saldo Saldo inicial
     * @param limite Limite para las operaciones de la cuenta
     */
    public Cuenta(int numero, double saldo, double limite) {
        this.num_cuenta=numero;
        this.saldo = saldo;
        this.limite = limite;
        this.fecha_apertura = LocalDate.now();
    }
    
    /**
     * Constructor 2 de la clase Cuenta sin el saldo inicial
     * 
     * @param numero Numero de cuenta
     * @param limite Limite para las operaciones de la cuenta
     */
    public Cuenta(int numero, double limite) {
        this.num_cuenta=numero;
        this.saldo = 0;
        this.limite = limite;
        this.fecha_apertura = LocalDate.now();
    }
    
    /**
     * Metodo para comprobar que hay saldo suficiente para la retirada de dinero
     * 
     * @param dinero Dinero a comprobar
     * @param cuenta Posicion de la cuenta en el arraylist
     * @return 
     */
    public static boolean comprobarSaldo(double dinero, int cuenta){
        if((cuentas.get(cuenta).saldo-dinero) >= 0){
            return true;
        }
        else return false;
    }
    
    /**
     * Devuelve el numero de cuenta
     * 
     * @return Num_cuenta
     */
    public int getNum_cuenta() {
        return num_cuenta;
    }

    /**
     * Establece el numero de cuenta
     * 
     * @param num_cuenta Num_cuenta
     */
    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta
     * 
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta
     * 
     * @param saldo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el limite de la cuenta
     * 
     * @return limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * Establece el limite de la cuenta
     * 
     * @param limite limite
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }

    /**
     * Devuelve la fecha de apertura de la cuenta
     * 
     * @return Fecha_apertura
     */
    public LocalDate getFecha_apertura() {
        return fecha_apertura;
    }

    /**
     * Establece la fecha de apertura de la cuenta
     * 
     * @param fecha_apertura Fecha_apertura
     */
    public void setFecha_apertura(LocalDate fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    /**
     * Devuelve el saldo medio de la cuenta a lo largo de 12 meses
     * 
     * @return saldo_medio
     */
    public double getSaldo_medio() {
        return saldo_medio;
    }

    /**
     * Establece el saldo medio de la cuenta
     * 
     * @param saldo_medio saldo_medio
     */
    public void setSaldo_medio(double saldo_medio) {
        this.saldo_medio = saldo_medio;
    }

    /**
     * Devuelve el toString de la clase Cuenta
     * 
     * @return toString clase Cuenta
     */
    @Override
    public String toString() {
        return "Cuenta{" + "num_cuenta=" + num_cuenta + ", saldo=" + saldo + ", limite=" + limite + ", fecha_apertura=" + fecha_apertura + ", saldo_medio=" + saldo_medio + '}';
    }    
}
