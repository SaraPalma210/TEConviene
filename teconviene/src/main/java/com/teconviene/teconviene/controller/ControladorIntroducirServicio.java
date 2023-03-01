package com.teconviene.teconviene.controller;

import com.teconviene.teconviene.model.Cliente;
import com.teconviene.teconviene.model.Servicio;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class ControladorIntroducirServicio {

    @GetMapping("/introducirServicio")
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uri2 = "/WEB-INF/vistas/meter.jsp";
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher dispatcher = request.getRequestDispatcher(uri2);
        request.setAttribute("cliente", new Cliente());

        if (dispatcher != null) {
            dispatcher.forward(request, response);
        }
    }
}