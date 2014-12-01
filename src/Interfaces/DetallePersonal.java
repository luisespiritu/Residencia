/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import java.util.ArrayList;

/**
 *
 * @author LUCHITO
 */
public interface DetallePersonal {
    public ArrayList<DetallePersonal> listarDetalle();
    public ArrayList<DetallePersonal> listarDetalle(int id);
   
    public ArrayList<DetallePersonal> listarDetallePersonal(String Detalle);
    
    public boolean crearDetalle(DetallePersonal e);
    public boolean eliminarDetalle(int id);
}
