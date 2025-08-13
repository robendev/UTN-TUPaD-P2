/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysrecursividad;

/**
 *
 * @author iRb18
 */
public class ArraysRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ejercicioArrayDePrecios();
        ejercicioImpresionRecursiva();
    }
    
    // 12.  Modificación de un array de precios y visualización de resultados.
    private static void ejercicioArrayDePrecios() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:\n");
        for (double precio : precios) {
            System.out.println("Precio: " + precio + "\n"); 
        }
        
        precios[2] = 129.99;
        System.out.println("Precios modificados:\n");
        for (double precio : precios) {
            System.out.println("Precio: " + precio + "\n"); 
        }
    }
    
    // 13.  Impresión recursiva de arrays antes y después de modificar un elemento.
    private static void ejercicioImpresionRecursiva() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:\n");
        imprimirArrayRecursivo(precios, 0);
        
        precios[2] = 129.99;
        
        
        System.out.println("\nPrecios modificados:\n");
        imprimirArrayRecursivo(precios, 0);
    }
    private static void imprimirArrayRecursivo(double[] precios, int indice) {
        if (indice >= precios.length) return;
        System.out.println("Precio: " + precios[indice] + "\n");
        imprimirArrayRecursivo(precios, indice + 1);
    }
}
