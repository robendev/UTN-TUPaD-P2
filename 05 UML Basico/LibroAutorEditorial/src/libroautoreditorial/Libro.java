/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libroautoreditorial;

/**
 *
 * @author iRb18
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor; // Asociación unidireccional
    private Editorial editorial; // Agregación

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        
return "Libro{" +
           "titulo='" + titulo + "', " +
           "isbn='" + isbn + "', " +
           "autor=" + (autor != null ? autor.getNombre() : "Sin autor") + ", " +
           "editorial=" + editorial +
           '}';
    }
}
