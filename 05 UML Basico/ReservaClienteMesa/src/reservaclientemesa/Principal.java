/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservaclientemesa;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rodrigo Benitez", "3764123456");

        // Crear reserva con mesa (agregación)
        Reserva reserva = new Reserva("2025-09-15", "21:00", (byte)5, (byte)4);

        // Establecer cliente en la reserva
        reserva.setCliente(cliente);

        System.out.println(reserva);
        System.out.println(cliente);
        System.out.println(reserva.getMesa());
    }  
}
