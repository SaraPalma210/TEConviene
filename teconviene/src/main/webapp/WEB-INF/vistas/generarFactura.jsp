<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Formulario factura</title>
</head>
<body>
<h1>Formulario factura</h1>
<form th:object="${factura}" action="/api/teconviene/factura" method="post">
        ID: <input th:field="*{id}" type="text" name="id"><br>
        ID Cliente: <input th:field="*{id_cliente}" type="text" name="id_cliente"><br>
        : <input th:field="*{apellido}" type="text" name="apellido"><br>
        Correo: <input th:field="*{correo}" type="text" name="correo"><br>
        <input type="submit" value="Confirmar">
</form>
</body>
</html>