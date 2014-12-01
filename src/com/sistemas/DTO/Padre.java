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
public class Padre {
    private int idpadre;
    private String nombres;
    private String apellidos;
    private String Ncelular;

    public Padre() {
    }

    public Padre(int idpadre, String nombres, String apellidos, String Ncelular) {
        this.idpadre = idpadre;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.Ncelular = Ncelular;
    }

    public int getIdpadre() {
        return idpadre;
    }

    public void setIdpadre(int idpadre) {
        this.idpadre = idpadre;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNcelular() {
        return Ncelular;
    }

    public void setNcelular(String Ncelular) {
        this.Ncelular = Ncelular;
    }
    
}
