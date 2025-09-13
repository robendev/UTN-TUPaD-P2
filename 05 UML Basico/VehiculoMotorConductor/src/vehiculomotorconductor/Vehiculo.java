/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculomotorconductor;

/**
 *
 * @author iRb18
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; // Agregación
    private Conductor conductor; // Asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        if (this.conductor != conductor) {
            this.conductor = conductor;
            if (conductor != null && conductor.getVehiculo() != this) {
                conductor.setVehiculo(this);
            }
        }
    }
    
    @Override
    public String toString() {
        return "Vehiculo{" + 
                "patente=" + patente + 
                ", modelo=" + modelo + 
                ", motor=" + motor + 
                '}';
    }
}
