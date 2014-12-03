/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.DTO;

/**
 *
 * @author Wild
 */
public class Interno {
    private int idInterno;
     private int idResidencia;
      private int idPadre;
    private String nombre;
    private String apellidos;
    private String codigo;
    private String lugar;

    public Interno() {
    }

    public Interno(int idInterno, int idResidencia, int idPadre, String nombre, String apellidos, String codigo, String lugar) {
        this.idInterno = idInterno;
        this.idResidencia = idResidencia;
        this.idPadre = idPadre;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.lugar = lugar;
    }

    public int getIdInterno() {
        return idInterno;
    }

    public void setIdInterno(int idInterno) {
        this.idInterno = idInterno;
    }

    public int getIdResidencia() {
        return idResidencia;
    }

    public void setIdResidencia(int idResidencia) {
        this.idResidencia = idResidencia;
    }

    public int getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(int idPadre) {
        this.idPadre = idPadre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    
    
}
