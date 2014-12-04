/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemas.DTO;

import java.sql.Date;

/**
 *
 * @author LUCHITO
 */
public class Permiso {
    private int idperm;
    private int idpad;
    private int idinter;
    private int idperson;
    private String fechasalida;
    private String Horasalida;
    private String lugar;
    private String tipopermiso;
     private String fecharetorno;
     private String Horaretorno;

    public Permiso() {
    }

    public Permiso(int idperm, int idpad, int idinter, int idperson, String fechasalida, String Horasalida, String lugar, String tipopermiso, String fecharetorno, String Horaretorno) {
        this.idperm = idperm;
        this.idpad = idpad;
        this.idinter = idinter;
        this.idperson = idperson;
        this.fechasalida = fechasalida;
        this.Horasalida = Horasalida;
        this.lugar = lugar;
        this.tipopermiso = tipopermiso;
        this.fecharetorno = fecharetorno;
        this.Horaretorno = Horaretorno;
    }

    public int getIdperm() {
        return idperm;
    }

    public void setIdperm(int idperm) {
        this.idperm = idperm;
    }

    public int getIdpad() {
        return idpad;
    }

    public void setIdpad(int idpad) {
        this.idpad = idpad;
    }

    public int getIdinter() {
        return idinter;
    }

    public void setIdinter(int idinter) {
        this.idinter = idinter;
    }

    public int getIdperson() {
        return idperson;
    }

    public void setIdperson(int idperson) {
        this.idperson = idperson;
    }

    public String getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }

    public String getHorasalida() {
        return Horasalida;
    }

    public void setHorasalida(String Horasalida) {
        this.Horasalida = Horasalida;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTipopermiso() {
        return tipopermiso;
    }

    public void setTipopermiso(String tipopermiso) {
        this.tipopermiso = tipopermiso;
    }

    public String getFecharetorno() {
        return fecharetorno;
    }

    public void setFecharetorno(String fecharetorno) {
        this.fecharetorno = fecharetorno;
    }

    public String getHoraretorno() {
        return Horaretorno;
    }

    public void setHoraretorno(String Horaretorno) {
        this.Horaretorno = Horaretorno;
    }

    
    

}