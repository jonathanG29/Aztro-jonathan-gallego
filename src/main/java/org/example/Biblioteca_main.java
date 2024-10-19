package org.example;


import org.example.Biblioteca.models.Autores;
import org.example.Biblioteca.models.Usuarios;
import org.example.Biblioteca.repositories.AutoresRepository;
import org.example.Biblioteca.repositories.UsuarioRepository;

public class Biblioteca_main {
    public static void main(String[] args) {

        AutoresRepository autoresRepository = new AutoresRepository();
        UsuarioRepository usuarioRepository = new UsuarioRepository();

        autoresRepository.create(Autores.builder()
                .id_autor(1)
                .nombre("Juan")
                .apellido("Perez")
                .build());

        autoresRepository.findAll()
                .stream()
                    .forEach(System.out::println);

        usuarioRepository.create(Usuarios.builder()
                .id_usuario(1)
                .nombre("Pedro")
                .apellido("Gomez")
                .build());

        usuarioRepository.findAll()
                .stream()
                    .forEach(System.out::println);

        autoresRepository.close();
    }
}
