/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computadoraplacamadrepropietario;

/**
 *
 * @author iRb18
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; // Composición
    private Propietario propietario; // Asociación bidireccional

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }

    public String getMarca() {
        return marca;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }
    
    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        if (this.propietario != propietario) {
            this.propietario = propietario;
            if (propietario != null && propietario.getComputadora() != this) {
                propietario.setComputadora(this);
            }
        }
    }

    @Override
    public String toString() {
        return "Computadora{" + 
                "marca=" + marca + 
                ", numeroSerie=" + numeroSerie + 
                ", placaMadre=" + placaMadre + 
                ", propietario=" + (propietario != null ? propietario.getNombre() : "Sin propietario") + 
                '}';
    }
}
