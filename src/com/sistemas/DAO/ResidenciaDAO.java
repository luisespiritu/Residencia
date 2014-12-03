/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.DAO;

import com.sistemas.DTO.Residencia;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Miryam
 */
public class ResidenciaDAO implements InterfacesPermiso.InterfaceResidencia{
    private Connection cx;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    @Override
    public ArrayList<Residencia> listarResidencia() {
        sql="SELECT *FROM Residencia";
        ArrayList<Residencia> resi = new ArrayList<>();
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Residencia resi1 = new Residencia();
                resi1.setIdresidencia(rs.getInt("idresidencia"));
                resi1.setCantpersonas(rs.getInt("cantpersonas"));
                resi1.setNhabitaciones(rs.getInt("nhabitaciones"));
                resi.add(resi1);
        }
        } catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e);
        }        
        return resi;
    }

    @Override
    public ArrayList<Residencia> listarResidencia(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Residencia> buscarResidencia(String nomresi) {
 ArrayList<Residencia> lista1 = new ArrayList<>();
        sql = "SELECT *FROM personal WHERE nomresi = ?";
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            ps.setString(1, nomresi);
            rs = ps.executeQuery();
            while(rs.next()){
                Residencia resi1 = new Residencia();
                resi1.setIdresidencia(rs.getInt("idresidencia"));
                resi1.setCantpersonas(rs.getInt("cantpersonas"));
                resi1.setNhabitaciones(rs.getInt("nhabitaciones"));
                
                lista1.add(resi1);
            }
        } catch (Exception e) {
        }
        return lista1;    }

    @Override
    public int buscarIdResidencia(String nomresi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int crearResidencia(Residencia resi) {
  int op=0;
        sql = "INSERT FROM categoria INTO(idresidencia, cantpersonas, nhabitaciones)VALUES(null, ?, ?)";
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            ps.setInt(1, resi.getIdresidencia());
            ps.setInt(2, resi.getCantpersonas());
            ps.setInt(3, resi.getNhabitaciones());
            
            op = ps.executeUpdate();
            
        } catch (SQLException e) {
            
        }
        return op;    
    }

    @Override
    public int editarResidencia(Residencia resi) {
 int op=0;
        sql = "UPDATE producto SET idresidencia=?, cantpersonas=?, nhabitaciones=? WHERE idresidencia=?";
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            ps = cx.prepareStatement(sql);
            ps.setInt(1, resi.getIdresidencia());
            ps.setInt(2, resi.getCantpersonas());
            ps.setInt(3, resi.getNhabitaciones());
            
            
            op = ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Editar: "+ e);
        }
        return op;    }

    @Override
    public int deleteResidencia(int id) {
 int op=0;
        sql = "DELETE FROM producto WHERE idResidencia=?";
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            ps.setInt(1, id);
            op = ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }        
        return op;      
    }
    
}
