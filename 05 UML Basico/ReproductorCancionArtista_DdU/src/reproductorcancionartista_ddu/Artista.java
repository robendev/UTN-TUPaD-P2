/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductorcancionartista_ddu;

/**
 *
 * @author iRb18
 */
public class Artista {
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Artista{" + 
                "nombre=" + nombre + 
                ", genero=" + genero + 
                '}';
    }  
}
