package org.example.Biblioteca.repositories;

import org.example.Biblioteca.configs.EntityManagerPostgres;
import org.example.Biblioteca.models.Usuarios;


public class UsuarioRepository extends AbstractRepository<Usuarios> {
    public UsuarioRepository() {
        super(new EntityManagerPostgres());
    }
}
