<%-- 
    Document   : mensaje
    Created on : 02/01/2024, 10:48:08 AM
    Author     : Emerson Humberto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <title>Error</title>
    </head>
    <body>
        <style>
            body{
                background-color: #f5f5f5;
            }
        </style>
        <div class="cotainer">
            <div class="${config}">
                ${mensaje}
            </div>
        </div>
            <a href="vista/Index.jsp">Regresar al menu principal</a>
    </body>
</html>
