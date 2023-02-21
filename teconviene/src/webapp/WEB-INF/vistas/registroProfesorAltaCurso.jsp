<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.List,com.hg.microservices.models.*, java.util.*, java.io.*" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Dar alta curso en profesor</title>
</head>
<body>
<h1>FORM desde JSP</h1>
<form th:object="${curso}" action="/api/colegio/curso" method="post">
        ID del profesor <input th:field="*{teacher.id}" type="text" name="teacher.id"><br>
        Nombre del curso: <input th:field="*{name}" type="text" name="name"><br>
        <input type="submit" value="Confirmar">        
        
</form>
</body>
</html>