PROJECT TITLE: 
Práctica 3 Clases, objetos, constructores, atributos y métodos

PURPOSE OF PROJECT: Diseñar y desarrollar aplicaciones utilizando los principios fundamentales de la Programación Orientada a Objetos en Java. Esto incluye la capacidad de definir clases y objetos que modelen entidades del mundo real, utilizando constructores para inicializar objetos y encapsulando datos a través de atributos y métodos, implementando operaciones básicas sobre los objetos, promoviendo la reutilización del código y la organización estructurada de programas, con actitud reflexiva.

VERSION or DATE: Version 1 (04/09/2024)

HOW TO START THIS PROJECT:

AUTHORS: Ana Chen Zhang

USER INSTRUCTIONS:
Desarrollar un programa para gestionar la información de una biblioteca. La biblioteca maneja una colección de libros, y se requiere implementar un sistema que permita realizar operaciones básicas sobre los libros, tales como agregar un nuevo libro, mostrar la información de un libro específico, y listar todos los libros de la biblioteca.

Requisitos
    Clase Libro:
        Atributos:
            titulo (String): Título del libro.
            autor (String): Autor del libro.
            añoPublicacion (int): Año de publicación.
            isbn (String): Número ISBN del libro.
        Constructores:
            Constructor que inicialice todos los atributos de la clase.
        Métodos:
            mostrarInformacion(): Muestra la información del libro en consola.
            esAntiguo(): Devuelve true si el libro fue publicado hace más de 20 años, y false en caso contrario.
    Clase Biblioteca:
        Atributos:
            libros (ArrayList<Libro>): Una lista de objetos Libro que representa los libros de la biblioteca.
        Constructores:
            Constructor que inicialice la lista de libros como una lista vacía.
        Métodos:
            agregarLibro(Libro libro): Añade un libro a la biblioteca.
            mostrarLibros(): Muestra la información de todos los libros en la biblioteca.
            buscarLibroPorTitulo(String titulo): Busca un libro por su título y muestra su información si lo encuentra; de lo contrario, muestra un mensaje indicando que no se encontró el libro.

Actividades
    Crear la clase Libro:
        Definir los atributos y el constructor.
        Implementar los métodos mostrarInformacion() y esAntiguo().
    Crear la clase Biblioteca:
        Definir el atributo y el constructor.
        Implementar los métodos agregarLibro(), mostrarLibros() y buscarLibroPorTitulo().
    Pruebas:
        Crear una clase Main donde se realicen las siguientes acciones:
            Crear al menos 3 objetos Libro y añadirlos a un objeto Biblioteca.
            Utilizar el método mostrarLibros() para mostrar la información de todos los libros.
            Buscar un libro por título utilizando el método buscarLibroPorTitulo() y mostrar su información.

Consideraciones
    Aplicar las convenciones de nombres en Java (CamelCase y PascalCase).
    Generar código legible para mejorar el mantenimiento.
    Verificar el funcionamiento correcto del programa mediante pruebas exhaustivas.

