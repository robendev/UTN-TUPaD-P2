/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03.introducción.a.poo;

/**
 *
 * @author iRb18
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    public Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }
    
    void mostrarInfo(){
        System.out.println(nombre + " " + especie + " " + edad);
    }
    
    void cumplirAnios() {
        edad += 1;
    }
}
