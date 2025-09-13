/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generadorqrusuariocodigoqr_ddc;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Rodrigo", "rodrigo@example.com");

        GeneradorQR generador = new GeneradorQR();

        generador.generar("https://utn.edu.ar", usuario);

    }
    
}
