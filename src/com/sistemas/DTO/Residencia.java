/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.DTO;

/**
 *
 * @author Miryam
 */
public class Residencia {
    private int idresidencia;
    private int cantpersonas;
    private int nhabitaciones;

    public Residencia() {
    }

    public Residencia(int idresidencia, int cantpersonas, int nhabitaciones) {
        this.idresidencia = idresidencia;
        this.cantpersonas = cantpersonas;
        this.nhabitaciones = nhabitaciones;
    }

    public int getIdresidencia() {
        return idresidencia;
    }

    public void setIdresidencia(int idresidencia) {
        this.idresidencia = idresidencia;
    }

    public int getCantpersonas() {
        return cantpersonas;
    }

    public void setCantpersonas(int cantpersonas) {
        this.cantpersonas = cantpersonas;
    }

    public int getNhabitaciones() {
        return nhabitaciones;
    }

    public void setNhabitaciones(int nhabitaciones) {
        this.nhabitaciones = nhabitaciones;
    }
    
    
    
    
}
