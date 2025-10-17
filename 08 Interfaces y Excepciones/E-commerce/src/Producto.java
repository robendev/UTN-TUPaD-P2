/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author iRb18
 */
public class Producto implements Pagable{
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    @Override
    public void calcularTotal() {
        System.out.println("Total del producto: " + nombre + ": $" + precio);
    }
}
