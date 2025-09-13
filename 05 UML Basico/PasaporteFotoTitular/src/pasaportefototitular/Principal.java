/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pasaportefototitular;

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
        Pasaporte pasaporte = new Pasaporte("AR123456", "2025-09-11", "fotoRodrigo.jpg", "jpg");

        pasaporte.setTitular(titular);

        System.out.println(pasaporte);
        System.out.println(titular);
        System.out.println(pasaporte.getFoto());
        
        System.out.println("");
    }
}
