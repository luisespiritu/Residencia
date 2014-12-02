/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.DAO;

import com.sistemas.DTO.Usuario;
import config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kiefer
 */
public class UsuarioDAO implements InterfacesPermiso.InterfaceUsuario{
     private Connection cx = null;//permite recibir la conexion
    private Statement st;//permite ejecutar la consulta
    private ResultSet rs;
    String sql;
    public UsuarioDAO(){
        
        
    }

    @Override
    public ArrayList<Usuario> listarUsuario() {
          ArrayList<Usuario> lista=new ArrayList<>();
        sql = "SELECT * FROM Usuario";
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();  
            rs = st.executeQuery(sql);
            while(rs.next()){
              Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setPassword(rs.getString("password"));
                usuario.setIdPersonal(rs.getInt("idPersonal"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setUser(rs.getString("user"));
               
                lista.add(usuario);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
        
        
        
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Usuario> listarUsuario(int u) {
         ArrayList<Usuario> lista=new ArrayList<>();
       sql="SELECT *FROM Usuario WHERE idUsuario= "+u;
        try {
        cx = Conexion.getConex();
        st = cx.createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            Usuario usuario = new Usuario();
            usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setPassword(rs.getString("password"));
                usuario.setIdPersonal(rs.getInt("idPersonal"));
                usuario.setEstado(rs.getString("estado"));
                usuario.setUser(rs.getString("user"));
           
            lista.add(usuario);
        }        
        } catch (SQLException e) {
        
        }
        return lista;
        
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Usuario> listarAlumno(String usuario) {
        ArrayList<Usuario> lista=new ArrayList<>();
        sql="SELECT *FROM Padre WHERE APELLIDOS= ";
        try {
        cx = Conexion.getConex();
        st = cx.createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            
            Usuario u = new Usuario();
               u.setIdUsuario(rs.getInt("idUsuario"));
               u.setPassword(rs.getString("password"));
               u.setIdPersonal(rs.getInt("idPersonal"));
              u.setEstado(rs.getString("estado"));
               u.setUser(rs.getString("user"));
           
            
            lista.add(u);
        }        
        } catch (SQLException e) {        
        }finally{
            try {
                cx.close();
            } catch (SQLException ex) {
                
            }
        }
        return lista;   
        
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean crearUsuario(Usuario u) {
          boolean op=false;
        sql = "INSERT INTO Usuario"
          + " (idUsuario, idPersonal,user,password,estado) VALUES(null, "
            +u.getIdUsuario()+", '"
            +u.getIdPersonal()+"', '"
            +u.getUser()+"', "
             +u.getPassword()+"',"
             +u.getEstado()+"',";
           
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            st.executeUpdate(sql);
            op = true;
        } catch (SQLException ex) {
        
        }
       return op;
        
    }
        
        
             
        
        @Override
    public boolean editarUsuario(Usuario e) {
         boolean op = false;
        sql = "UPDATE Usuario SET idUsuario ="
               +e.getIdUsuario()+", '"
            +e.getIdPersonal()+"', '"
            +e.getUser()+"', "
             +e.getPassword()+"',"
             +e.getEstado()+"',";
            
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            st.executeUpdate(sql);
            op = true;
        } catch (SQLException ex) {
        }finally{
//            try {
//                cx.close();
//            } catch (SQLException ex) {                
//            }
        }
        return op;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarUsuario(int u) {
        boolean op = false;
        sql ="DELETE FROM Usuario WHERE idUsuario="+u;
        
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            st.executeUpdate(sql);
            op = true;
        } catch (SQLException ex) {
        }
        return op;
        
        
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
