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
public class DivisionSegura {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el dividendo: ");
            int a = scanner.nextInt();

            System.out.print("Ingrese el divisor: ");
            int b = scanner.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}
