/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.DTO;



/**
 *
 * @author alum.fial7
 */
public class Privilegio {
    private int idprivilegios;
    private int idrol;
    private String nombre_privilegio;
    private String acceso;

    public Privilegio() {
    }

    public Privilegio(int idprivilegios, int idrol, String nombre_privilegio, String acceso) {
        this.idprivilegios = idprivilegios;
        this.idrol = idrol;
        this.nombre_privilegio = nombre_privilegio;
        this.acceso = acceso;
    }

    public int getIdprivilegios() {
        return idprivilegios;
    }

    public void setIdprivilegios(int idprivilegios) {
        this.idprivilegios = idprivilegios;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getNombre_privilegio() {
        return nombre_privilegio;
    }

    public void setNombre_privilegio(String nombre_privilegio) {
        this.nombre_privilegio = nombre_privilegio;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }
    
    
}
