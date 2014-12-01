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
 * @author Wild
 */
public interface InterfacePadre {
    public ArrayList<Padre> listarPadre();
    public ArrayList<Padre> listarPadre(int id);
   
    public ArrayList<Padre> listarAlumno(String Padre);
    
    public boolean crearPadre(Padre e);
    public boolean editarPadre(Padre e);
    public boolean eliminarPadre(int id);
    
    
}
