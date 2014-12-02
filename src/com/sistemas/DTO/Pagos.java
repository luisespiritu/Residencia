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
public class Pagos {
    private int idpag;
    private int idinter;
    private double cantpag;
    private String fecha;
    private String motivo;

    public Pagos() {
    }

    public Pagos(int idpag, int idinter, double cantpag, String fecha, String motivo) {
        this.idpag = idpag;
        this.idinter = idinter;
        this.cantpag = cantpag;
        this.fecha = fecha;
        this.motivo = motivo;
    }

    public int getIdpag() {
        return idpag;
    }

    public void setIdpag(int idpag) {
        this.idpag = idpag;
    }

    public int getIdinter() {
        return idinter;
    }

    public void setIdinter(int idinter) {
        this.idinter = idinter;
    }

    public double getCantpag() {
        return cantpag;
    }

    public void setCantpag(double cantpag) {
        this.cantpag = cantpag;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
}
