package com.teconviene.teconviene.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("facturas")
public class Factura {
    @Id
    private String id;

    private Cliente cliente;

    private List<Servicio> servicioList;

    private double total;
}
