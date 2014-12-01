/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacePermiso;

import com.sistemas.DTO.DetallePersonal;
import com.sistemas.DTO.Padre;
import java.util.ArrayList;

/**
 *
 * @author LUCHITO
 */
public interface DetallePersonalForm {
     public ArrayList<DetallePersonal> listarDetalle();
    public ArrayList<DetallePersonal> listarDetalle(int id);
   
    public ArrayList<Padre> listarDetalle(String Detalle);
    
    public boolean crearDetalle(DetallePersonal e);
    public boolean eliminarDetalle(int id);
}
