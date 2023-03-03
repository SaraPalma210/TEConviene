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

    <h1>FORMULARIO FACTURA</h1>
    <div class="caja">
<form th:object="${factura}" action="/api/teconviene/factura" method="post">
                    Cliente:  <select th:field="*{factura.cliente}" name="cliente">

            <%
            List<Cliente> l = (List<Cliente>) request.getAttribute("clientes");
            for (int i = 0; i < l.size(); i++) {
            %>
            <option class="option" value="<%=l.get(i).getNombre()%>"><%=l.get(i).getNombre()%></option> <br>
            <%
            }
            %>
            <br>
            <input class="boton" type="submit" value="Generar factura">
        </form>
    </div>
</body>
</html>