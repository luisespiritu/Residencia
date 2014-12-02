/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesPermiso;

import com.sistemas.DTO.Permiso;
import java.util.ArrayList;

/**
 *
 * @author LUCHITO
 */
public interface InterfacePermiso {
    public ArrayList<Permiso> listarPermiso();
    public ArrayList<Permiso> listarPermiso(int id);
    
    public boolean crearPermiso(Permiso p);
    public boolean editarPermiso(Permiso p);
    public boolean eliminaPermiso(int id);
    
}
