/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicios;

import Config.Config;
import com.implementacionDAO.IServicioDAO;
import com.modelo.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emerson Humberto
 */
public class ServiciosDAO implements IServicioDAO {

    private static final String SQL_ALL_CLIENT = "select Id,Nombre,Apellido,Producto,PrecioUnitario from clientes";
    private static final String SQL_INSERT_CLIENT = "INSERT INTO clientes (Nombre,Apellido,Producto,PrecioUnitario)"+
            "VALUES(?,?,?,?)";
    private static final String SQL_UPDATE_CLIENT = "Update clientes SET Nombre = ?, Apellido = ?, Producto = ? ,PrecioUnitario = ? WHERE Id = ?";
    
    private static final String SQL_DELETE_CLIENT = "Delete From clientes Where Id = ?";

    private static final String SQL_FIND_BY_ID = "Select * From clientes Where Id = ?";
    
    Connection conexion = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<Clientes> AllClients() {
        Clientes cliente = new Clientes();
        List<Clientes> listClients = new ArrayList<>();
        try {
            conexion = Config.conectarse();
            ps = conexion.prepareStatement(SQL_ALL_CLIENT);
            rs = ps.executeQuery();
            while (rs.next()) {
                //Vamos a recorrer el resultado
                cliente = new Clientes();
                cliente.setId(rs.getInt(1));
                cliente.setNombre(rs.getString(2));
                cliente.setApellido(rs.getString(3));
                cliente.setProducto(rs.getString(4));
                cliente.setPrecioUnitario(rs.getDouble(5));

                listClients.add(cliente);
                System.out.println("Clientes: "+listClients);
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar la lista " + e);
        }
        return listClients;
    }

   /* @Override
    public void AddClients(Clientes cliente) {
        try {
            conexion = Config.conectarse();
            ps = conexion.prepareStatement(SQL_INSERT_CLIENT);
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setString(4, cliente.getProducto());
            ps.setDouble(4, cliente.getPrecioUnitario());
            rs = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println("Error al guardar los datos " + ex);
        }
    }

    @Override
    public void UpdateClients(Clientes cliente) {
        try {
            conexion = Config.conectarse();
            ps = conexion.prepareStatement(SQL_UPDATE_CLIENT);
            ps.setInt(1, cliente.getId());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setString(4, cliente.getProducto());
            ps.setDouble(4, cliente.getPrecioUnitario());
            rs = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println("Error al modificar los datos " + ex);
        }
    }

    @Override
    public void DeleteClients(Clientes cliente) {
          try {
            conexion = Config.conectarse();
            ps = conexion.prepareStatement(SQL_DELETE_CLIENT);
            ps.setInt(1, cliente.getId());
            rs = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println("Error al eliminar los datos " + ex);
        }
    }

    @Override
    public int DeleteClients(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/

    @Override
    public int AddClients(Clientes cliente) {
        int resultado = 0;
        try {
            conexion = Config.conectarse();
            ps = conexion.prepareStatement(SQL_INSERT_CLIENT);
           // ps.setInt(1,cliente.getId());
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getProducto());
            ps.setDouble(4, cliente.getPrecioUnitario());
            resultado = ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Error al guardar los datos " + ex);
        }
        return resultado;
    }

    @Override
    public int UpdateClients(Clientes cliente) {
          int resultado = 0;
        try {
            conexion = Config.conectarse();
            ps = conexion.prepareStatement(SQL_UPDATE_CLIENT);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getProducto());
            ps.setDouble(4, cliente.getPrecioUnitario());
            ps.setInt(5 ,cliente.getId());
            resultado = ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Error al modificar los datos " + ex);
        }
        return resultado;
    }

    @Override
    public int DeleteClients(int id) {
         int resultado = 0;
        try {
            conexion = Config.conectarse();
            ps = conexion.prepareStatement(SQL_DELETE_CLIENT);
            ps.setInt(1, id);
            resultado = ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Error al eliminar los datos " + ex);
        }
        return resultado;
    }

    @Override
    public Clientes ObtenerId(int id) {
        Clientes cliente = new Clientes();
        try{
            conexion = Config.conectarse();
            ps = conexion.prepareStatement(SQL_FIND_BY_ID);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                cliente.setId(rs.getInt(1));
                cliente.setNombre(rs.getString(2));
                cliente.setApellido(rs.getString(3));
                cliente.setProducto(rs.getString(4));
                cliente.setPrecioUnitario(rs.getDouble(5));
            }
        }catch(Exception ex){
            System.out.println("Error no se encontro el cliente "+ex);
        }
        return  cliente;
    }
}
