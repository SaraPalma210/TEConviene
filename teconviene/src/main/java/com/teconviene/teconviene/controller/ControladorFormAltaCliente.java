package com.teconviene.teconviene.controller;

import com.teconviene.teconviene.model.Cliente;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class ControladorFormAltaCliente {

    @GetMapping("/darAltaProfesor")
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uri2 = "/WEB-INF/vistas/registroProfesor.jsp";
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher dispatcher = request.getRequestDispatcher(uri2);
        request.setAttribute("cliente", new Cliente());
        if (dispatcher != null) {
            dispatcher.forward(request, response);
        }
    }
}