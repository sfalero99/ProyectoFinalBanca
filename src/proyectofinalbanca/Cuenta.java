/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalbanca;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class Cuenta {
    int num_cuenta;
    double saldo;
    double limite;
    LocalDate fecha_apertura;
    double saldo_medio;
    static ArrayList<Tarjeta> tarjetas= new ArrayList <>();

    public Cuenta(int numero, double saldo, double limite) {
        this.num_cuenta=numero;
        this.saldo = saldo;
        this.limite = limite;
        this.fecha_apertura = LocalDate.now();
    }
    
    public Cuenta(int numero, double limite) {
        this.num_cuenta=numero;
        this.saldo = 0;
        this.limite = limite;
        this.fecha_apertura = LocalDate.now();
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public LocalDate getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(LocalDate fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public double getSaldo_medio() {
        return saldo_medio;
    }

    public void setSaldo_medio(double saldo_medio) {
        this.saldo_medio = saldo_medio;
    }
 
    
}
