<%-- 
    Document   : add
    Created on : 02/01/2024, 10:03:56 AM
    Author     : Emerson Humberto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <title>Realizar Venta</title>
    </head>
    <body>
        <style>
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

            h2{
                position: relative;
                left:400px;
                font-family: serif;
                top: 20px;
            }
            label{
                font-family: serif;
            }
            body {
                background-image: url('https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.freepik.es%2Ffotos-vectores-gratis%2Fpersona-pagando-con-tarjeta%2F6&psig=AOvVaw1MzGvkjNiCcly8jpSzPDnO&ust=1705176818291000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCOjy0evU2IMDFQAAAAAdAAAAABAD');
                background-size: 55% 100%; /* Ajusta el tamaño de la imagen al tamaño del elemento */
                background-repeat: no-repeat; /* Evita que la imagen se repita */
                /* Mueve la imagen completamente a la derecha del elemento contenedor */
                background-position: right top;
                background-attachment: fixed; /* Fija la imagen en la ventana de visualización */
            }
            body {
                margin: 0;
                padding: 0;
                font-family: Arial, sans-serif;
                background-color: #f5f5f5;
                margin: 0;
                overflow: hidden; /* Ocultar barras de desplazamiento */
                /* Mueve la imagen completamente a la derecha del elemento contenedor */
                background-position: right top;
                background-attachment: fixed; /* Fija la imagen en la ventana de visualización */
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

            .money-icon {
                position: absolute;
                font-size: 24px; /* Tamaño del icono */
                color: #4CAF50; /* Color del icono */
                animation: moveMoney 5s infinite alternate;
            }

            @keyframes moveMoney {
                from {
                    left: 0;
                }
                to {
                    left: calc(100% - 24px); /* 100% - el ancho del icono */
                }
            }
        </style>
        <h2>Agregar nueva venta</h2>
        <div class="money-icon">$</div>
        <div class="figure"></div>
        <div class="Procesar">
            <form action="SvClientes" method="POST">
                <div class="container">
                    <div class="col-sm-5">
                        <label for="Nombre">Ingrese el nombre del cliente: </label>
                        <input type="text" name="txtNombre"  class="form-control">
                    </div>
                    <div class="col-sm-5">
                        <label for="Apellido">Ingrese el apellido del cliente : </label>
                        <input type="text" name="txtApellido"  class="form-control">
                    </div>
                    <div class="col-sm-5">
                        <label for="Producto">Ingrese el nombre del producto : </label>
                        <input type="text" name="txtProducto"  class="form-control">
                    </div>
                    <div class="col-sm-5">
                        <label for="PrecioUnitario">Ingrese el precio unitario: </label>
                        <input type="text" name="txtPrecioUnitario" class="form-control" required>
                    </div>
                    <br>
                    <button type="submit" value="Agregar" name="accion" class="btn btn-outline-success">Agregar <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-bag-plus-fill" viewBox="0 0 16 16">
                        <path fill-rule="evenodd" d="M10.5 3.5a2.5 2.5 0 0 0-5 0V4h5zm1 0V4H15v10a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V4h3.5v-.5a3.5 3.5 0 1 1 7 0M8.5 8a.5.5 0 0 0-1 0v1.5H6a.5.5 0 0 0 0 1h1.5V12a.5.5 0 0 0 1 0v-1.5H10a.5.5 0 0 0 0-1H8.5z"/>
                        </svg></button>
                    <br>
                    <br>
                    <a href="vista/Index.jsp" class="btn btn-primary">Volver <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-return-left" viewBox="0 0 16 16">
                        <path fill-rule="evenodd" d="M14.5 1.5a.5.5 0 0 1 .5.5v4.8a2.5 2.5 0 0 1-2.5 2.5H2.707l3.347 3.346a.5.5 0 0 1-.708.708l-4.2-4.2a.5.5 0 0 1 0-.708l4-4a.5.5 0 1 1 .708.708L2.707 8.3H12.5A1.5 1.5 0 0 0 14 6.8V2a.5.5 0 0 1 .5-.5"/>
                        </svg></a></a>
                </div>
            </form>
        </div>
        <br>
        <footer>
            Derechos de autor: Emerson Humberto Carpaño Granados
        </footer>
    </body>
</html>
