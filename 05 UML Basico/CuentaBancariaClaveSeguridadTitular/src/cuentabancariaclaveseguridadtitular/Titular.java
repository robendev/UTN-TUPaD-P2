/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancariaclaveseguridadtitular;

/**
 *
 * @author iRb18
 */
public class Titular {
    private  String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria; // Asociación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        if (this.cuentaBancaria != cuentaBancaria) {
            this.cuentaBancaria = cuentaBancaria;
            if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
                cuentaBancaria.setTitular(this);
            }
        }    
    }

    @Override
    public String toString() {
        return "Titular{" + 
                "nombre=" + nombre + 
                ", dni=" + dni + 
                ", cuentaBancaria=" + (cuentaBancaria != null ? cuentaBancaria.getCbu() : "Sin cbu") + 
                '}';
    }
}
