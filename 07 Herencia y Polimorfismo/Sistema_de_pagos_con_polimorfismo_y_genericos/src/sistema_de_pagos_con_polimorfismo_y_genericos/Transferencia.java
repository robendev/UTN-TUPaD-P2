/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_de_pagos_con_polimorfismo_y_genericos;

/**
 *
 * @author iRb18
 */
public class Transferencia implements Pagable{
    private String cuentaDestino;

    public Transferencia(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Transferencia de $" + monto + " a cuenta " + cuentaDestino);
    }

}
