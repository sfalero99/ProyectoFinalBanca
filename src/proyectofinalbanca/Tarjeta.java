/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalbanca;

import java.util.ArrayList;
/**
 *  Clase con todos los atributos de la tarjeta.
 * 
 * @author Sergio
 * @version 1.0
 */
public class Tarjeta {
    int num_tarjeta;
    double limite_retirada;
    double limite_pagoOnline;
    ArrayList movimiento[];
    public static ArrayList<Tarjeta> tarjetas= new ArrayList <>();

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
     * Devuelve el numero de la tarjeta
     * 
     * @return Num_tarjeta
     */
    public int getNum_tarjeta() {
        return num_tarjeta;
    }

    /**
     * Establece el numero de la tarjeta
     * 
     * @param num_tarjeta Num_tarjeta
     */
    public void setNum_tarjeta(int num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }

    /**
     * Devuelve el limite de retirada y de operacion de la tarjeta
     * 
     * @return Limite_retirada
     */
    public double getLimite_retirada() {
        return limite_retirada;
    }

    /**
     * Establece el limite de retirada y de operacion de la tarjeta
     * 
     * @param limite_retirada Limite_retirada
     */
    public void setLimite_retirada(double limite_retirada) {
        this.limite_retirada = limite_retirada;
    }

    /**
     * Devuelve el limite para el pago online
     * 
     * @return Limite_pagoOnline
     */
    public double getLimite_pagoOnline() {
        return limite_pagoOnline;
    }

    /**
     * Establece el limite para el pago online
     * 
     * @param limite_pagoOnline Limite_pagoOnline
     */
    public void setLimite_pagoOnline(double limite_pagoOnline) {
        this.limite_pagoOnline = limite_pagoOnline;
    }

    /**
     * Devuelve el toString de la clase Tarjeta
     * 
     * @return toString clase Tarjeta
     */
    @Override
    public String toString() {
        return "Tarjeta{" + "num_tarjeta=" + num_tarjeta + ", limite_retirada=" + limite_retirada + ", limite_pagoOnline=" + limite_pagoOnline + ", movimiento=" + movimiento + '}';
    }
}
