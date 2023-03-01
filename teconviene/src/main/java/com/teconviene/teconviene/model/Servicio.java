package com.teconviene.teconviene.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("servicios")

public class Servicio implements Serializable{
    @Id
    private String id;

    private String nombre;
    private double precio;
}
