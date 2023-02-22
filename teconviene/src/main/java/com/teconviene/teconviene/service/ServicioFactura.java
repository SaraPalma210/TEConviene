package com.teconviene.teconviene.service;

import com.teconviene.teconviene.model.Cliente;
import com.teconviene.teconviene.model.Factura;
import com.teconviene.teconviene.repository.ClienteRepository;
import com.teconviene.teconviene.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioFactura {

    @Autowired
    private FacturaRepository facturaRepository;

    public Factura saveFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    public List<Factura> getAllFacturas(){
        return facturaRepository.findAll();
    }

    public void deleteFactura(String id) {
        facturaRepository.deleteById(id);
    }

}
