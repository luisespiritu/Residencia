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
public class DetallPersonal {
    private int iddetallepersonal;
    private int cantpagada;
    private int descuento;

    public DetallPersonal() {
    }

    public DetallPersonal(int iddetallepersonal, int cantpagada, int descuento) {
        this.iddetallepersonal = iddetallepersonal;
        this.cantpagada = cantpagada;
        this.descuento = descuento;
    }

    public int getIddetallepersonal() {
        return iddetallepersonal;
    }

    public void setIddetallepersonal(int iddetallepersonal) {
        this.iddetallepersonal = iddetallepersonal;
    }

    public int getCantpagada() {
        return cantpagada;
    }

    public void setCantpagada(int cantpagada) {
        this.cantpagada = cantpagada;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
}
