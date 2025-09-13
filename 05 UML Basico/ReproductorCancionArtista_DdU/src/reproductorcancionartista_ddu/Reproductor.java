/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductorcancionartista_ddu;

/**
 *
 * @author iRb18
 */
public class Reproductor {
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo());
        if (cancion.getArtista() != null) {
            System.out.println("Artista: " + cancion.getArtista());
        }
    }
}
