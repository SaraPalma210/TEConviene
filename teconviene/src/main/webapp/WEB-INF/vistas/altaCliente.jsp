<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Dar alta cliente</title>
<style type="text/css" media="screen">
     <%@ include file="estilos.css" %>
</style>
</head>
<body>
<h1>FORMULARIO ALTA CLIENTE</h1>
<form th:object="${cliente}" action="/api/teconviene/cliente" method="post">
        ID: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
        <input th:field="*{id}" type="text" name="id"><br>
        Nombre: &nbsp; &nbsp;&nbsp;
        <input th:field="*{nombre}" type="text" name="nombre"><br>
        Apellidos: <input th:field="*{apellido}" type="text" name="apellido"><br>
        Correo: <input th:field="*{correo}" type="text" name="correo"><br>
        <input type="submit" value="Confirmar">
</form>
</body>
</html>