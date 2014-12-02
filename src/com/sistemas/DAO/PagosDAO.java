/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemas.DAO;

import com.sistemas.DTO.Pagos;
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
public class PagosDAO implements InterfacesPermiso.InterfacePagos{
 private Connection cx = null;//permite recibir la conexion
 private Statement st;//permite ejecutar la consulta
 private ResultSet rs;
String sql;
    @Override
    public ArrayList<Pagos> listarPagos() {
     ArrayList<Pagos> lista=new ArrayList<>();
        sql = "SELECT * FROM pagos";
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();  
            rs = st.executeQuery(sql);
            while(rs.next()){
              Pagos p = new Pagos();
                p.setIdpag(rs.getInt("idPAGOS"));
                p.setIdinter(rs.getInt("idINTERNO"));
                p.setCantpag(rs.getDouble("CANTIDAD_PAGO"));
                p.setFecha(rs.getString("FECHA"));
                p.setMotivo(rs.getString("MOTIVO"));
               
                lista.add(p);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;    
        
        
    }

    @Override
    public ArrayList<Pagos> listarPagos(int id) {
      ArrayList<Pagos> lista=new ArrayList<>();
        sql = "SELECT * FROM pagos WHERE idPAGOS="+id;
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();  
            rs = st.executeQuery(sql);
            while(rs.next()){
              Pagos p = new Pagos();
                p.setIdpag(rs.getInt("idPAGOS"));
                p.setIdinter(rs.getInt("idINTERNO"));
                p.setCantpag(rs.getDouble("CANTIDAD_PAGO"));
                p.setFecha(rs.getString("FECHA"));
                p.setMotivo(rs.getString("MOTIVO"));
               
                lista.add(p);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;    
          
    }

    @Override
    public boolean crearPagos(Pagos p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarPagos(Pagos p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarPagos(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
