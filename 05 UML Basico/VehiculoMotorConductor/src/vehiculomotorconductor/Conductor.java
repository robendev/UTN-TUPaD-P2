/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculomotorconductor;

/**
 *
 * @author iRb18
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // Asociación bidireccional

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        if (this.vehiculo != vehiculo) {
            this.vehiculo = vehiculo;
            if (vehiculo != null && vehiculo.getConductor() != this) {
                vehiculo.setConductor(this);
            }
        }
    }

    @Override
    public String toString() {
        return "Conductor{" + 
                "nombre=" + nombre + 
                ", licencia=" + licencia + 
                ", vehiculo=" + vehiculo + 
                '}';
    } 
}
