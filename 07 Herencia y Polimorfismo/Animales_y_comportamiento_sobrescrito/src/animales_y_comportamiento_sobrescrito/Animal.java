/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_y_comportamiento_sobrescrito;

/**
 *
 * @author iRb18
 */
public class Animal {
    private String nombre;
    
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public void describirAnimal() {
        System.out.println("Este es un animal llamado " + nombre);
    }

    public void hacerSonido() {
        System.out.println("Sonido del animal generico.");
    }
}
