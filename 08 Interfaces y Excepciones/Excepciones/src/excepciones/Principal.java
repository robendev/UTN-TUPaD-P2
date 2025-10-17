/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 1: División segura");
        DivisionSegura division = new DivisionSegura();
        division.ejecutar();
        
        System.out.println("\nEjercicio 2: Conversión de cadena a número");
        ConversionCadenaNumero conversion = new ConversionCadenaNumero();
        conversion.ejecutar();
        
        System.out.println("\nEjercicio 3: Lectura de archivo");
        LecturaArchivo lectura = new LecturaArchivo();
        lectura.ejecutar();

        System.out.println("\nEjercicio 4: Excepción personalizada");
        ValidarEdad validarEdad = new ValidarEdad();
        validarEdad.ejecutar();

        System.out.println("\nEjercicio 5: Try-with-resources");
        LecturaConTryWithResources lecturaTry = new LecturaConTryWithResources();
        lecturaTry.ejecutar();
    }
}
