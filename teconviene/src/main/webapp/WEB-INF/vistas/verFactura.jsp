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
	    Factura factura = (Factura) request.getAttribute("factura");

		out.println("<b> Factura nº: </b>" + factura.getId() + "<br><hr>");
		out.println("<h3><b> Cliente: </b></h3>");
		out.println("<b> Nombre: </b>" + factura.getCliente().getNombre() + "<br>");
		out.println("<b> Apellidos: </b>" + factura.getCliente().getNombre() + "<br>");
		out.println("<b> Correo: </b>" + factura.getCliente().getCorreo()  + "<br><br><hr>");
		out.println("<h3><b> Servicios: </b></h3>");

		List<Servicio> servicios = (List<Servicio>) factura.getCliente().getLista_servicios();
        double total = 0;
		for (Servicio s: servicios) {
    		out.println("<b> Nombre: </b>" + s.getNombre() + "<br>");
            out.println("<b> Precio: </b>" + s.getPrecio() + "€<br>");
            out.println("<br><br>");
            total += s.getPrecio();
		}
		out.println("<hr>");
		out.println("<h3><b> Precio total: </b>" + total + " €</h3>");
	%>


	</body>

</html>

