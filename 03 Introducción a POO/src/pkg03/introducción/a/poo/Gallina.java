/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03.introducción.a.poo;

/**
 *
 * @author iRb18
 */
public class Gallina {
    private static int contadorGallinas = 0;
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina() {
    contadorGallinas++;
    this.idGallina = contadorGallinas;
    this.edad = 0;
    this.huevosPuestos = 0;
    }
    
    public void ponerHuevos() {
        huevosPuestos++;
    }
    
    public void envejecer() {
        edad++;
    }
    
    public void mostrarEstado() {
        System.out.println("idGallina " + idGallina + " - Edad: " + edad + ", " + "Huevos puestos: " + huevosPuestos);
    }
}
