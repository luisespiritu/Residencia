/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemas.DTO;

/**
 *
 * @author LUCHITO
 */
public class DPersonal {
    private int iddetallepersonal;
    private double cantipagada;
    private int descuento;

    public DPersonal() {
    }

    public DPersonal(int iddetallepersonal, double cantipagada, int descuento) {
        this.iddetallepersonal = iddetallepersonal;
        this.cantipagada = cantipagada;
        this.descuento = descuento;
    }

    public int getIddetallepersonal() {
        return iddetallepersonal;
    }

    public void setIddetallepersonal(int iddetallepersonal) {
        this.iddetallepersonal = iddetallepersonal;
    }

    public double getCantipagada() {
        return cantipagada;
    }

    public void setCantipagada(double cantipagada) {
        this.cantipagada = cantipagada;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

   

}