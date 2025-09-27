/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionbibliotecaria;

import java.util.List;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca UTN");

        // 2. Crear autores
        Autor autor1 = new Autor("A001", "Jorge Luis Borges", "Argentina");
        Autor autor2 = new Autor("A002", "Gabriel García Márquez", "Colombia");
        Autor autor3 = new Autor("A003", "Isabel Allende", "Chile");

        // 3. Agregar libros
        biblioteca.agregarLibro("ISBN001", "Ficciones", 1944, autor1);
        biblioteca.agregarLibro("ISBN002", "El Aleph", 1949, autor1);
        biblioteca.agregarLibro("ISBN003", "Cien años de soledad", 1967, autor2);
        biblioteca.agregarLibro("ISBN004", "La casa de los espíritus", 1982, autor3);
        biblioteca.agregarLibro("ISBN005", "Crónica de una muerte anunciada", 1981, autor2);

        // 4. Listar todos los libros
        biblioteca.listarLibros();

        // 5. Buscar un libro por ISBN
        System.out.println("\nBUSCAR LIBRO POR ISBN: ISBN003");
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        // 6. Filtrar libros por año
        System.out.println("\nLIBROS PUBLICADOS EN 1981:");
        List<Libro> libros1981 = biblioteca.filtrarLibrosPorAnio(1981);
        if (libros1981.isEmpty()) {
            System.out.println("No se encontraron coincidencias.");
        } else {
            for (Libro libro : libros1981) {
                libro.mostrarInfo();
            }
        }

        // 7. Eliminar un libro por ISBN
        System.out.println("\nELIMINANDO LIBRO ISBN002...");
        boolean eliminado = biblioteca.eliminarLibro("ISBN002");
        System.out.println(eliminado ? "Libro eliminado." : "Libro no encontrado.");
        biblioteca.listarLibros();

        // 8. Mostrar cantidad total de libros
        System.out.println("\nCANTIDAD TOTAL DE LIBROS:");
        System.out.println(biblioteca.obtenerCantidadLibros());

        // 9. Mostrar autores disponibles
        biblioteca.mostrarAutoresDisponibles();
    }
}
