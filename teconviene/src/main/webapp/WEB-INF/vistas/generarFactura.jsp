<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="java.util.List,com.teconviene.teconviene.model.*" %>
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
<<<<<<< HEAD
<h1>Formulario factura</h1>
<div class="caja">
<form th:object="${factura}" action="/api/teconviene/factura" method="post">
        Cliente:  <select th:field="*{factura.cliente}" name="cliente">
        <br>
=======
    <h1>FORMULARIO FACTURA</h1>
    <div class="caja">
        <form th:object="${factura}" action="/api/teconviene/factura" method="post">
            <b>Cliente:</b> &nbsp; &nbsp;
            <select th:field="*{factura.cliente}" name="factura"><br>
>>>>>>> b686ca0bce5fe0fa367641b5b0e097bda897f817
            <%
            List<Cliente> l = (List<Cliente>) request.getAttribute("clientes");
            for (int i = 0; i < l.size(); i++) {
            %>
<<<<<<< HEAD
            <option value="<%=l.get(i).getId()%>"><%=l.get(i).getId()%></option> <br>
=======
            <option class="option" value="<%=l.get(i).getNombre()%>"><%=l.get(i).getNombre()%></option> <br>
>>>>>>> b686ca0bce5fe0fa367641b5b0e097bda897f817
            <%
            }
            %>
            <br>
            <input class="boton" type="submit" value="Generar factura">
        </form>
    </div>
</body>
</html>