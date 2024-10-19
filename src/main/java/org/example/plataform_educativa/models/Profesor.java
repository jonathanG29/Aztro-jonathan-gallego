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
public class Profesor {
    @Id
    private int id_profesor;
    private String nombre;
    private String apellido;
    private String departamento;
}
