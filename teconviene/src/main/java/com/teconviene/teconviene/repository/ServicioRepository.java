package com.teconviene.teconviene.repository;

import com.teconviene.teconviene.model.Cliente;
import com.teconviene.teconviene.model.Servicio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioRepository extends MongoRepository<Servicio, String> {

}
