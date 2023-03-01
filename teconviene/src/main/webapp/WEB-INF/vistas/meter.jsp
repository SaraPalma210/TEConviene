<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="java.util.List,com.teconviene.teconviene.model.*"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Dar alta cliente</title>
</head>
<body>
<h1>Formulario alta cliente</h1>
<form th:object="${cliente}" action="/api/teconviene/cliente" method="post">
        ID Cliente: <input th:field="*{cliente.id}" type="text" name="id"><br>
        Servicio:
                        <%
                            List<Servicio> l = (List<Servicio>) request.getAttribute("servicios");
                            for (int i = 0; i < l.size(); i++) {
                        %>
                        <input type="checkbox" th:field="*{servicios.id}" name="servicios.id" value="<%=l.get(i).getId()%>"><%=l.get(i).getId()%></option>
                        <%
                            }
                        %>
                        <br>
        <input type="submit" value="Confirmar">
</form>
</body>
</html>