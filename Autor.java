
/**
 * Write a description of class Autor here.
 * 
 * @author Ana Chen Zhang
 * @version 11/09/2024
 * 
 * Autor sea un objeto que tenga los atributos id,nombre y correo electrónico.
 */

 public class Autor {
    private int id;
    private String autor;
    private String correo;

    // Constructor for the Autor class
    /*public Autor() {
        id = 294665;
        autor = "Huai Shang";
        correo = "294665@jjwxc.net";
    }*/
    public Autor(int id, String autor, String correo) {
        this.id = id;
        this.autor = autor;
        this.correo = correo;
    }

    // Getters for the fields
    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getCorreo() {
        return correo;
    }

    // Setters for the fields
    public void setId(int id) {
        this.id = id;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void getCorreo(String correo) {
        this.correo = correo;
    }
}


