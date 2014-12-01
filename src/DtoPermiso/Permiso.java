/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DtoPermiso;

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
    private String fecharetorno;
    private String lugar;
    private String tipopermiso;

    public Permiso() {
    }

    public Permiso(int idperm, int idpad, int idinter, int idperson, String fechasalida, String fecharetorno, String lugar, String tipopermiso) {
        this.idperm = idperm;
        this.idpad = idpad;
        this.idinter = idinter;
        this.idperson = idperson;
        this.fechasalida = fechasalida;
        this.fecharetorno = fecharetorno;
        this.lugar = lugar;
        this.tipopermiso = tipopermiso;
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

    public String getFecharetorno() {
        return fecharetorno;
    }

    public void setFecharetorno(String fecharetorno) {
        this.fecharetorno = fecharetorno;
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

   
    }

   