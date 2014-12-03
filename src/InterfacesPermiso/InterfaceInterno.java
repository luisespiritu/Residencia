/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesPermiso;

import com.sistemas.DTO.Interno;
import java.util.ArrayList;

/**
 *
 * @author Wild
 */
    public interface InterfaceInterno {
    public ArrayList<Interno> listarInterno();
    public ArrayList<Interno> listarInterno(int id);
    public ArrayList<Interno> listarInterno(String nombre);
    public String nombreInterno(int id);
    public int CrearInterno(Interno c);
    public int EditarInterno(Interno c);
    public int EliminarInterno(int id);
    public int retornarIDinterno(String cate);
    
}
