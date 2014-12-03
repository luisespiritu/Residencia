/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.DAO;

import com.sistemas.DTO.Reserva;
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
public class ReservaDAO implements InterfacesPermiso.InterfaceReserva{
    private Connection cx;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    @Override
    public ArrayList<Reserva> listarReserva() {
         sql="SELECT *FROM Reserva";
        ArrayList<Reserva> r = new ArrayList<>();
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Reserva re = new Reserva();
                re.setIdreserva(rs.getInt("idreserva"));
                re.setIdresidencia(rs.getInt("idresidencia"));
                re.setIdinterno(rs.getInt("idinterno"));
                re.setFechareserva(rs.getString("fechareserva"));
                re.setFechainicio(rs.getString("fechainicio"));
                re.setFechafin(rs.getString("fechafin"));
                r.add(re);
        }
        } catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, e);
        }        
        return r;
        
    }

    @Override
    public ArrayList<Reserva> listarReserva(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Reserva> buscarPrivilegio(String nomr) {
        ArrayList<Reserva> lista1 = new ArrayList<>();
        sql = "SELECT *FROM personal WHERE nomr = ?";
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            ps.setString(1, nomr);
            rs = ps.executeQuery();
            while(rs.next()){
                Reserva re = new Reserva();
                re.setIdreserva(rs.getInt("idreserva"));
                re.setIdresidencia(rs.getInt("idresidencia"));
                re.setIdinterno(rs.getInt("idinterno"));
                re.setFechareserva(rs.getString("fechareserva"));
                re.setFechainicio(rs.getString("fechainicio"));
                re.setFechafin(rs.getString("fechafin"));
                
                lista1.add(re);
            }
        } catch (Exception e) {
        }
        return lista1;
    }

    @Override
    public int buscarIdReserva(String nomr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int crearReserva(Reserva r) {
        int op=0;
        sql = "INSERT FROM categoria INTO(idreserva, idresidencia, idinterno, fechareserva, fechainicio, fechafin)VALUES(null, ?, ?)";
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            ps.setInt(1, r.getIdreserva());
            ps.setInt(2, r.getIdresidencia());
            ps.setInt(3, r.getIdinterno());
            ps.setString(4, r.getFechareserva());
            ps.setString(5, r.getFechainicio());
            ps.setString(6, r.getFechafin());
            op = ps.executeUpdate();
            
        } catch (SQLException e) {
            
        }
        return op;    
    }

    @Override
    public int editarReserva(Reserva r) {
        int op=0;
        sql = "UPDATE producto SET idreserva=?, idresidencia=?, idinterno=?, fechareserva=? , fechainicio=?, fechafin=? WHERE idreserva=?";
        try {
            cx = Conexion.getConex();
            ps = cx.prepareStatement(sql);
            ps = cx.prepareStatement(sql);
            ps.setInt(1, r.getIdreserva());
            ps.setInt(2, r.getIdresidencia());
            ps.setInt(3, r.getIdinterno());
            ps.setString(4, r.getFechareserva());
            ps.setString(5, r.getFechainicio());
            ps.setString(6, r.getFechafin());
            
            op = ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Editar: "+ e);
        }
        return op;
    }

    @Override
    public int deleteReserva(int id) {
        int op=0;
        sql = "DELETE FROM producto WHERE idReserva=?";
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
