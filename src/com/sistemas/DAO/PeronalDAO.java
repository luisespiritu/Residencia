/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.DAO;

import InterfacesPermiso.InterfacePersonal;
import com.sistemas.DTO.Personal;
import config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dka
 */
public class PeronalDAO implements InterfacePersonal {
private Connection cx = null;//permite recibir la conexion
    private Statement st;//permite ejecutar la consulta
    private ResultSet rs;//Recibe el resultado de la consulta
String sql;
    @Override
    public ArrayList<Personal> listarPersonal() {
       ArrayList<Personal> lista = new ArrayList();
        sql = "SELECT * FROM personal";
        try{
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                Personal permiso=new Personal();
                permiso.setIdpersonal(rs.getInt("idPERSONAL"));
                permiso.setNombre(rs.getString("NOMBRE"));
                permiso.setApellido(rs.getString("APELLIDO"));
                permiso.setCodigo(rs.getString("CODIGO"));
                permiso.setEmail(rs.getString("EMAIL"));
                permiso.setCargo(rs.getString("CARGO"));
                
              
                lista.add(permiso);
            }            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            }
    return lista;
    }

    @Override
    public ArrayList<Personal> listarPersonal(int id) {
ArrayList<Personal> lista = new ArrayList();
        sql = "SELECT * FROM permiso WHERE idPERMISO="+id;
        try{
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                 Personal permiso=new Personal();
                permiso.setIdpersonal(rs.getInt("idPERSONAL"));
                permiso.setNombre(rs.getString("NOMBRE"));
                permiso.setApellido(rs.getString("APELLIDO"));
                permiso.setCodigo(rs.getString("CODIGO"));
                permiso.setEmail(rs.getString("EMAIL"));
                permiso.setCargo(rs.getString("CARGO"));
                
               
                lista.add(permiso);
            }
            
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            }
    return lista;   
    }

    public ArrayList<Personal> listarPersonal(String Padre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int crearPersonal(Personal e) {
    try {
        int op=0;
        sql = "INSERT INTO personal(idPERSONAL,NOMBRE,APELLIDO,CODIGO, EMAIL,CARGO) VALUES(NULL,"+e.getCodigo()+",'"+e.getNombre()+"','"+e.getApellido()+"','"+e.getCodigo()+"','"+e.getEmail()+"','"+e.getCargo()+"')";
        System.out.println(sql);
        cx = Conexion.getConex();
        st = cx.createStatement();
        op=  st.executeUpdate(sql);
        return op;
    } catch (SQLException ex) {
        Logger.getLogger(PeronalDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return 0;
         
    }

    @Override
    public int editarPersonal(Personal e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int eliminarPersonal(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int retornarIDpersonal(String cate) {
             int idcam=0;
         sql="SELECT *FROM personal WHERE NOMBRE='"+cate+"'";
         
         try {
             cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            //cx.close();
            while(rs.next())
            {
                idcam=rs.getInt("idPERSONAL");
            }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"ERROR"+e);
         }
         return idcam;
    }

    @Override
    public ArrayList<Personal> buscarPersonal(String nomper) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int buscarIdPersonal(String nomper) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deletePersonal(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
