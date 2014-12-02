/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesPermiso;

import com.sistemas.DTO.Privilegio;
import java.util.ArrayList;

/**
 *
 * @author Miryam
 */
public interface InterfacePrivilegio {
     public ArrayList<Privilegio> listarPrivilegio();
    public ArrayList<Privilegio> listarPrivilegio(int id);
    public ArrayList<Privilegio> buscarPrivilegio(String nompri);
    public int buscarIdPrivilegio(String nomcat);
    public int crearPrivilegio(Privilegio pri);
    public int editarPrivilegio(Privilegio pri);
    public int deletePrivilegio(int id);
    
}
