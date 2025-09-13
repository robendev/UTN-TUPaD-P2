/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancariaclaveseguridadtitular;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular titular = new Titular("Rodrigo Benitez", "12345678");
        CuentaBancaria cuenta = new CuentaBancaria("000123456789", "150000", "clave123");

        cuenta.setTitular(titular);

        System.out.println(cuenta);
        System.out.println(titular);
    } 
}
