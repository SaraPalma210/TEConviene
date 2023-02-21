package com.teconviene.teconviene.service;

import com.teconviene.teconviene.model.Cliente;
import com.teconviene.teconviene.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ServicioCliente {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> getAllClientes(){
        return clienteRepository.findAll();
    }

    public void deleteCliente(String id) {
        clienteRepository.deleteById(id);
    }

}
