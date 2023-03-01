<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="java.util.List,com.teconviene.teconviene.model.*" %>
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
    <div class="caja">
        <form th:object="${cliente}" action="/api/teconviene/cliente" method="post">
            <b>ID:</b> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
            <input th:field="*{id}" type="text" name="id"><br>
            <b>Nombre:</b> &nbsp; &nbsp;&nbsp;
            <input th:field="*{nombre}" type="text" name="nombre"><br>
            <b>Apellidos:</b> &nbsp;&nbsp;
            <input th:field="*{apellido}" type="text" name="apellido"><br>
            <b>Correo:</b> &nbsp; &nbsp; &nbsp;&nbsp;
            <input th:field="*{correo}" type="text" name="correo"><br>
            <b>Servicio(s):</b> <br>
                <%
                    List<Servicio> l = (List<Servicio>) request.getAttribute("servicios");
                    for (int i = 0; i < l.size(); i++) {
                %>
            <input type="checkbox" th:field="*{cliente.lista_servicios}" name="lista_servicios" value="<%=l.get(i).getId()%>"><%=l.get(i).getNombre()%></option> <br>
                <%
                    }
                %>
            <br>
            <input class="boton" type="submit" value="Confirmar">
        </form>
    </div>
</body>
</html>