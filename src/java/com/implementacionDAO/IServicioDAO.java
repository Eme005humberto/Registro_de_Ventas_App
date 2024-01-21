/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementacionDAO;

import com.modelo.Clientes;
import java.util.List;

/**
 *
 * @author Emerson Humberto
 */
public interface IServicioDAO {
    
    public List<Clientes> AllClients();
    
    public int AddClients(Clientes cliente);
    
    public int UpdateClients(Clientes cliente);
    
    public int DeleteClients(int id);
    
    public Clientes ObtenerId(int id);
}
