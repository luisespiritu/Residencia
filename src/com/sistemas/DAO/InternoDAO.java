/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.DAO;

import InterfacesPermiso.InterfaceInterno;
import com.sistemas.DTO.Interno;
import config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dka
 */
public class InternoDAO implements InterfaceInterno {
    private Connection cx = null;//permite recibir la conexion
    private Statement st;//permite ejecutar la consulta
    private ResultSet rs;//Recibe el resultado de la consulta
String sql;

    @Override
    public ArrayList<Interno> listarInterno() {
            ArrayList<Interno> lista = new ArrayList();
        sql = "SELECT * FROM interno";
        try{
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                Interno permiso=new Interno();
                permiso.setIdInterno(rs.getInt("idINTERNO"));
                permiso.setIdResidencia(rs.getInt("idRESIDENCIA"));
                permiso.setIdPadre(rs.getInt("idPADRE"));
                permiso.setNombre(rs.getString("NOMBRE"));
                permiso.setApellidos(rs.getString("APELLIDOS"));
                permiso.setCodigo(rs.getString("CODIGO"));
                permiso.setLugar(rs.getString("LUGAR"));
                
              
                lista.add(permiso);
            }            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            }
    return lista;
    }

    @Override
    public ArrayList<Interno> listarInterno(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Interno> listarInterno(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String nombreInterno(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int CrearInterno(Interno c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int EditarInterno(Interno c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int EliminarInterno(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int retornarIDinterno(String cate) {
            int idcam=0;
         sql="SELECT *FROM interno WHERE NOMBRE='"+cate+"'";
         
         try {
             cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            //cx.close();
            while(rs.next())
            {
                idcam=rs.getInt("idINTERNO");
            }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"ERROR"+e);
         }
         return idcam;
    }
    
}
