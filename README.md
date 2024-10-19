## Decripcion
este repositorio contiene un proyecto de practica para el curso de base de datos de postgresql

## ejericicio 1
Un sistema almacena la información de un supermercado, en la cual se relacione la
información de los clientes, los productos que compran, la marca de cada producto y
las ventas que se realizan de cada uno de ellos por registro. Un cliente puede
realizar varias compras en el supermercado y tener varios productos en una sola
compra. Un producto puede estar relacionado a una marca. Una marca puede tener
varios productos.

## ejericicio 2
Un sistema de empleados define que un empleado pertenece a un departamento y
está relacionado a un proyecto, cada proyecto puede tener varios empleados
relacionados, adicional debe tener la información de sus salarios y las cuentas a las
que se realiza el pago.

## ejericicio 3
Un sistema de relación de cursos almacena en una base de datos la información de
los cursos y los estudiantes relacionados, cada registro almacena actualmente la
información del estudiante, el curso relacionado, el profesor que dicta dicha materia,
y un registro por nota. Cada curso puede tener entre una y siete notas y un profesor
puede dictar varias clases, pero una clase solo puede estar relacionada a un
profesor.


## estructura de los archivos
```
├── README.md
├── src
│   ├── java
│   │   └── org.example 
│   │       ├── Biblioteca
│   │       ├── plataform_educativa
│   │       └── supermercado
│   └── Biblioteca_main.java
│   └── plataform_educativa_main.java
│   └── supermercado_main.java
└── resources
    ├── META-INF
        └── persistence.xml
```