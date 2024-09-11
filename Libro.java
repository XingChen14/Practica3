/**
 * Write a description of class Libro here.
 * 
 * @author Ana Chen Zhang
 * @version 11/09/2024
 */
import java.time.LocalDate;

public class Libro {
    private final String titulo; // Título del libro
    private final String autor; // Autor del libro
    private final int añoPublicacion; // Año de publicación
    private final String isbn; // Número ISBN del libro
    private final boolean prestado; // Ver si el libr se presto o no

    /**
     * Constructor por defecto para objetos de la clase Libro.
     */
    public Libro() {
        this.titulo = "The Grave Robbers' Chronicles Vol 1-6";
        this.autor = "Xu Lei";
        this.añoPublicacion = 2014;
        this.isbn = "978-1934159378";
        this.prestado = false;
    }

    /**
     * Constructor con parámetros para objetos de la clase Libro.
     * 
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param añoPublicacion Año de publicación
     * @param isbn Número ISBN del libro
     */
    public Libro(String titulo, String autor, int añoPublicacion, String isbn, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
        this.prestado = prestado;
    }
/* 
   //Muestra la información del libro en consola.
    public void mostrarInformacion() {
        System.out.println("\tInformación del Libro\nTítulo: " + titulo + "\nAutor: " + autor 
            + "\nAño de publicación: " + añoPublicacion + "\nISBN: " + isbn + "\nPrestado: " + prestado);
    }
*/
    //Devuelve true si el libro fue publicado hace más de 20 años, y false en caso contrario.
    public boolean esAntiguo() {
        int añoActual = LocalDate.now().getYear();
        return (añoActual - añoPublicacion > 20);
    }

    // Getters for the fields
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean getPrestado() {
        return prestado;
    }

}
