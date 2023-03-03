package com.teconviene.teconviene.controller;

import com.teconviene.teconviene.model.Cliente;
import com.teconviene.teconviene.model.Factura;
import com.teconviene.teconviene.model.Servicio;
import com.teconviene.teconviene.service.ServicioFactura;
import com.teconviene.teconviene.service.ServicioServicio;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;
import java.util.List;

@Controller
public class ControladorInformeFactura {

    @Autowired
    ServicioFactura servicioFactura;
    @GetMapping("/verFactura/{id}")
    protected void doGet(HttpServletRequest request, HttpServletResponse response, @PathVariable String id)
            throws ServletException, IOException {
        String uri2 = "/WEB-INF/vistas/verFactura.jsp";
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher dispatcher = request.getRequestDispatcher(uri2);
        Factura f = servicioFactura.getById(id);
        request.setAttribute("factura", f);
        if (dispatcher != null) {
            dispatcher.forward(request, response);
        }
    }
}