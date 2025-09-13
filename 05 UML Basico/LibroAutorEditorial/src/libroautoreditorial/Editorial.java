/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libroautoreditorial;

/**
 *
 * @author iRb18
 */
public class Editorial {
    private String nombre;
    private String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    } 

    @Override
    public String toString() {
        
return "Editorial{" +
           "nombre='" + nombre + "', " +
           "direccion='" + direccion + "'" +
           '}';
    }  
}
