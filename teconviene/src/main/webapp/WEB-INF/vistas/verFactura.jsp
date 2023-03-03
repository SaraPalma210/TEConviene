<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.List,com.teconviene.teconviene.model.*, java.util.Iterator" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<title>Informe factura</title>
		<style type="text/css" media="screen">
             <%@ include file="estilos.css" %>
        </style>
	</head>

	<body>
	    <h1> INFORME FACTURA </h1>
	<%
	Factura factura = request.getAttribute("factura");

		out.println("<b> ID: </b>" + factura.getId();
		out.println("<b> Nombre: </b>" + factura.getCliente().getNombre().substring(1, factura.getCliente().getNombre().length() - 1));
	%>


	</body>

</html>

