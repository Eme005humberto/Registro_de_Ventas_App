package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("        <title>Modificar Venta</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            h2{\n");
      out.write("                position: relative;\n");
      out.write("                left: 60px;\n");
      out.write("                 top: 20px;\n");
      out.write("                 left:400px;\n");
      out.write("                font-family: serif;\n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                font-family: serif;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                background-image: url('/vista/img/img5.jpg');\n");
      out.write("                background-size: 55% 100%; /* Ajusta el tamaño de la imagen al tamaño del elemento */\n");
      out.write("                background-repeat: no-repeat; /* Evita que la imagen se repita */\n");
      out.write("                /* Mueve la imagen completamente a la derecha del elemento contenedor */\n");
      out.write("                background-position: right top;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background-color: #f5f5f5;\n");
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
      out.write("             .Procesar{\n");
      out.write("                position: relative;\n");
      out.write("                left: 330px;\n");
      out.write("                top:50px;\n");
      out.write("                bottom: 10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <h2>Modificar la venta</h2>\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <div class=\"Procesar\">\n");
      out.write("            <form action=\"SvClientes?accion=Modificar\" method=\"POST\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <input type=\"hidden\" name=\"idCliente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <label for=\"Nombre\">Ingrese el nombre del cliente: </label>\n");
      out.write("                        <input type=\"text\" name=\"txtNombre\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <label for=\"Apellido\">Ingrese el apellido del cliente : </label>\n");
      out.write("                        <input type=\"text\" name=\"txtApellido\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.apellido}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <label for=\"Producto\">Ingrese el nombre del producto : </label>\n");
      out.write("                        <input type=\"text\" name=\"txtProducto\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.producto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <label for=\"PrecioUnitario\">Ingrese el precio unitario: </label>\n");
      out.write("                        <input type=\"text\" name=\"txtPrecioUnitario\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.preciUnitario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <button type=\"submit\" value=\"Modificar\" name=\"accion\" class=\"btn btn-outline-warning\">Modificar <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-pencil-square\" viewBox=\"0 0 16 16\">\n");
      out.write("                        <path d=\"M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z\"/>\n");
      out.write("                        <path fill-rule=\"evenodd\" d=\"M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5z\"/>\n");
      out.write("                        </svg></button>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <a href=\"Index.jsp\" class=\"btn btn-primary\">Volver <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-arrow-return-left\" viewBox=\"0 0 16 16\">\n");
      out.write("                        <path fill-rule=\"evenodd\" d=\"M14.5 1.5a.5.5 0 0 1 .5.5v4.8a2.5 2.5 0 0 1-2.5 2.5H2.707l3.347 3.346a.5.5 0 0 1-.708.708l-4.2-4.2a.5.5 0 0 1 0-.708l4-4a.5.5 0 1 1 .708.708L2.707 8.3H12.5A1.5 1.5 0 0 0 14 6.8V2a.5.5 0 0 1 .5-.5\"/>\n");
      out.write("                        </svg></a>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("cliente");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.clientes}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
