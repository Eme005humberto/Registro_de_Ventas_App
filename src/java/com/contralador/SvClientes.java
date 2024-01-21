/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contralador;

import com.modelo.Clientes;
import com.servicios.ServiciosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Emerson Humberto
 */
@WebServlet(name = "SvClientes", urlPatterns = {"/SvClientes"})
public class SvClientes extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //@WebServlet("/SvClientes")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServiciosDAO sr = new ServiciosDAO();
        Clientes cliente = new Clientes();

        String accion = request.getParameter("accion");
        List<Clientes> clientes = new ArrayList();
        ServiciosDAO servicioDAO = new ServiciosDAO();
        switch (accion) {
            case "Listar":
                clientes = servicioDAO.AllClients();
                request.setAttribute("clientes", clientes);
                request.getRequestDispatcher("vista/Index.jsp").forward(request, response);
                break;
            case "Nuevo":
                request.getRequestDispatcher("vista/add.jsp").forward(request, response);
                break;
            case "Agregar":
                //Creamos variables para obtener su valor
                int r = 0;//Creamos variable
                String Nombre = request.getParameter("txtNombre");
                String Apellido = request.getParameter("txtApellido");
                String NombreProducto = request.getParameter("txtProducto");
                Double PrecioUnitario = Double.parseDouble(request.getParameter("txtPrecioUnitario"));

                cliente.setNombre(Nombre);
                cliente.setApellido(Apellido);
                cliente.setProducto(NombreProducto);
                cliente.setPrecioUnitario(PrecioUnitario);

                r = sr.AddClients(cliente);

                //Validamos si se guardaron correctamente
                if (r != 0) {
                    request.setAttribute("config", "alert alert-success");
                    request.setAttribute("mensaje", "SE REGISTRO LA VENTA DE MANERA EXITOSA!!");
                    request.getRequestDispatcher("vista/exito/exito.jsp").forward(request, response);
                } else {
                    request.setAttribute("config", "alert alert-danger");
                    request.setAttribute("mensaje", "ERROR AL REGISTRAR LA VENTA!!");
                    request.getRequestDispatcher("vista/error/mensaje.jsp").forward(request, response);
                }
                break;
            case "Modificar":
                //Creamos una variable en donde estamos almacenando el valor del Id del Cliente 
                int id = Integer.valueOf(request.getParameter("id"));
                cliente = sr.ObtenerId(id);//Invocamos el metodo que trae todos los datos del cliente
                request.setAttribute("clientes", cliente);//Creamos los atributos la clave y el objeto
                request.getRequestDispatcher("vista/Update.jsp").forward(request, response);//Manda la informacion
                //a la siguiente ruta
                break;
            case "Actualizar":
                //Creamos las variables a utilizar
                String _nombre = request.getParameter("txtNombre");
                String _apellido = request.getParameter("txtApellido");
                String _producto = request.getParameter("txtProducto");
                Double _PrecioUnitario = Double.parseDouble(request.getParameter("txtPrecioUnitario"));
                int _id = Integer.valueOf(request.getParameter("idCliente"));
                Clientes cl = new Clientes(_id, _nombre, _apellido, _producto, _PrecioUnitario);
                int respuesta = sr.UpdateClients(cl);

                if (respuesta != 0) {
                    request.setAttribute("config", "alert alert-success");
                    request.setAttribute("mensaje", "SE ACTUALIZO LA VENTA DE MANERA EXITOSA!!");
                    request.getRequestDispatcher("vista/exito/exito.jsp").forward(request, response);
                } else {
                    request.setAttribute("config", "alert alert-danger");
                    request.setAttribute("mensaje", "NO SE ACTUALIZO LA VENTA!!");
                    request.getRequestDispatcher("vista/error/mensaje.jsp").forward(request, response);
                }
                break;
            case "Eliminar":
                int _idCliente = Integer.valueOf(request.getParameter("id"));//Recibimos el Id del cliente
                int resp = sr.DeleteClients(_idCliente);//Invocamos el metodo y le pasamos el parametro
                if (resp != 0) {//Validamos si es diferente
                    request.setAttribute("config", "alert alert-success");
                    request.setAttribute("mensaje", "SE ELIMINO LA VENTA DE MANERA EXITOSA!!");
                    request.getRequestDispatcher("vista/exito/exito.jsp").forward(request, response);
                } else {
                    request.setAttribute("config", "alert alert-danger");
                    request.setAttribute("mensaje", "NO SE ELIMINO LA VENTA!!");
                    request.getRequestDispatcher("vista/error/mensaje.jsp").forward(request, response);
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Logica de Agregar Venta
        //Clientes cliente = new Clientes();
        //ServiciosDAO Service = new ServiciosDAO();
        //String accion = request.getParameter("accion");//Variable que sirve para interactuar con
        //diferentes acciones que va a realizar el usuario
/*
        String Nombre = request.getParameter("txtNombre");
        String Apellido = request.getParameter("txtApellido");
        String Producto = request.getParameter("txtProducto");
        String PrecioUnitario = request.getParameter("txtPrecio");
        switch (accion) {
            case "Agregar":
                cliente.setNombre(request.getParameter("Nombre"));
                cliente.setApellido(request.getParameter("Apellido"));
                cliente.setProducto(request.getParameter("Producto"));
                cliente.setPrecioUnitario(Double.parseDouble(request.getParameter("PrecioUnitario")));

                Service.AllClients();
                request.setAttribute("respuesta", accion);//Le damos una clave y la variable
                //Le damos la direccion para enviar los datos
                request.getRequestDispatcher("./vista/Index.jsp").forward(request, response);
                break;
        }
         */
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
