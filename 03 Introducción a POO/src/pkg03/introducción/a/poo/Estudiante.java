/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03.introducción.a.poo;

/**
 *
 * @author iRb18
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    public Estudiante(String nombre, String apellido, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
    }
    
    void mostrarInfo(){
        System.out.println(nombre + " " + apellido + " " + curso + " " + calificacion);
    }
    
    void subirCalificacion(double puntos) {
        calificacion += puntos;
    }
    
    void bajarCalificacion(double puntos) {
        calificacion -= puntos;
    }
}
