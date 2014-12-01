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
public class Usuario {
    private int idUsuario;
    private int idrol;
    private int idPersonal;
    private String user;
    private String password;
    private String estado;

    public Usuario() {
    }

    public Usuario(int idUsuario, int idrol, int idPersonal, String user, String password, String estado) {
        this.idUsuario = idUsuario;
        this.idrol = idrol;
        this.idPersonal = idPersonal;
        this.user = user;
        this.password = password;
        this.estado = estado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

}

