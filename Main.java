import java.util.*;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor(294665, "Huai Shang", "294665@jjwxc.net");
        Autor autor2 = new Autor(1322620, "Mo Xiang Tong Xiu", "1322620@jjwxc.net");
        
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Breaking Through the Clouds", autor1, 2017, "978-7559436399", false);
        Libro libro2 = new Libro("The Grandmaster of Demonic Cultivation",autor2, 2022,"978-3842085329",true);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Mostrar todos los libros
        System.out.println(biblioteca.toString());
        System.out.println(biblioteca.toStringLibrosPrestados());
        System.out.println(biblioteca.toStringLibrosNoPrestados());

    }
}
