PROJECT TITLE:
Práctica #4 - Comunicación y composición entre objetos

PURPOSE OF PROJECT: Modificar programas orientados a objetos para satisfacer nuevos requerimientos aplicando los principios de comunicación y composición entre objetos. Esto incluye la capacidad de redefinir clases y objetos que modelan entidades del mundo real, utilizando constructores para inicializar objetos y encapsulando datos a través de atributos y métodos, implementando operaciones básicas sobre los objetos, promoviendo la reutilización del código y la organización estructurada de programas, con actitud reflexiva.

VERSION or DATE: 11/09/2024

HOW TO START THIS PROJECT:

AUTHORS: Ana Chen Zhang

USER INSTRUCTIONS:
Agregar funcionalidad al programa para gestionar la información de una biblioteca, desarrollado en la Práctica #3. Se requiere que además de los requerimientos definidos originalmente:
"La biblioteca maneja una colección de libros, y se requiere implementar un sistema que permita realizar operaciones básicas sobre los libros, tales como agregar un nuevo libro, mostrar la información de un libro específico, y listar todos los libros de la biblioteca."
Cumpla con los siguientes nuevos requerimientos:
    Que el Autor sea un objeto que tenga los atributos id,nombre y correo electrónico.
    Que el Libro tenga un atributo para identificar si está prestado o no.
    Que la Biblioteca tenga un método que regrese la lista de libros que están prestados o la lista de libros que no están prestados.
    Que las clases Autor, Libro y Biblioteca no utilicen System.out.println ni cualquier otro método para desplegar en consola. Todo el despliegue será desde el método main() de la clase principal.
Actividades
    Las modificaciones se van a trabajar en el mismo repositorio de la Práctica 3 pero en una nueva rama (branch)  de código.  Para crear un branch en el repositorio de la Práctica3 y ubicarse en dicha rama se puede hacer de la siguiente manera:
        git branch practica4
        git checkout practica4
        Verificar que están en el branch adecuado con git branch
    Modificar el código actual para cumplir con el punto 4 de los nuevos requerimientos antes de agregar más clases y funcionalidad.
        Modificar la clase con el main() para probar que el programa funcione correctamente.
    Crear la clase Autor.
    Modificar la clase Libro para que utilice la nueva clase Autor.
        Modificar la clase con el main() para probar que el programa funcione correctamente.
    Modificar la clase Libro para agregar el nuevo atributo y métodos relacionados con el atributo 2.
    Modificar la clase Biblioteca para implementar el requerimiento 3.
        Modificar la clase con el main() para probar que el programa funcione correctamente.
    (Opcional) Agregar una clase Préstamo que relacione un objeto Libro y un objeto Lector y modificar la clase Biblioteca para incluir una lista de préstamos y los métodos necesarios para agregar y borrar un préstamo así como un método que regrese la lista de préstamos. Modificar el código de la clase con el main() para probar la funcionalidad.
    Hacer commit del branch en el repositorio local y subir el branch a GitHub.
Consideraciones
    Aplicar las convenciones de nombres en Java (CamelCase y PascalCase).
    Generar código legible para mejorar el mantenimiento.
    Verificar el funcionamiento correcto del programa mediante pruebas exhaustivas.
Entrega
    El programa debe ser entregado en un repositorio de GitHub, el cual será el mismo repositorio de la Práctica #3 con el nuevo branch practica4.
