package org.example.plataform_educativa.models;

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
public class Curso {
    @Id
    private int id_curso;
    private String nombre;
    private String descripcion;
}
