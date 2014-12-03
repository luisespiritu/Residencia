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
public class Reserva {
    private int idreserva;
    private int idresidencia;
    private int idinterno;
    private String fechareserva;
    private String fechainicio;
    private String fechafin;
    private String  estado;
    private int numpersonas;

    public Reserva() {
    }

    public Reserva(int idreserva, int idresidencia, int idinterno, String fechareserva, String fechainicio, String fechafin, String estado, int numpersonas) {
        this.idreserva = idreserva;
        this.idresidencia = idresidencia;
        this.idinterno = idinterno;
        this.fechareserva = fechareserva;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.estado = estado;
        this.numpersonas = numpersonas;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public int getIdresidencia() {
        return idresidencia;
    }

    public void setIdresidencia(int idresidencia) {
        this.idresidencia = idresidencia;
    }

    public int getIdinterno() {
        return idinterno;
    }

    public void setIdinterno(int idinterno) {
        this.idinterno = idinterno;
    }

    public String getFechareserva() {
        return fechareserva;
    }

    public void setFechareserva(String fechareserva) {
        this.fechareserva = fechareserva;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumpersonas() {
        return numpersonas;
    }

    public void setNumpersonas(int numpersonas) {
        this.numpersonas = numpersonas;
    }
    
    
    
    
}
