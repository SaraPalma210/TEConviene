package com.teconviene.teconviene.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("clientes")

public class Cliente {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String correo;

}
