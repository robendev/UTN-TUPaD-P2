/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras_geometricas_y_metodos_abstractos;

/**
 *
 * @author iRb18
 */
public class Rectangulo extends Figura{
    private double b;
    private double h;
    
    public Rectangulo(String nombre, double b, double h) {
        super(nombre);
        this.b = b;
        this.h = h;
    }

    @Override
    public double calcularArea() {
        return b * h;
    }
}
