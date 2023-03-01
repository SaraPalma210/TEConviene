<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>FORMULARIO FACTURA</title>
<style type="text/css" media="screen">
     <%@ include file="estilos.css" %>
</style>
</head>
<body>
<h1>Formulario factura</h1>
</div class="caja">
<form th:object="${factura}" action="/api/teconviene/factura" method="post">
        <b>ID:</b> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
        <input th:field="*{id}" type="text" name="id"><br>
        <b>ID Cliente:</b>
        <input th:field="*{id_cliente}" type="text" name="id_cliente"><br>
        : <input th:field="*{apellido}" type="text" name="apellido"><br>
        Correo: <input th:field="*{correo}" type="text" name="correo"><br>
        <input class="boton" type="submit" value="Confirmar">
</form>
</div>
</body>
</html>