/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package documentofirmadigitalusuario;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Documento doc = new Documento("Contrato de alquiler", "Este documento establece las condiciones...");
        FirmaDigital firma = new FirmaDigital("ABC123XYZ", "2025-09-12", "María Gómez", "maria@example.com");

        doc.setFirma(firma);

        System.out.println(doc);
        System.out.println(firma);
    }
}
