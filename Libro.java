import java.util.*;
import java.time.*;

/**
 * Write a description of class Libro here.
 * 
 * @author Ana Chen Zhang
 * @version 04/09/2024
 */
public class Libro
{
    private String titulo; //Titulo del libro
    private String autor; //Autor del libro
    private int añoPublicacion; //Año de publicación
    private String isbn; //Número ISBN del libro.

    /**
     * Constructor for objects of class Libro
     */
    public Libro()
    {
        titulo = "The Grave Robbers' Chronicles Vol 1-6";
        autor = "Xu Lei";
        añoPublicacion = 2014;
        isbn = "978-1934159378";
    }
    
    public Libro(String titulo,String autor,int añoPublicacion,String isbn)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
    }
    
    /**
     * Muestra la información del libro en consola.
     * 
     * @param  titulo            Titulo del libro
     * @param  autor             Autor del libro
     * @param  añoPublicacion    Año de publicación
     * @param  isbn              Número ISBN del libro. 
     */
    public void mostrarInformacion()
    {
        System.out.println("\tInformacion del Libro\nTitulo: "+titulo+"\nAutor: "+autor+"\nAño de publicación: "+añoPublicacion+"\nISBN: "+isbn);
    }
    
    /**
     * Devuelve true si el libro fue publicado hace más de 20 años, y false en caso contrario.
     * 
     * @param  añoPublicacion    Año de publicación
     */
    public boolean esAntiguo()
    {
        int añoActual = LocalDate.now().getYear();
        
        if (añoActual - añoPublicacion > 20)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Obtiene el titulo
     * 
     * @return  titulo    Titulo del libro
     */
    public String getTitulo()
    {
        return titulo;
    }
}
