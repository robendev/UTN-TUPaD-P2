/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados_y_polimorfismo;

/**
 *
 * @author iRb18
 */
public class EmpleadoTemporal extends Empleado{
    private int horasTrabajadas;
    private double valorHora;

    
    public EmpleadoTemporal(String nombre, int horasTrabajadas, double valorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }
    
    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}
