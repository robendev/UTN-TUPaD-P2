/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04.poo;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("María Gómez", "Desarrolladora", 480000);
        Empleado emp2 = new Empleado("Juan Pérez", "Analista");
        Empleado emp3 = new Empleado("Lucía Fernández", "Tester", 420000);
        Empleado emp4 = new Empleado("Carlos López", "Diseñador");

        emp1.actualizarSalario(0.15);
        emp2.actualizarSalario(25000);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);

        System.out.println("Total de empleados creados: " + Empleado.getTotalEmpleados());
    }
}
