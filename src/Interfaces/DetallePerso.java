/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import com.sistemas.DTO.Padre;
import java.util.ArrayList;

/**
 *
 * @author LUCHITO
 */
public interface DetallePerso {
     public ArrayList<DetallePerso> listarDetalle();
    public ArrayList<DetallePerso> listarDetalle(int id);
   
    public ArrayList<Padre> listarDetalle(String Detalle);
    
    public boolean crearDetalle(DetallePerso e);
    public boolean eliminarDetalle(int id);
}
