/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalbanca;

import java.time.LocalDate;

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
    
}
