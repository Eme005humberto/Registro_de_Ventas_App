<%-- 
    Document   : exito
    Created on : 07/01/2024, 10:26:52 AM
    Author     : Emerson Humberto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <title>Venta Realizada</title>
    </head>
    <body>
        <style>
            body{
                background-color: #f5f5f5;
            }
            .Exito{
                position: relative;
                left: 350px;
            }
            .Logo{
                position: relative;
                left: 150px;
            }
            h2{
                 font-family: serif;
            }
            .Salir{
                position: relative;
                left: 500px;
                top:50px;
            }
        </style>
        <div class="Exito">
            <h2>¡¡La venta se realizo correctamente!!</h2>
            <div class="Logo">
                <img src="../img/Venta.png" width="200">
            </div>
        </div>
        <div class="cotainer">
            <div class="${config}">
                ${mensaje}
            </div>
        </div>
            <div class="Salir">
                <a href="vista/Index.jsp">Regresar al menu principal</a>
            </div>
    </body>
</html>
