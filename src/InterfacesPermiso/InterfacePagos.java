/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesPermiso;

import com.sistemas.DTO.Pagos;
import java.util.ArrayList;

/**
 *
 * @author LUCHITO
 */
public interface InterfacePagos {
     public ArrayList<Pagos> listarPagos();
    public ArrayList<Pagos> listarPagos(int id);
    public boolean crearPagos(Pagos p);
    public boolean editarPagos(Pagos p);
    public boolean eliminarPagos(int id);
    
}
