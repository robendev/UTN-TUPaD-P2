/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03.introducción.a.poo;

/**
 *
 * @author iRb18
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public void setAnioPublicacion(int anioPublicacion) {
        int anioActual = java.time.Year.now().getValue();
        if (anioPublicacion >= 1000 && anioPublicacion <= anioActual) {
            this.anioPublicacion = anioPublicacion;        
        } else {
            System.out.println("Año inválido: " + anioPublicacion);
        }
    }
}
