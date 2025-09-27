/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbibliotecaria;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author iRb18
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
    
    public void listarLibros() {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("\nLISTADO DE LIBROS\n");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        Libro buscado = null;
        int i = 0;
        
        while (i < libros.size() && buscado == null) {            
            if (libros.get(i).getIsbn().equalsIgnoreCase(isbn)) {
                buscado = libros.get(i);
            }
            i++;
        }
        return buscado;
    }
    
    public boolean eliminarLibro(String isbn) {
        Libro buscado = buscarLibroPorIsbn(isbn);
        if (buscado != null) {
            libros.remove(buscado);
            return true;
        }
        return false;
    }
    
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
    public List<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> filtrados = new ArrayList<>();
        
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                filtrados.add(libro);
            }
        }
        return filtrados;
    }
    
    public void mostrarAutoresDisponibles() {
        ArrayList<Autor> autoresDisponibles = new ArrayList<>();
        
        for (Libro libro : libros) {
            Autor autor = libro.getAutor();
            if (!autoresDisponibles.contains(autor)) {
                autoresDisponibles.add(autor);
            }
        }
        
         System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("\nLISTADO DE AUTORES\n");
        for (Autor autor : autoresDisponibles) {
            autor.mostrarInfo();
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
    }
}
