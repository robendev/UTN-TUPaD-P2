/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservaclientemesa;

/**
 *
 * @author iRb18
 */
public class Mesa {
    private byte numero;
    private byte capacidad;

    public Mesa(byte numero, byte capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Mesa{" + 
                "numero=" + numero + 
                ", capacidad=" + capacidad + 
                '}';
    }
}
