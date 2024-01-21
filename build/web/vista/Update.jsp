<%-- 
    Document   : Update
    Created on : 02/01/2024, 11:54:39 AM
    Author     : Emerson Humberto
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <title>Modificar Venta</title>
    </head>
    <body>
        <style>
            h2{
                position: relative;
                left: 60px;
                 top: 20px;
                 left:400px;
                font-family: serif;
            }
            label{
                font-family: serif;
            }
            body {
                background-image: url('/vista/img/img5.jpg');
                background-size: 55% 100%; /* Ajusta el tamaño de la imagen al tamaño del elemento */
                background-repeat: no-repeat; /* Evita que la imagen se repita */
                /* Mueve la imagen completamente a la derecha del elemento contenedor */
                background-position: right top;
            }
            body {
                margin: 0;
                padding: 0;
                font-family: Arial, sans-serif;
                background-color: #f5f5f5;
            }

            .contenido {
                padding: 20px;
            }

            footer {
                background-color: #00FFFF; /* Color de fondo del pie de página */
                color: #000000; /* Color de texto del pie de página */
                text-align: center;
                padding: 10px;
                position: fixed;
                bottom: 0;
                width: 100%;
            }
             .Procesar{
                position: relative;
                left: 330px;
                top:50px;
                bottom: 10px;
            }
            .figure {
                position: absolute;
                width: 50px;
                height: 50px;
                background-color: #3498db;
                border-radius: 50%;
                animation: moveFigure 5s infinite alternate;
            }

            @keyframes moveFigure {
                from {
                    transform: translate(0, 0);
                }
                to {
                    transform: translate(200px, 200px);
                }
            }
        </style>
        <h2>Modificar la venta</h2>
        <c:set var="cliente" value="${requestScope.clientes}"></c:set>
        <div class="Procesar">
            <form action="SvClientes" method="POST">
                <div class="container">
                    <div class="col-sm-5">
                        <input type="hidden" name="idCliente" value="${cliente.id}">
                    </div>
                    <div class="col-sm-5">
                        <label for="Nombre">Ingrese el nombre del cliente: </label>
                        <input type="text" name="txtNombre" value="${cliente.nombre}" class="form-control">
                    </div>
                    <div class="col-sm-5">
                        <label for="Apellido">Ingrese el apellido del cliente : </label>
                        <input type="text" name="txtApellido" value="${cliente.apellido}" class="form-control">
                    </div>
                    <div class="col-sm-5">
                        <label for="Producto">Ingrese el nombre del producto : </label>
                        <input type="text" name="txtProducto" value="${cliente.producto}" class="form-control">
                    </div>
                    <div class="col-sm-5">
                        <label for="PrecioUnitario">Ingrese el precio unitario: </label>
                        <input type="text" name="txtPrecioUnitario" value="${cliente.precioUnitario}" class="form-control" required>
                    </div>
                    <br>
                    <button type="submit" value="Actualizar" name="accion" class="btn btn-outline-warning">Modificar <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil-square" viewBox="0 0 16 16">
                        <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
                        <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5z"/>
                        </svg></button>
                    <br>
                    <br>
                    <a href="vista/Index.jsp" class="btn btn-primary">Volver <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-return-left" viewBox="0 0 16 16">
                        <path fill-rule="evenodd" d="M14.5 1.5a.5.5 0 0 1 .5.5v4.8a2.5 2.5 0 0 1-2.5 2.5H2.707l3.347 3.346a.5.5 0 0 1-.708.708l-4.2-4.2a.5.5 0 0 1 0-.708l4-4a.5.5 0 1 1 .708.708L2.707 8.3H12.5A1.5 1.5 0 0 0 14 6.8V2a.5.5 0 0 1 .5-.5"/>
                        </svg></a>
                </div>
            </form>
        </div>
        <br>
        <footer>
            Derechos de autor: Emerson Humberto Carpaño Granados
        </footer>
    </body>
</html>
