/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos_y_herencia_basica;

/**
 *
 * @author iRb18
 */
public class Auto extends Vehiculo{
    private int cantidadPuertas;
    
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }    
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Auto{" + "cantidadPuertas=" + cantidadPuertas + '}');
    }
}
