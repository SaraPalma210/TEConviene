<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Dar alta servicio</title>
</head>
<body>
<h1>Formulario alta servicio</h1>
<form th:object="${servicio}" action="/api/teconviene/servicio" method="post">
        ID: <input th:field="*{id}" type="text" name="id"><br>
        Nombre: <input th:field="*{nombre}" type="text" name="nombre"><br>
        Precio: <input th:field="*{precio}" type="text" name="precio"><br>
        <input type="submit" value="Confirmar">
</form>
</body>
</html>