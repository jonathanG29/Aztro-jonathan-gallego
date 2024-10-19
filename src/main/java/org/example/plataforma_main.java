package org.example;


import org.example.plataform_educativa.models.Estudiante;
import org.example.plataform_educativa.models.Profesor;
import org.example.plataform_educativa.repositories.EstudianteRepository;
import org.example.plataform_educativa.repositories.ProfesorRepository;

public class plataforma_main {
    public static void main(String[] args) {

        EstudianteRepository estudianteRepository = new EstudianteRepository();
        ProfesorRepository profesorRepository = new ProfesorRepository();


        estudianteRepository.create(Estudiante.builder()
                .nombre("Juan")
                .apellido("Perez")
                .direccion("Calle Falsa 123")
                .telefono("555-1234")
                .build());

        estudianteRepository.findAll()
                .stream()
                    .forEach(System.out::println);


        profesorRepository.create(Profesor.builder()
                .nombre("Pedro")
                .apellido("Gomez")
                .departamento("Matematicas")
                .build());

        profesorRepository.findAll()
                .stream()
                    .forEach(System.out::println);

        estudianteRepository.close();
    }
}
