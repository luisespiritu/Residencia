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
public class Personal {
    private int idpersonal;
    private String nombre;
    private String apellido;
    private int codigo;
    private String email;
    private String cargo;

    public Personal() {
    }

    public Personal(int idpersonal, String nombre, String apellido, int codigo, String email, String cargo) {
        this.idpersonal = idpersonal;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.email = email;
        this.cargo = cargo;
    }

    public int getIdpersonal() {
        return idpersonal;
    }

    public void setIdpersonal(int idpersonal) {
        this.idpersonal = idpersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
