/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sistemas.DAO;

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
 * @author Kiefer
 */
public class PadreDAO implements  InterfacesPermiso.InterfacePadre{
    private Connection cx = null;//permite recibir la conexion
    private Statement st;//permite ejecutar la consulta
    private ResultSet rs;
String sql;
    public PadreDAO(){
        
    }
    @Override
    public ArrayList<Padre> listarPadre() {
         ArrayList<Padre> lista=new ArrayList<>();
        sql = "SELECT * FROM padre";
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
        
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Padre> listarPadre(int id) {
         ArrayList<Padre> lista=new ArrayList<>();
       sql="SELECT *FROM padre WHERE idPADRE= "+id;
        try {
        cx = Conexion.getConex();
        st = cx.createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            Padre a = new Padre();
           a.setIdpadre(rs.getInt("idPADRE"));
               a.setNombres(rs.getNString("NOMBRE"));
              a.setApellidos(rs.getString("APELLIDOS"));
               a.setNcelular(rs.getString("TELEFONO"));
               
           
            lista.add(a);
        }        
        } catch (SQLException e) {
        
        }
        return lista;
        
        
        
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Padre> listarAlumno(String Padre) {
         ArrayList<Padre> lista=new ArrayList<>();
        sql="SELECT *FROM padre WHERE APELLIDOS= "+Padre;
        try {
        cx = Conexion.getConex();
        st = cx.createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            Padre a = new Padre();
            a.setIdpadre(rs.getInt("idPADRE"));
               a.setNombres(rs.getNString("NOMBRE"));
              a.setApellidos(rs.getString("APELLIDOS"));
               a.setNcelular(rs.getString("TELEFONO"));
               
            
            lista.add(a);
        }        
        } catch (SQLException e) {        
        }finally{
            try {
                cx.close();
            } catch (SQLException ex) {
                
            }
        }
        return lista;       
        
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean crearPadre(Padre e) {
         boolean op=false;
        sql = "INSERT INTO padre"
          + " (idPADRE, NOMBRE,APELLIDOS,TELEFONO) VALUES(null, '"
            +e.getNombres()+"', '"
            +e.getApellidos()+"', '"
                +e.getNcelular()+"')";  
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
        
    }

    @Override
    public boolean editarPadre(Padre e) {
        boolean op = false;
        sql = "UPDATE padre SET idPADRE ="
                +e.getIdpadre()+", '"
            +e.getNombres()+"', '"
            +e.getApellidos()+"', "
                +e.getNcelular()+"',";
           
            
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            st.executeUpdate(sql);
            op = true;
        } catch (SQLException ex) {
        }finally{
//            try {
//                cx.close();
//            } catch (SQLException ex) {                
//            }
        }
        return op;
        
        
    }

    @Override
    public boolean eliminarPadre(int id) {
         boolean op = false;
        sql ="DELETE FROM alumno WHERE idPADRE="+id;
        
        try {
            cx = Conexion.getConex();
            st = cx.createStatement();
            st.executeUpdate(sql);
            op = true;
        } catch (SQLException ex) {
        }
        return op;
    }    
        
         //To change body of generated methods, choose Tools | Templates.

    @Override
    public int retornarIDpadre(String cate) {
        
        int idcam=0;
         sql="SELECT *FROM padre WHERE NOMBRE='"+cate+"'";
         
         try {
             cx = Conexion.getConex();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            //cx.close();
            while(rs.next())
            {
                idcam=rs.getInt("idPADRE");
            }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"ERROR"+e);
         }
         return idcam;
    }

}
   

   

   
    

