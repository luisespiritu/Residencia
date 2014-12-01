/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemas.DAO;

import Interfaces.DetallePerso;
import com.sistemas.DTO.Padre;
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
public class DetallePersonalDAO implements Interfaces.DetallePerso {
    private Connection cx = null;//permite recibir la conexion
    private Statement st;//permite ejecutar la consulta
    private ResultSet rs;
String sql;

    @Override
    public ArrayList<DetallePerso> listarDetalle() {
         ArrayList<DetallePerso> lista=new ArrayList<>();
        sql = "SELECT * FROM detalle_personal";
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();  
            rs = st.executeQuery(sql);
            while(rs.next()){
              Padre padre = new Padre();
                padre.setIdpadre(rs.getInt("idPADRE"));
                padre.setNombres(rs.getNString("NOMBRE"));
                padre.setApellidos(rs.getString("APELLIDOS"));
               padre.setNcelular(rs.getString("TELEFONO"));
               
                lista.add(padre);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
        
        
        
        
    }

    @Override
    public ArrayList<DetallePerso> listarDetalle(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Padre> listarDetalle(String Detalle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean crearDetalle(DetallePerso e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarDetalle(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
