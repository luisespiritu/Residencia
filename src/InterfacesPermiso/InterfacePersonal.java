/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesPermiso;

import com.sistemas.DTO.Personal;
import java.util.ArrayList;

/**
 *
 * @author Miryam
 */
public interface InterfacePersonal {
    public ArrayList<Personal> listarPersonal();
    public ArrayList<Personal> listarPersonal(int id);
    public ArrayList<Personal> buscarPersonal(String nomper);
    public int buscarIdPersonal(String nomper);
    public int crearPersonal(Personal p);
    public int editarPersonal(Personal p);
    public int deletePersonal(int id);
    
}
