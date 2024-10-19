package org.example.Biblioteca.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuarios {
    @Id
    private int id_usuario;
    private String nombre;
    private String apellido;
}
