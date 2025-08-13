/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasderepeticion;

import java.util.Scanner;

/**
 *
 * @author iRb18
 */
public class EstructurasDeRepeticion {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int MENOR_NOTA = 0;
    private static final int MAYOR_NOTA = 10;
    private static final double DESCUENTO_ESPECIAL = 0.1;
    
    public static void main(String[] args) {
//        ejercicioSumaDeNumerosPares();
//        ejercicioContadorDePositivosNegativosCeros();
//        ejercicioNotaEntre0y10();

        

        // 8. Cálculo del Precio Final con impuesto y descuento.
//        System.out.println("Cálculo del Precio Final con impuesto y descuento");
//        
//        System.out.print("Ingrese el precio base del producto: ");
//        double precioBase = Double.parseDouble(scanner.nextLine());
//        
//        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
//        double impuesto = Double.parseDouble(scanner.nextLine());
//        
//        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
//        double descuento = Double.parseDouble(scanner.nextLine());
//        
//        System.out.println("El precio final del producto es: " + calcularPrecioFinal(precioBase, impuesto, descuento) + "\n");
        


        // 9.  Composición de funciones para calcular costo de envío y total de compra.
//        System.out.println("Composición de funciones para calcular costo de envío y total de compra");
//        
//        System.out.print("Ingrese el precio del producto: ");
//        double precio = Double.parseDouble(scanner.nextLine());
//        
//        System.out.print("Ingrese el peso del paquete en kg: ");
//        double peso = Double.parseDouble(scanner.nextLine());
//        
//        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
//        String zona = scanner.nextLine();
//        
//        System.out.println("El costo de envío es: " + calcularCostoEnvio(peso, zona));
//        System.out.println("El total a pagar es: " + calcularTotalCompra(precio, calcularCostoEnvio(peso, zona)) + "\n");



        // 10. Actualización de stock a partir de venta y recepción de productos.
//        System.out.println("Actualización de stock a partir de venta y recepción de productos");
//        
//        int stock, cantidadVendida, cantidadRecibida;
//        
//        System.out.print("Ingrese el stock actual del producto: ");
//        stock = Integer.parseInt(scanner.nextLine());
//        
//        System.out.print("Ingrese la cantidad vendida: ");
//        cantidadVendida = Integer.parseInt(scanner.nextLine());
//        
//        System.out.print("Ingrese la cantidad recibida: ");
//        cantidadRecibida = Integer.parseInt(scanner.nextLine());
//        
//        System.out.println("El nuevo stock del producto es: " +  actualizarStock(stock, cantidadVendida, cantidadRecibida) + "\n");



        // 11. Cálculo de descuento especial usando variable global.
        System.out.println("Cálculo de descuento especial usando variable global");
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(scanner.nextLine());
        
        calcularDescuentoEspecial(precio);
    }
    
    // 5. Suma de Números Pares (while).
    private static void ejercicioSumaDeNumerosPares() {
        System.out.println("Suma de Números Pares (while)");
        
        int numero, suma = 0;
        
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = Integer.parseInt(scanner.nextLine());
        
        while (numero != 0) {            
            if (numero % 2 == 0) {
                suma = suma + numero;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("La suma de los números pares es: " + suma + "\n");
    }
    
    // 6. Contador de Positivos, Negativos y Ceros (for).
    private static void ejercicioContadorDePositivosNegativosCeros() {
        System.out.println("Contador de Positivos, Negativos y Ceros (for)");
        
        int numero, postivos = 0, negativos = 0, ceros = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = Integer.parseInt(scanner.nextLine());
            
            if (numero < 0) {
                negativos = negativos + 1;
            } else if (numero > 0) {
                postivos = postivos + 1;
            } else {
                ceros = ceros + 1;
            }
            System.out.println();
        }
        
        System.out.println("Resultados");
        System.out.println("Positivos: " + postivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros + "\n");
    }
    
    // 7. Validación de Nota entre 0 y 10 (do-while).
    private static void ejercicioNotaEntre0y10() {
        System.out.println("Validación de Nota entre 0 y 10 (do-while)");
        
        int nota;
        
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(scanner.nextLine());
            
            if (nota < MENOR_NOTA || nota > MAYOR_NOTA) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
            
        } while (nota < MENOR_NOTA || nota > MAYOR_NOTA);
        
        System.out.println("Nota guardada correctamente.\n");
    }
    
    // 8. Cálculo del Precio Final con impuesto y descuento.
    private static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;

        return precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
    }
    
    // 9.  Composición de funciones para calcular costo de envío y total de compra.
    private static double calcularCostoEnvio(double peso, String zona) {
        int precioPorKilo;
        if (zona.equalsIgnoreCase("Nacional")) {
            precioPorKilo = 5;
        } else {
            precioPorKilo = 10;
        } 
        return peso * precioPorKilo;
    }
    private static double  calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    // 10. Actualización de stock a partir de venta y recepción de productos.
    private static int  actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    // 11. Cálculo de descuento especial usando variable global.
    private static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + (precio - descuentoAplicado) + "\n");
    }
}
