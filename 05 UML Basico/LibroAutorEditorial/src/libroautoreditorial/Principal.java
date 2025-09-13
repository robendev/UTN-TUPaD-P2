/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libroautoreditorial;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Editorial editorial = new Editorial("Planeta", "Av. Corrientes 1234");
        Autor autor = new Autor("Jorge Luis Borges", "Argentina");
        Libro libro = new Libro("Ficciones", "978-987-1234567", editorial);

        libro.setAutor(autor);

        System.out.println(libro);
        System.out.println(autor);
        System.out.println(editorial);
    }
}
