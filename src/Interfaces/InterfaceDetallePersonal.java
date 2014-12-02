/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import com.sistemas.DTO.DetallPersonal;
import java.util.ArrayList;

/**
 *
 * @author LUCHITO
 */
public interface InterfaceDetallePersonal {
    public ArrayList<DetallPersonal> listarDetalle();
    public ArrayList<DetallPersonal> listarDetalle(int id);
   
    public ArrayList<DetallPersonal> listarDetallePersonal(String Detalle);
    
    public int crearDetalle(DetallPersonal e);
    public int eliminarDetalle(int id);
}
