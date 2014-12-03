/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesPermiso;

import com.sistemas.DTO.Residencia;
import java.util.ArrayList;

/**
 *
 * @author Miryam
 */
public interface InterfaceResidencia {
     public ArrayList<Residencia> listarResidencia();
    public ArrayList<Residencia> listarResidencia(int id);
    public ArrayList<Residencia> buscarResidencia(String nomresi);
    public int buscarIdResidencia(String nomresi);
    public int crearResidencia(Residencia resi);
    public int editarResidencia(Residencia resi);
    public int deleteResidencia(int id);
    
}
