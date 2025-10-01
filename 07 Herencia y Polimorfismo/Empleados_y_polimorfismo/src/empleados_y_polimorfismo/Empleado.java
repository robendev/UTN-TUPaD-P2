/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados_y_polimorfismo;

/**
 *
 * @author iRb18
 */
public abstract class Empleado {
    private String nombre;
    
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
  
    public String getNombre() {
        return nombre;
    }
    
     public abstract double calcularSueldo();
}
