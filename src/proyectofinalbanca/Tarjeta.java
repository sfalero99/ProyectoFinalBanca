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

    /**
     * Constructor de la clase Tarjeta
     * 
     * @param numero Numero de la tarjeta
     * @param limite_retirada Limite de retirada y de realizacion de pagos
     * @param limite_pagoOnline Limite al realizar pagos online
     */
    public Tarjeta(int numero, double limite_retirada, double limite_pagoOnline) {
        this.num_tarjeta=numero;
        this.limite_retirada = limite_retirada;
        this.limite_pagoOnline = limite_pagoOnline;
    }

    /**
     * 
     * @return Devuelve el numero de la tarjeta
     */
    public int getNum_tarjeta() {
        return num_tarjeta;
    }

    /**
     * 
     * @param num_tarjeta Establece el numero de la tarjeta
     */
    public void setNum_tarjeta(int num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }

    /**
     * 
     * @return Devuelve el limite de retirada y de operacion de la tarjeta
     */
    public double getLimite_retirada() {
        return limite_retirada;
    }

    /**
     * 
     * @param limite_retirada Establece el limite de retirada y de operacion de la tarjeta
     */
    public void setLimite_retirada(double limite_retirada) {
        this.limite_retirada = limite_retirada;
    }

    /**
     * 
     * @return Devuelve el limite para el pago online
     */
    public double getLimite_pagoOnline() {
        return limite_pagoOnline;
    }

    /**
     * 
     * @param limite_pagoOnline Establece el limite para el pago online
     */
    public void setLimite_pagoOnline(double limite_pagoOnline) {
        this.limite_pagoOnline = limite_pagoOnline;
    }

    /**
     * 
     * @return Devuelve el toString de la clase Tarjeta
     */
    @Override
    public String toString() {
        return "Tarjeta{" + "num_tarjeta=" + num_tarjeta + ", limite_retirada=" + limite_retirada + ", limite_pagoOnline=" + limite_pagoOnline + ", movimiento=" + movimiento + '}';
    }
}
