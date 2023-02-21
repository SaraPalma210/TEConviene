package com.teconviene.teconviene.repository;

import com.teconviene.teconviene.model.Factura;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends MongoRepository<Factura, String> {

}
