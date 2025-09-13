/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computadoraplacamadrepropietario;

/**
 *
 * @author iRb18
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // Asociación bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        if (this.computadora != computadora) {
            this.computadora = computadora;
            if (computadora != null && computadora.getPropietario() != this) {
                computadora.setPropietario(this);
            }
        }
    }  

    @Override
    public String toString() {
        return "Propietario{" + 
                "nombre=" + nombre + 
                ", dni=" + dni + 
                ", computadora=" + (computadora != null ? computadora.getMarca() : "Sin computadora") + 
                '}';
    }  
}
