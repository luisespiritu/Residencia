/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.DTO;

/**
 *
 * @author Kiefer
 */
public class Inventario {
    private int idinventario;
    private int idresidencia;
    private int ropero;
    private int cama ;
    private int mesa ;
    private int silla;
    private int sabanas ;

    public Inventario() {
    }

    public Inventario(int idinventario, int idresidencia, int ropero, int cama, int mesa, int silla, int sabanas) {
        this.idinventario = idinventario;
        this.idresidencia = idresidencia;
        this.ropero = ropero;
        this.cama = cama;
        this.mesa = mesa;
        this.silla = silla;
        this.sabanas = sabanas;
    }

    public int getIdinventario() {
        return idinventario;
    }

    public void setIdinventario(int idinventario) {
        this.idinventario = idinventario;
    }

    public int getIdresidencia() {
        return idresidencia;
    }

    public void setIdresidencia(int idresidencia) {
        this.idresidencia = idresidencia;
    }

    public int getRopero() {
        return ropero;
    }

    public void setRopero(int ropero) {
        this.ropero = ropero;
    }

    public int getCama() {
        return cama;
    }

    public void setCama(int cama) {
        this.cama = cama;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

    public int getSabanas() {
        return sabanas;
    }

    public void setSabanas(int sabanas) {
        this.sabanas = sabanas;
    }
            
    
    
}
