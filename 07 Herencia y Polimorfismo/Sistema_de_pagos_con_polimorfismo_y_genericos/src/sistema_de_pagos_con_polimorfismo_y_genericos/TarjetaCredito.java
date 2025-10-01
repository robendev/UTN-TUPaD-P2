/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_de_pagos_con_polimorfismo_y_genericos;

/**
 *
 * @author iRb18
 */
public class TarjetaCredito implements Pagable{
    private String numero;

    public TarjetaCredito(String numero) {
        this.numero = numero;
    }
    
@Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " con tarjeta " + numero);
    }
}
