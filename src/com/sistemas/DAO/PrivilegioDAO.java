/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.DAO;

import InterfacesPermiso.InterfacePrivilegio;
import com.sistemas.DTO.Privilegio;
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
public class PrivilegioDAO implements InterfacePrivilegio{
    private Connection cx;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    @Override
    public ArrayList<Privilegio> listarPrivilegio() {
        sql="SELECT *FROM Privilegio";
        ArrayList<Privilegio> pri = new ArrayList<>();
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Privilegio pr = new Privilegio();
                pr.setIdprivilegios(rs.getInt("idprivilegio"));
                pr.setIdrol(rs.getInt("Rol"));
                pr.setNombre_privilegio(rs.getString("nom_pri"));
                pr.setAcceso(rs.getString("Acceso"));
                pri.add(pr);
        }
        } catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e);
        }        
        return pri;
    }

    @Override
    public ArrayList<Privilegio> listarPrivilegio(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Privilegio> buscarPrivilegio(String nompri) {
        ArrayList<Privilegio> lista1 = new ArrayList<>();
        sql = "SELECT *FROM personal WHERE nompri = ?";
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            ps.setString(1, nompri);
            rs = ps.executeQuery();
            while(rs.next()){
                Privilegio pr = new Privilegio();
                pr.setIdprivilegios(rs.getInt("idPrivilegios"));
                pr.setIdrol(rs.getInt("idRol"));
                pr.setNombre_privilegio(rs.getString("Nombre_Privilegio"));
                pr.setAcceso(rs.getString("Acceso"));
                lista1.add(pr);
            }
        } catch (Exception e) {
        }
        return lista1;
    }

    @Override
    public int buscarIdPrivilegio(String nomcat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int crearPrivilegio(Privilegio pri) {
          int op=0;
        sql = "INSERT FROM categoria INTO(idPrivilegios, idRol, nombre_privilegios, acceso)VALUES(null, ?, ?)";
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            ps.setInt(1, pri.getIdprivilegios());
            ps.setInt(2, pri.getIdrol());
            ps.setString(3, pri.getNombre_privilegio());
            ps.setString(4, pri.getAcceso());
            op = ps.executeUpdate();
            
        } catch (SQLException e) {
            
        }
        return op;
    }

    @Override
    public int editarPrivilegio(Privilegio pri) {
        int op=0;
        sql = "UPDATE producto SET idprivilegio=?, idrol=?, nombre_privilegio=?, acceso=? WHERE idprivilegio=?";
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            ps.setInt(1, pri.getIdprivilegios());
            ps.setInt(2, pri.getIdrol());
            ps.setString(3, pri.getNombre_privilegio());
            ps.setString(4, pri.getAcceso());
            op = ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Editar: "+ e);
        }
        return op;
    }

    @Override
    public int deletePrivilegio(int id) {
        int op=0;
        sql = "DELETE FROM producto WHERE idPrivilegio=?";
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
