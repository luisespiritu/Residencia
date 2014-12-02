/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesPermiso;

import com.sistemas.DTO.Rol;
import java.util.ArrayList;

/**
 *
 * @author Wild
 */
public interface InterfaceRol  {
    public ArrayList<Rol> listarRol();
    public ArrayList<Rol> listarRol(int id);
    public ArrayList<Rol> listarRol(String nombre);
    public String nombreRol(int id);
    public int CrearRol(Rol r);
    public int EditarRol(Rol r);
    public int EliminarRol(int id);
    
}
