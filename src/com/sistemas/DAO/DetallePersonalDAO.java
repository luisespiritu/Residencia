/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemas.DAO;


import Interfaces.DetallePersonal;
import com.sistemas.DTO.DetallPersonal;
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
public class DetallePersonalDAO implements Interfaces.DetallePersonal {
    private Connection cx = null;//permite recibir la conexion
    private Statement st;//permite ejecutar la consulta
    private ResultSet rs;
String sql;

    @Override
    public ArrayList<DetallPersonal> listarDetalle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<DetallPersonal> listarDetalle(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<DetallPersonal> listarDetallePersonal(String Detalle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean crearDetalle(DetallPersonal e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarDetalle(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
