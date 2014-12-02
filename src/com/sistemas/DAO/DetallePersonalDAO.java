/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemas.DAO;


import InterfacesPermiso.InterfaceDetallePersonal;
import com.sistemas.DTO.DPersonal;

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
public class DetallePersonalDAO implements InterfacesPermiso.InterfaceDetallePersonal {
    private Connection cx = null;//permite recibir la conexion
    private Statement st;//permite ejecutar la consulta
    private ResultSet rs;
String sql;

    @Override
    public ArrayList<DPersonal> listarDetalle() {
            ArrayList<DPersonal> lista=new ArrayList<>();
        sql = "SELECT * FROM detalle_personal";
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();  
            rs = st.executeQuery(sql);
            while(rs.next()){
              DPersonal detal = new  DPersonal ();
                detal.setIddetallepersonal(rs.getInt("idDETALLE_PERSONAL"));
                detal.setCantipagada(rs.getDouble("CANT_PAGADA"));
                detal.setDescuento(rs.getInt("DESCUENTO"));
              
               lista.add(detal);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;

    }

    @Override
    public ArrayList<DPersonal> listarDetalle(int id) {
                 ArrayList<DPersonal> lista=new ArrayList<>();
        sql = "SELECT * FROM detalle_personal WHERE idDETALLE_PESONAL="+id;
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();  
            rs = st.executeQuery(sql);
            while(rs.next()){
              DPersonal detal = new  DPersonal ();
                detal.setIddetallepersonal(rs.getInt("idDETALLE_PERSONAL"));
                detal.setCantipagada(rs.getDouble("CANT_PAGADA"));
                detal.setDescuento(rs.getInt("DESCUENTO"));
              
               lista.add(detal);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;

    }

    @Override
    public ArrayList<DPersonal> listarDetallePersonal(String Detalle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int crearDetalle(DPersonal e) {
                int op=0;
        sql="INSERT INTO detalle_personal(idDETALLE_PERSONAL,CANT_PAGADA,DESCUENTO) VALUES(null,"
                +e.getIddetallepersonal()+",'"
                +e.getCantipagada()+"','"
                +e.getDescuento()+",'";
         try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            st.executeUpdate(sql);
            
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, e+"Luchito");
        }
       return op;

    }

    @Override
    public int eliminarDetalle(int id) {
              int op=0;
        sql ="DELETE FROM detalle_personal WHERE idDETALLE_PERSONAL="+id;
        
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            st.executeUpdate(sql);
           
        } catch (SQLException ex) {
        }finally{
            try {
                cx.close();
            } catch (SQLException ex) {                
            }
        }
        return op;
  
        
    }

}