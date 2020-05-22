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
    int num_tarjeta;
    double limite_retirada;
    double limite_pagoOnline;
    ArrayList movimiento[];
    static ArrayList<Tarjeta> tarjetas= new ArrayList <>();

    public Tarjeta(int numero, double limite_retirada, double limite_pagoOnline) {
        this.num_tarjeta=numero;
        this.limite_retirada = limite_retirada;
        this.limite_pagoOnline = limite_pagoOnline;
    }

    public int getNum_tarjeta() {
        return num_tarjeta;
    }

    public void setNum_tarjeta(int num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }

    public double getLimite_retirada() {
        return limite_retirada;
    }

    public void setLimite_retirada(double limite_retirada) {
        this.limite_retirada = limite_retirada;
    }

    public double getLimite_pagoOnline() {
        return limite_pagoOnline;
    }

    public void setLimite_pagoOnline(double limite_pagoOnline) {
        this.limite_pagoOnline = limite_pagoOnline;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "num_tarjeta=" + num_tarjeta + ", limite_retirada=" + limite_retirada + ", limite_pagoOnline=" + limite_pagoOnline + ", movimiento=" + movimiento + '}';
    }   
    
}
