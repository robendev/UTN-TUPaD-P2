/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_de_pagos_con_polimorfismo_y_genericos;

/**
 *
 * @author iRb18
 */
public class Efectivo implements Pagable{
    
@Override
    public void pagar(double monto) {
        System.out.println("Pago en efectivo de $" + monto);
    }

}
