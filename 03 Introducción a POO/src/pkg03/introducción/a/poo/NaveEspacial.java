/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03.introducción.a.poo;

public class NaveEspacial {
    private static final int LIMITE_COMBUSTIBLE = 100;
    
    private String nombre;
    private int combustible;
    
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = Math.min(combustible, LIMITE_COMBUSTIBLE);
    }
    
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar");
        }
    }
    
    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " unidades");
        }
    }
    
    public void recargarCombustible(int cantidad) {
        if ((combustible + cantidad) > LIMITE_COMBUSTIBLE) {
            System.out.println("No se puede recargar " + cantidad + " unidades. Se excede el límite de " + LIMITE_COMBUSTIBLE);
        } else {
            combustible += cantidad;
            System.out.println(nombre + " recargó" + cantidad + " unidades. Combustible actual: " + combustible);
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible);
    }
}
