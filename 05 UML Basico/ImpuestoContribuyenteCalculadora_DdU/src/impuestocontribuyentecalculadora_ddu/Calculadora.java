/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impuestocontribuyentecalculadora_ddu;

/**
 *
 * @author iRb18
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto...");
        System.out.println("Monto: $" + impuesto.getMonto());
        System.out.println("Contribuyente: " + impuesto.getContribuyente());
    }
}
