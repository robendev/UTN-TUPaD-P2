/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computadoraplacamadrepropietario;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Propietario propietario = new Propietario("Rodrigo Benitez", "12345678");
        Computadora computadora = new Computadora("HP", "SN-001", "ASUS B450", "AMD B450");

        computadora.setPropietario(propietario); // Relación bidireccional

        System.out.println(computadora);
        System.out.println(propietario);
        System.out.println(computadora.getPlacaMadre());

    }
    
}
