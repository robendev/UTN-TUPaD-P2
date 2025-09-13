/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package celularbateriausuario;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bateria bateria = new Bateria("BTX-5000", "4000mAh");
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S21", bateria);
        Usuario usuario = new Usuario("Rodrigo Benitez", "12345678");
        
        usuario.setCelular(celular);
        
        System.out.println(bateria);
        System.out.println(celular);
        System.out.println(usuario);
    }
}
