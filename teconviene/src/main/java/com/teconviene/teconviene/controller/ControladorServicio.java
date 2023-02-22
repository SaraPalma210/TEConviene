package com.teconviene.teconviene.controller;

import com.teconviene.teconviene.model.Servicio;
import com.teconviene.teconviene.service.ServicioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/teconviene")
public class ControladorServicio {

    @Autowired
    private ServicioServicio servicioServicio;


    @PostMapping("/servicio")
    public Servicio createServicio(@Validated @RequestBody @ModelAttribute Servicio servicio) { // @ModelAttribute
        return servicioServicio.saveServicio(servicio);
    }

    @GetMapping("/servicio")
    public List<Servicio> readServicios(){
        return servicioServicio.getAllServicios();
    }

    @PutMapping("/servicio/{id}")
    public Servicio updateServicio(@PathVariable String id, @Validated @RequestBody Servicio servicio) {
        return servicioServicio.saveServicio(servicio);
    }

    @DeleteMapping("/servicio/{id}")
    public void deleteServicio(@PathVariable String id) {
        servicioServicio.deleteServicio(id);
    }

}