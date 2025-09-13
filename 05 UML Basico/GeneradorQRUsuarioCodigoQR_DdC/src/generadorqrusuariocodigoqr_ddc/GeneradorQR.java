/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generadorqrusuariocodigoqr_ddc;

/**
 *
 * @author iRb18
 */
public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigoQR = new CodigoQR(valor);
        codigoQR.setUsuario(usuario);
        
        System.out.println("Generando QR...");
        System.out.println("Valor: " + codigoQR.getValor() + " - Usuario: " + usuario.getNombre());

    }
}
