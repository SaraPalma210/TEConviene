package com.teconviene.teconviene.controller;
import com.teconviene.teconviene.model.Cliente;
import com.teconviene.teconviene.service.ServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teconviene")
public class ControladorCliente {

    @Autowired
    private ServicioCliente servicioCliente;


    @PostMapping("/cliente")
    public Cliente createCliente(@Validated  @RequestBody	 Cliente cliente) {
        return servicioCliente.saveCliente(cliente);
    }

    @GetMapping("/cliente")
    public List<Cliente> readClientes(){
        return servicioCliente.getAllClientes();
    }

    @PutMapping("/cliente/{id}")
    public Cliente updateCliente(@PathVariable String id, @Validated @RequestBody Cliente cliente) {
        return servicioCliente.saveCliente(cliente);
    }

    @DeleteMapping("/cliente/{id}")
    public void deleteCliente(@PathVariable String id) {
        servicioCliente.deleteCliente(id);
    }

}
