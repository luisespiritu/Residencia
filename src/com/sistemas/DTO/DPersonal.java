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
public class DPersonal {
    private int iddetallperson;
    private double cantip;
    private int desc;

    public DPersonal() {
    }

    public DPersonal( double cantip, int desc) {
       this.cantip = cantip;
       this.desc = desc;
    }

    public int getIddetallperson() {
        return iddetallperson;
    }

    public void setIddetallperson(int iddetallperson) {
        this.iddetallperson = iddetallperson;
    }

    public double getCantip() {
        return cantip;
    }

    public void setCantip(double cantip) {
        this.cantip = cantip;
    }

    public int getDesc() {
        return desc;
    }

    public void setDesc(int desc) {
        this.desc = desc;
    }

   
    }

    