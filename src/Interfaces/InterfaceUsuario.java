/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;


import com.sistemas.DTO.Usuario;
import java.util.ArrayList;


/**
 *
 * @author Kiefer
 */
public interface InterfaceUsuario {
    public ArrayList<Usuario> listarUsuario();
    public ArrayList<Usuario> listarUsuario(int u);
    
     public ArrayList<Usuario> listarAlumno(String usuario);
    
    public boolean crearUsuario(Usuario u);
    public boolean editarUsuario(Usuario e);
    public boolean eliminarUsuario(int u);
    
}
