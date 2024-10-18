package org.example.Supermercado.repositories;

import org.example.Supermercado.configs.EntityManagerPostgres;
import org.example.Supermercado.models.Cliente;


public class ClienteRepository extends AbstractRepository<Cliente> {
    public ClienteRepository() {
        super(new EntityManagerPostgres());
    }
}
