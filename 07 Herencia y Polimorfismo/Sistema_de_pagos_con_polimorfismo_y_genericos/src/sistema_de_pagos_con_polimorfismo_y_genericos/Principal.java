/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_de_pagos_con_polimorfismo_y_genericos;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pagable tarjeta = new TarjetaCredito("1234-5678");
        Pagable transferencia = new Transferencia("Cuenta123");
        Pagable efectivo = new Efectivo();
        
        procesarPago(tarjeta, 1500);
        procesarPago(transferencia, 2000);
        procesarPago(efectivo, 500);
    }

    public static void procesarPago(Pagable medio, double monto) {
        medio.pagar(monto);
    }
}
