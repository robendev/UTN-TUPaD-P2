/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reproductorcancionartista_ddu;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artista artista = new Artista("Soda Stereo", "Rock");

        Cancion cancion = new Cancion("De Música Ligera");
        cancion.setArtista(artista);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);

    }
    
}
