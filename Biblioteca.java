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
/* 
    //Muestra la información de todos los libros en la biblioteca
    public void mostrarLibros()
    {
        for(Libro libro : this.libros)
        {
            libro.mostrarInformacion();
        }
    }

    
    // Busca un libro por su título y muestra su información si lo encuentra; 
    // de lo contrario, muestra un mensaje indicando que no se encontró el libro.
    public Libro buscarLibroPorTitulo(String titulo)
    {
        for(Libro libro : this.libros)
        {
            if(libro.getTitulo().equals(titulo))
            {
                return libro;
            }
        }
        return null;
    }
*/

    // Buscar libros Prestados
    public ArrayList<Libro> buscarPrestados() {
        ArrayList<Libro> prestados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getPrestado()) {
                prestados.add(libro);
            }
        }
        return prestados;
    }

    // Buscar libros No Prestados
    public ArrayList<Libro> buscarNoPrestados() {
        ArrayList<Libro> noPrestados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (!libro.getPrestado()) {
                noPrestados.add(libro);
            }
        }
        return noPrestados;
    }
}