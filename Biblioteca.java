/**
 * Write a description of class Biblioteca here.
 * 
 * @author Ana Chen Zhang
 * @version 11/09/2024
 */
import java.util.*;
public class Biblioteca
{
    private final ArrayList<Libro> libros; //Una lista de objetos Libro que representa los libros de la biblioteca.

    //Constructor for objects of class Biblioteca
    public Biblioteca()
    {
        this.libros = new ArrayList<>();
    }

    //Añade un libro a la biblioteca
    public void agregarLibro(Libro libro)
    {
        this.libros.add(libro);
    }

    // Buscar libros Prestados
    public String toStringLibrosPrestados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libros prestados en la biblioteca:\n");
        for (Libro libro : libros) {
            if (libro.getPrestado()) {  // Verifica si el libro está prestado
                sb.append("Título: ").append(libro.getTitulo())
                  .append(", Autor: ").append(libro.getAutor())
                  .append(", Año: ").append(libro.getAñoPublicacion())
                  .append(", ISBN: ").append(libro.getIsbn())
                  .append("\n");
            }
        }
        return sb.toString();
    }

    // Buscar libros No Prestados
    public String toStringLibrosNoPrestados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libros no prestados en la biblioteca:\n");
        for (Libro libro : libros) {
            if (!libro.getPrestado()) {  // Verifica si el libro NO está prestado
                sb.append("Título: ").append(libro.getTitulo())
                  .append(", Autor: ").append(libro.getAutor())
                  .append(", Año: ").append(libro.getAñoPublicacion())
                  .append(", ISBN: ").append(libro.getIsbn())
                  .append("\n");
            }
        }
        return sb.toString();
    }

    public List<Libro> getLibros() {
        return libros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libros en la biblioteca:\n");
        for (Libro libro : libros) {
            sb.append("Título: ").append(libro.getTitulo())
            .append(", Autor: ").append(libro.getAutor())
            .append(", Año: ").append(libro.getAñoPublicacion())
            .append(", ISBN: ").append(libro.getIsbn())
            .append(", Prestado: ").append(libro.getPrestado())
            .append("\n");
        }
        return sb.toString();
    }
}