/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.DAO;

import com.sistemas.DTO.Inventario;

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
public class InventarioDAO implements InterfacePermiso.InterfaceInventario{
 private Connection cx = null;//permite recibir la conexion
    private Statement st;//permite ejecutar la consulta
    private ResultSet rs;
String sql;

    public InventarioDAO() {
    }

    @Override
    public ArrayList<Inventario> listarInventario() {
         ArrayList<Inventario> lista=new ArrayList<>();
        sql = "SELECT * FROM inventario";
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();  
            rs = st.executeQuery(sql);
            while(rs.next()){
              Inventario i = new Inventario();
               i.setIdinventario(rs.getInt("idINVENTARIO"));
               i.setIdresidencia(rs.getInt("idRESIDENCIA"));
               i.setRopero(rs.getInt("ROPEROS"));
              i.setCama(rs.getInt("CAMA"));
              i.setMesa(rs.getInt("MESA"));
              i.setSabanas(rs.getInt("SABANAS"));
               i.setSilla(rs.getInt("SILLA"));
                lista.add(i);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
        
        
        
        
    }

    @Override
    public ArrayList<Inventario> listarInventario(int id) {
         ArrayList<Inventario> lista=new ArrayList<>();
        sql = "SELECT * FROM inventario WHERE idINVENTARIO=" +id;
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();  
            rs = st.executeQuery(sql);
            while(rs.next()){
              Inventario i = new Inventario();
               i.setIdinventario(rs.getInt("idINVENTARIO"));
               i.setIdresidencia(rs.getInt("idRESIDENCIA"));
               i.setRopero(rs.getInt("ROPEROS"));
              i.setCama(rs.getInt("CAMA"));
              i.setMesa(rs.getInt("MESA"));
              i.setSabanas(rs.getInt("SABANAS"));
               i.setSilla(rs.getInt("SILLA"));
                lista.add(i);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
        
        
        
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Inventario> listarInventario(String Inventario) {
         ArrayList<Inventario> lista=new ArrayList<>();
        sql = "SELECT * FROM inventario WHERE idRESIDENCIA="+Inventario ;
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();  
            rs = st.executeQuery(sql);
            while(rs.next()){
              Inventario i = new Inventario();
               i.setIdinventario(rs.getInt("idINVENTARIO"));
               i.setIdresidencia(rs.getInt("idRESIDENCIA"));
               i.setRopero(rs.getInt("ROPEROS"));
              i.setCama(rs.getInt("CAMA"));
              i.setMesa(rs.getInt("MESA"));
              i.setSabanas(rs.getInt("SABANAS"));
               i.setSilla(rs.getInt("SILLA"));
                lista.add(i);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
        
        
        
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean crearInventario(Inventario e) {
        boolean op=false;
        sql = "INSERT INTO inventario"
          + " (idinventario,MESA,ROPERO,SABANAS,SILLA,CAMA) VALUES(null, '"
            +e.getMesa()+"', '"
            +e.getRopero()+"', '"
                +e.getSabanas()+"'"
                +e.getSilla()+","
                +e.getCama()+")"; 
          System.out.println(sql);
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            st.executeUpdate(sql);
            op = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
       return op;
        
        
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarInventario(Inventario e) {
         boolean op=false;
        sql = "UPDATE inventario SET idINVENTARIO"
              +e.getIdinventario()+","
              +e.getMesa()+"', '"
              +e.getRopero()+"', '"
              +e.getSabanas()+"'"
              +e.getSilla()+","
              +e.getCama()+")"; 
          System.out.println(sql);
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            st.executeUpdate(sql);
            op = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
       return op;
        
        
        
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarInventario(int id) {
        
          boolean op = false;
        sql ="DELETE FROM inventario WHERE idINVENTARIO="+id;
        
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
