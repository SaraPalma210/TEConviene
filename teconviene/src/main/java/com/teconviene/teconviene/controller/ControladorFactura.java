package com.teconviene.teconviene.controller;

import com.teconviene.teconviene.model.Factura;
import com.teconviene.teconviene.service.ServicioFactura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teconviene")
public class ControladorFactura {

    @Autowired
    private ServicioFactura servicioFactura;


    @PostMapping("/factura")
    public Factura createFactura(@Validated @ModelAttribute  Factura factura) { // @ModelAttribute
        return servicioFactura.saveFactura(factura);
    }

    @GetMapping("/factura")
    public List<Factura> readFacturas(){
        return servicioFactura.getAllFacturas();
    }

    @PutMapping("/factura/{id}")
    public Factura updateFactura(@PathVariable String id, @Validated @RequestBody Factura factura) {
        return servicioFactura.saveFactura(factura);
    }

    @DeleteMapping("/factura/{id}")
    public void deleteFactura(@PathVariable String id) {
        servicioFactura.deleteFactura(id);
    }

}