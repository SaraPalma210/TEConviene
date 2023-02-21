package com.teconviene.teconviene.service;

import com.teconviene.teconviene.model.Cliente;
import com.teconviene.teconviene.model.Servicio;
import com.teconviene.teconviene.repository.ClienteRepository;
import com.teconviene.teconviene.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioServicio {
    @Autowired
    private ServicioRepository servicioRepository;

    public Servicio saveServicio(Servicio servicio) {
        return servicioRepository.save(servicio);
    }

    public List<Servicio> getAllServicios(){
        return servicioRepository.findAll();
    }

    public void deleteServicio(String id) {
        servicioRepository.deleteById(id);
    }
}
