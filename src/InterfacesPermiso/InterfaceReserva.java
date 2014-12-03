/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesPermiso;

import com.sistemas.DTO.Reserva;
import java.util.ArrayList;

/**
 *
 * @author Miryam
 */
public interface InterfaceReserva {
     public ArrayList<Reserva> listarReserva();
    public ArrayList<Reserva> listarReserva(int id);
    public ArrayList<Reserva> buscarPrivilegio(String nomr);
    public int buscarIdReserva(String nomr);
    public int crearReserva(Reserva r);
    public int editarReserva(Reserva r);
    public int deleteReserva(int id);
    
}
