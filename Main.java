import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Breaking Through the Clouds", "Huai Shang",2017, "978-7559436399", false);
        Libro libro2 = new Libro("The Grave Robbers' Chronicles Vol 1-6","Xu Lei",2014,"978-1934159378",true);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        ArrayList<Libro> librosPrestados = biblioteca.buscarPrestados();
        System.out.println("\n\tLibros prestados:");
        for (Libro libro : librosPrestados) {
            System.out.println( "Título: " + libro.getTitulo() + 
                                "\nAutor: " + libro.getAutor() + 
                                "\nAño de publicación: " + libro.getAñoPublicacion() + 
                                "\nISBN: " + libro.getIsbn() + 
                                "\nPrestado: " + libro.getPrestado());
        }

        ArrayList<Libro> librosNoPrestados = biblioteca.buscarNoPrestados();
        System.out.println("\n\tLibros no prestados:");
        for (Libro libro : librosNoPrestados) {
            System.out.println( "Título: " + libro.getTitulo() + 
                                "\nAutor: " + libro.getAutor() + 
                                "\nAño de publicación: " + libro.getAñoPublicacion() + 
                                "\nISBN: " + libro.getIsbn() + 
                                "\nPrestado: " + libro.getPrestado());
        }
    }
}
