/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import com.sistemas.DTO.DPersonal;
import java.util.ArrayList;

/**
 *
 * @author LUCHITO
 */
public interface InterfaceDetallePersonal {
    public ArrayList<DPersonal> listarDetalle();
    public ArrayList<DPersonal> listarDetalle(int id);
   
    public ArrayList<DPersonal> listarDetallePersonal(String Detalle);
    
    public int crearDetalle(DPersonal e);
    public int eliminarDetalle(int id);
}
