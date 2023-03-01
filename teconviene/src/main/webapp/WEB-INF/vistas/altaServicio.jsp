<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Dar alta servicio</title>
    <style type="text/css" media="screen">
        <%@ include file="estilos.css" %>
    </style>
</head>
<body>
    <h1>FORMULARIO ALTA SERVICIO</h1>
    <div class="caja">
        <form th:object="${servicio}" action="/api/teconviene/servicio" method="post">
            <b>ID:</b> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
            <input th:field="*{id}" type="text" name="id"><br>
            <b>Nombre:</b> &nbsp; &nbsp;&nbsp;
            <input th:field="*{nombre}" type="text" name="nombre"><br>
            <b>Precio:</b> &nbsp; &nbsp; &nbsp;&nbsp;
            <input th:field="*{precio}" type="text" name="precio"><br>
            <input class="boton" type="submit" value="Confirmar">
        </form>
    </div>
</body>
</html>