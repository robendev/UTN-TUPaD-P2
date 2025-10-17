/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author iRb18
 */
public class ConversionCadenaNumero {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        String entrada = scanner.nextLine();
        
        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: La entrada no es un número válido.");
        }
    }
}
