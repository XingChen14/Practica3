/**
 * Write a description of class Libro here.
 * 
 * @author Ana Chen Zhang
 * @version 11/09/2024
 */
import java.time.LocalDate;

public class Libro {
    private String titulo; // Título del libro
    private String autor; // Autor del libro
    private int añoPublicacion; // Año de publicación
    private String isbn; // Número ISBN del libro
    private boolean prestado; // Ver si el libr se presto o no

    /**
     * Constructor por defecto para objetos de la clase Libro.
     
    public Libro() {
        this.titulo = "The Grave Robbers' Chronicles Vol 1-6";
        this.autor = "Xu Lei";
        this.añoPublicacion = 2014;
        this.isbn = "978-1934159378";
        this.prestado = false;
    }*/

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

    // Setters for the fields
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void getPrestado(boolean prestado) {
        this.prestado = prestado;
    }
/* 
    // Método para prestar un libro
    public void prestar() {
        this.prestado = true;
    }

    // Método para devolver un libro
    public void devolver() {
        this.prestado = false;
    }
    */
}
