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
public class Tarjeta {
    double limite_retirada;
    double limite_pagoOnline;
    ArrayList movimiento[];

    public Tarjeta(double limite_retirada, double limite_pagoOnline) {
        this.limite_retirada = limite_retirada;
        this.limite_pagoOnline = limite_pagoOnline;
    }
    
    
}
