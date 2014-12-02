/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesPermiso;


import com.sistemas.DTO.Inventario;

import java.util.ArrayList;

/**
 *
 * @author Kiefer
 */
public interface InterfaceInventario {
     public ArrayList<Inventario> listarInventario();
    public ArrayList<Inventario> listarInventario(int id);
   
    public ArrayList<Inventario> listarInventario(String Inventario);
    
    public boolean crearInventario(Inventario e);
    public boolean editarInventario(Inventario e);
    public boolean eliminarInventario(int id);
    
    
}
