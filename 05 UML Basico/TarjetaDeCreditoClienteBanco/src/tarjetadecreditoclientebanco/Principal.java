/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarjetadecreditoclientebanco;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/28", banco);
        Cliente cliente = new Cliente("Rodrigo Benitez", "12345678");

        // Establecer relación bidireccional
        tarjeta.setCliente(cliente);

        // Mostrar información
        System.out.println(tarjeta);
        System.out.println(cliente);
        System.out.println(banco);

    }
    
}
