/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04.poo;

/**
 *
 * @author iRb18
 */
public class Empleado {
    private static final double SMVM = 322000.5;
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    public static int totalEmpleados;
    
    public Empleado(String nombre, String puesto, double salario) {
        totalEmpleados ++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    public Empleado(String nombre, String puesto) {
        totalEmpleados ++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = SMVM;
    }
    
    public void actualizarSalario(double porcentaje) {
        double aumento = salario * porcentaje;
        salario += aumento;
        System.out.println("Salario actualizado. Salario actual: " + salario);
    }
    
    public void actualizarSalario(int cantidadFija) {
        salario += cantidadFija;
        System.out.println("Salario actualizado. Salario actual: " + salario);
    }
    
    @Override
    public String toString() {
        return "idEmpleado: " + id + " | Nombre: " + nombre + " | Puesto: " + puesto + " | Salario: " + salario;
    }
    
    public static int getTotalEmpleados() {
        return totalEmpleados;
    } 
}
