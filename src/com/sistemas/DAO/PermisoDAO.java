/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemas.DAO;

import com.sistemas.DTO.Permiso;
import InterfacesPermiso.InterfacePermiso;
import config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LUCHITO
 */
public class PermisoDAO implements InterfacePermiso {
private Connection cx = null;
    private Statement st;
    private ResultSet rs;
    private String sql; 
    @Override
    public ArrayList<Permiso> listarPermiso() {
        ArrayList<Permiso> lista = new ArrayList();
        sql = "SELECT * FROM permiso";
        try{
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                Permiso permiso=new Permiso();
                permiso.setIdperm(rs.getInt("idPERMISO"));
                permiso.setIdpad(rs.getInt("idPADRE"));
                permiso.setIdinter(rs.getInt("idINTERNO"));
                permiso.setIdperson(rs.getInt("idPERSONAL"));
                permiso.setFechasalida(rs.getString("FECHA_SALIDA"));
                permiso.setTipopermiso(rs.getString("Tipo"));
                permiso.setLugar(rs.getString("LUGAR"));
                permiso.setFecharetorno(rs.getString("FECHA_RETORNO"));
              
                lista.add(permiso);
            }            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            }
    return lista;
}

    @Override
    public ArrayList<Permiso> listarPermiso(int id) {
        ArrayList<Permiso> lista = new ArrayList();
        sql = "SELECT * FROM permiso WHERE idPERMISO="+id;
        try{
            cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                Permiso permiso=new Permiso();
                permiso.setIdperm(rs.getInt("idPERMISO"));
                permiso.setIdperm(rs.getInt("idPADRE"));
                permiso.setIdpad(rs.getInt("idINTERNO"));
                permiso.setIdinter(rs.getInt("idPERSONAL"));
                permiso.setFechasalida(rs.getString("FECHA_SALIDA"));
                permiso.setTipopermiso(rs.getString("Tipo"));
                permiso.setLugar(rs.getString("LUGAR"));
                permiso.setFecharetorno(rs.getString("FECHA_RETORNO"));
               
                lista.add(permiso);
            }
            
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            }
    return lista;
        
    }

    @Override
    public int crearPermiso(Permiso p) {
        
        
       int op=0;
        sql="INSERT INTO permiso(idPERMISO,idPADRE,idINTERNO,idPERSONAL,FECHA_SALIDA,TIPO,LUGAR,FECHA_RETORNO) VALUES(null,"+p.getIdperm()+" ,"+p.getIdpad()+","+p.getIdinter()+","+p.getIdperson()+",'"+p.getFechasalida()+"','"+p.getTipopermiso()+"','"+p.getLugar()+"','" +p.getFecharetorno()+"')";
               System.out.println(sql);
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            op=  st.executeUpdate(sql);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
       return op;
           /*  
       int op=0;
        sql = "INSERT INTO curso(idCurso, nom_curso, nota1, nota2, nota3, promedio) VALUES(NULL,'"+c.getNom_curso()+"',"+c.getNota1()
                +","+c.getNota2()+","+c.getNota3()+","+c.getPromedio()+")";
        System.out.println(sql);
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            op=  st.executeUpdate(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return op;
                   */
    }
     
    @Override
    public boolean editarPermiso(Permiso p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminaPermiso(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
