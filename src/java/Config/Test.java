/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import com.servicios.ServiciosDAO;

/**
 *
 * @author Emerson Humberto
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Config.conectarse();
        ServiciosDAO servicio = new ServiciosDAO();
        servicio.AllClients();
    }
    
}
