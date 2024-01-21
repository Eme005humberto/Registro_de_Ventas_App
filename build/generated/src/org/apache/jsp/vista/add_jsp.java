package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>Realizar Venta</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            .figure {\n");
      out.write("                position: absolute;\n");
      out.write("                width: 50px;\n");
      out.write("                height: 50px;\n");
      out.write("                background-color: #3498db;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                animation: moveFigure 5s infinite alternate;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @keyframes moveFigure {\n");
      out.write("                from {\n");
      out.write("                    transform: translate(0, 0);\n");
      out.write("                }\n");
      out.write("                to {\n");
      out.write("                    transform: translate(200px, 200px);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h2{\n");
      out.write("                position: relative;\n");
      out.write("                left:400px;\n");
      out.write("                font-family: serif;\n");
      out.write("                top: 20px;\n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                font-family: serif;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                background-image: url('https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.freepik.es%2Ffotos-vectores-gratis%2Fpersona-pagando-con-tarjeta%2F6&psig=AOvVaw1MzGvkjNiCcly8jpSzPDnO&ust=1705176818291000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCOjy0evU2IMDFQAAAAAdAAAAABAD');\n");
      out.write("                background-size: 55% 100%; /* Ajusta el tamaño de la imagen al tamaño del elemento */\n");
      out.write("                background-repeat: no-repeat; /* Evita que la imagen se repita */\n");
      out.write("                /* Mueve la imagen completamente a la derecha del elemento contenedor */\n");
      out.write("                background-position: right top;\n");
      out.write("                background-attachment: fixed; /* Fija la imagen en la ventana de visualización */\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background-color: #f5f5f5;\n");
      out.write("                margin: 0;\n");
      out.write("                overflow: hidden; /* Ocultar barras de desplazamiento */\n");
      out.write("                /* Mueve la imagen completamente a la derecha del elemento contenedor */\n");
      out.write("                background-position: right top;\n");
      out.write("                background-attachment: fixed; /* Fija la imagen en la ventana de visualización */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .contenido {\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            footer {\n");
      out.write("                background-color: #00FFFF; /* Color de fondo del pie de página */\n");
      out.write("                color: #000000; /* Color de texto del pie de página */\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 10px;\n");
      out.write("                position: fixed;\n");
      out.write("                bottom: 0;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .Procesar{\n");
      out.write("                position: relative;\n");
      out.write("                left: 330px;\n");
      out.write("                top:50px;\n");
      out.write("                bottom: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .money-icon {\n");
      out.write("                position: absolute;\n");
      out.write("                font-size: 24px; /* Tamaño del icono */\n");
      out.write("                color: #4CAF50; /* Color del icono */\n");
      out.write("                animation: moveMoney 5s infinite alternate;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @keyframes moveMoney {\n");
      out.write("                from {\n");
      out.write("                    transform: translate(0, 0);\n");
      out.write("                    left: 0;\n");
      out.write("                }\n");
      out.write("                to {\n");
      out.write("                    transform: translate(200px, 200px);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <h2>Agregar nueva venta</h2>\n");
      out.write("         <div class=\"money-icon\">$</div>\n");
      out.write("        <div class=\"figure\"></div>\n");
      out.write("        <div class=\"Procesar\">\n");
      out.write("            <form action=\"SvClientes\" method=\"POST\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <label for=\"Nombre\">Ingrese el nombre del cliente: </label>\n");
      out.write("                        <input type=\"text\" name=\"txtNombre\"  class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <label for=\"Apellido\">Ingrese el apellido del cliente : </label>\n");
      out.write("                        <input type=\"text\" name=\"txtApellido\"  class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <label for=\"Producto\">Ingrese el nombre del producto : </label>\n");
      out.write("                        <input type=\"text\" name=\"txtProducto\"  class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <label for=\"PrecioUnitario\">Ingrese el precio unitario: </label>\n");
      out.write("                        <input type=\"text\" name=\"txtPrecioUnitario\" class=\"form-control\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <button type=\"submit\" value=\"Agregar\" name=\"accion\" class=\"btn btn-outline-success\">Agregar <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-bag-plus-fill\" viewBox=\"0 0 16 16\">\n");
      out.write("                        <path fill-rule=\"evenodd\" d=\"M10.5 3.5a2.5 2.5 0 0 0-5 0V4h5zm1 0V4H15v10a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V4h3.5v-.5a3.5 3.5 0 1 1 7 0M8.5 8a.5.5 0 0 0-1 0v1.5H6a.5.5 0 0 0 0 1h1.5V12a.5.5 0 0 0 1 0v-1.5H10a.5.5 0 0 0 0-1H8.5z\"/>\n");
      out.write("                        </svg></button>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"Index.jsp\" class=\"btn btn-primary\">Volver <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-arrow-return-left\" viewBox=\"0 0 16 16\">\n");
      out.write("                        <path fill-rule=\"evenodd\" d=\"M14.5 1.5a.5.5 0 0 1 .5.5v4.8a2.5 2.5 0 0 1-2.5 2.5H2.707l3.347 3.346a.5.5 0 0 1-.708.708l-4.2-4.2a.5.5 0 0 1 0-.708l4-4a.5.5 0 1 1 .708.708L2.707 8.3H12.5A1.5 1.5 0 0 0 14 6.8V2a.5.5 0 0 1 .5-.5\"/>\n");
      out.write("                        </svg></a></a>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <footer>\n");
      out.write("            Derechos de autor: Emerson Humberto Carpaño Granados\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
