package org.example;

import org.example.Supermercado.models.Cliente;
import org.example.Supermercado.repositories.ClienteRepository;

public class Supermercado_main {
    public static void main(String[] args) {

        ClienteRepository clienteRepository = new ClienteRepository();


        Cliente nuevoCliente = Cliente.builder()
                .cedula(123456)
                .nombre("pablo")
                .apellido("Perez")
                .direccion("Calle Falsa 123")
                .telefono("555-1234")
                .build();

        clienteRepository.create(nuevoCliente);

        clienteRepository.findAll()
                .stream()
                    .forEach(System.out::println);


        clienteRepository.close();
    }
}
