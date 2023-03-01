package com.teconviene.teconviene.controller;

import com.teconviene.teconviene.model.Cliente;
import com.teconviene.teconviene.model.Factura;
import com.teconviene.teconviene.model.Servicio;
import com.teconviene.teconviene.service.ServicioCliente;
import com.teconviene.teconviene.service.ServicioServicio;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class ControladorFormFactura {
    @Autowired
    ServicioCliente servicioCliente;
    @GetMapping("/generarFactura")
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uri2 = "/WEB-INF/vistas/generarFactura.jsp";
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher dispatcher = request.getRequestDispatcher(uri2);
        List<Cliente> l = servicioCliente.getAllClientes();
        request.setAttribute("factura", new Factura());
        request.setAttribute("clientes", l);
        if (dispatcher != null) {
            dispatcher.forward(request, response);
        }
    }
}