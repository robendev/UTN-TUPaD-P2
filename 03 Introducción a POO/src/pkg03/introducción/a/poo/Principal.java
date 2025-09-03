/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03.introducción.a.poo;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Registro de Estudiantes");
        Estudiante estudiante1 = new Estudiante("Rodrigo", "Benitez", "1 - 2do cuatrimestre");
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(8);
        estudiante1.mostrarInfo();
        estudiante1.bajarCalificacion(1.5);
        estudiante1.mostrarInfo();

        System.out.println("Registro de Mascotas");
        Mascota mascota1 = new Mascota("Firulai", "Tumba olla");
        mascota1.mostrarInfo();
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();

        System.out.println("Encapsulamiento con la Clase Libro");
        Libro libro1 = new Libro("Mi planta de naranja lima", "Vasconcelos Jose");
        libro1.setAnioPublicacion(2026);
        libro1.setAnioPublicacion(1968);
        System.out.println("Titulo: " + libro1.getTitulo() + "\n"
        + "Autor: " + libro1.getAutor() + "\n"
        + "Año de Publicacion: " + libro1.getAnioPublicacion());

        System.out.println("Gestión de Gallinas en Granja Digital");
        Gallina gallina1 = new Gallina();
        gallina1.ponerHuevos();
        gallina1.ponerHuevos();
        gallina1.envejecer();
        gallina1.mostrarEstado();
        gallina1.ponerHuevos();
        gallina1.envejecer();
        gallina1.mostrarEstado();
        Gallina gallina2 = new Gallina();
        gallina2.ponerHuevos();
        gallina2.envejecer();
        gallina2.mostrarEstado();
        gallina2.ponerHuevos();
        gallina2.ponerHuevos();
        gallina2.envejecer();
        gallina2.mostrarEstado();

        System.out.println("Simulación de Nave Espacial");
        NaveEspacial nave1 = new NaveEspacial("Andrómeda", 50);
        nave1.despegar();
        nave1.avanzar(50);
        nave1.recargarCombustible(70);
        nave1.recargarCombustible(40);
        nave1.avanzar(50);
        nave1.mostrarEstado();
    }
}
