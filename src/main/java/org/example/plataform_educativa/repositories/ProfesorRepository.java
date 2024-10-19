package org.example.plataform_educativa.repositories;

import org.example.plataform_educativa.configs.EntityManagerPostgres;
import org.example.plataform_educativa.models.Profesor;


    public class ProfesorRepository extends AbstractRepository<Profesor> {
        public ProfesorRepository() {
            super(new EntityManagerPostgres());
        }

}
