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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alum.fial7
 */
public class PersonalDAO_1 implements InterfacePersonal {
    private Connection cx;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    @Override
    public ArrayList<Personal> listarPersonal() {
         sql="SELECT *FROM Personal";
        ArrayList<Personal> p = new ArrayList<>();
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Personal per = new Personal();
                per.setIdpersonal(rs.getInt("idPersonal"));
                per.setNombre(rs.getString("nom_per"));
                per.setApellido(rs.getString("Apellido"));
                per.setCodigo(rs.getInt("Codigo"));
                per.setEmail(rs.getString("Email"));
                per.setCargo(rs.getString("Cargo"));
                p.add(per);
        }
        } catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e);
        }        
        return p;
    }

    @Override
    public ArrayList<Personal> listarPersonal(int id) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    }

    @Override
    public ArrayList<Personal> buscarPersonal(String nomper) {
         ArrayList<Personal> lista1 = new ArrayList<>();
        sql = "SELECT *FROM personal WHERE nomper = ?";
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            ps.setString(1, nomper);
            rs = ps.executeQuery();
            while(rs.next()){
                Personal p = new Personal();
                p.setIdpersonal(rs.getInt("idPersonal"));
                p.setNombre(rs.getString("nomper"));
                p.setApellido(rs.getString("apellido"));
                p.setCodigo(rs.getInt("codigo"));
                p.setEmail(rs.getString("email"));
                p.setCargo(rs.getString("cargo"));
                lista1.add(p);
            }
        } catch (Exception e) {
        }
        return lista1;
    }

    @Override
    public int buscarIdPersonal(String nomper) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int crearPersonal(Personal p) {
        int op=0;
        sql = "INSERT FROM categoria INTO(idPersonal, nomper, apellido,codigo, email, cargo)VALUES(null, ?, ?)";
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getApellido());
            ps.setInt(3, p.getCodigo());
            ps.setString(4, p.getEmail());
            ps.setString(5, p.getCargo());
            op = ps.executeUpdate();
            
        } catch (SQLException e) {
            
        }
        return op;
        
    }

    @Override
    public int editarPersonal(Personal p) {
         int op=0;
        sql = "UPDATE producto SET idpersonal=?, nombre=?, apellido=?, codigo=? , email=?, cargo=? WHERE idersonal=?";
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            ps.setInt(1, p.getIdpersonal());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getApellido());
            ps.setInt(4, p.getCodigo());
            ps.setString(5, p.getEmail());
            ps.setString(6, p.getCargo());
            op = ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Editar: "+ e);
        }
        return op;
    }
    

    @Override
    public int deletePersonal(int id) {
         int op=0;
        sql = "DELETE FROM producto WHERE idPersonal=?";
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
