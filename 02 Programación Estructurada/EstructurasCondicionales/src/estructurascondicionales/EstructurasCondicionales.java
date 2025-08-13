/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurascondicionales;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author iRb18
 */
public class EstructurasCondicionales {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
//        ejercicioBisiesto();
//        ejercicioMayorDe3Numeros();
//        ejercicioClasificacionDeEdad();
          ejercicioCalculadoraDeDescuento();
    }
    
    // 1. Verificación de Año Bisiesto.
    private static void ejercicioBisiesto() {
        System.out.println("Verificación de Año Bisiesto");
        
        System.out.print("Ingrese un año: ");
        int anio = Integer.parseInt(scanner.nextLine());
        
        if (esBisiesto(anio)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
        System.out.println();
    }
    private static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0;
    }
    
    // 2. Determinar el Mayor de Tres Números.
    private static void ejercicioMayorDe3Numeros() {
        System.out.println("Determinar el Mayor de Tres Números");
        
        System.out.print("Ingrese el primer número: ");
        int n1 = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Ingrese el segundo número: ");
        int n2 = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Ingrese el tercer número: ");
        int n3 = Integer.parseInt(scanner.nextLine());
        
        if (n1 > n2 && n1 > n3) {
            System.out.println("El mayor es: " + n1);
        } else if (n2 > n3) {
            System.out.println("El mayor es: " + n2);
        } else {
            System.out.println("El mayor es: " + n3);
        }
        System.out.println();
    }
    
    // 3. Clasificación de Edad.
    private static void ejercicioClasificacionDeEdad() {
        System.out.println("Clasificación de Edad");
        
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(scanner.nextLine());
        
        if (edad < 12) {
            System.out.println("Eres un Niño");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto");
        } else {
            System.out.println("Eres un Adulto mayor");
        }
        System.out.println();
    }
    
    // 4. Calculadora de Descuento según categoría.
    private static void ejercicioCalculadoraDeDescuento() {
        System.out.println("Calculadora de Descuento según categoría");
        
        System.out.print("Ingrese el precio del producto: ");
        int precioProducto = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoriaProducto = scanner.nextLine().charAt(0);
        
        double descuento;
        
        if (categoriaProducto == 'a' || categoriaProducto == 'A') {
            descuento = 0.1;
        } else if (categoriaProducto == 'b' || categoriaProducto == 'B') {
            descuento = 0.15;
        } else if (categoriaProducto == 'c' || categoriaProducto == 'C') {
            descuento = 0.2;
        } else {
            System.out.println("Categoría inválida.");
            return;
        }
        
        System.out.println("Descuento aplicado: " + descuento * 100 + "%");
        System.out.println("Precio final: " + (precioProducto - (precioProducto * descuento)));
    }
}
