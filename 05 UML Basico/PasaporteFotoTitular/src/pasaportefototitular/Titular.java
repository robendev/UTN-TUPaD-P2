/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasaportefototitular;

/**
 *
 * @author iRb18
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // Asociación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        if (this.pasaporte != pasaporte) {
            this.pasaporte = pasaporte;
            if (pasaporte != null && pasaporte.getTitular() != this) {
                pasaporte.setTitular(this);
            }
        } 
    }

    @Override
    public String toString() {
        return "Titular{" +
           "nombre='" + nombre + "', " +
           "dni='" + dni + "'" +
           '}';
    }
}
