package org.example.plataform_educativa.repositories;


import org.example.plataform_educativa.configs.EntityManagerPostgres;
import org.example.plataform_educativa.models.Estudiante;

public class EstudianteRepository extends AbstractRepository<Estudiante> {
    public EstudianteRepository() {
        super(new EntityManagerPostgres());
    }
}
