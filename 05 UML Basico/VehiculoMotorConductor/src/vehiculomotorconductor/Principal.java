/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculomotorconductor;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor = new Motor("V8", "12345XYZ");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Corolla", motor);
        Conductor conductor = new Conductor("Juan Pérez", "L123456");
        
        vehiculo.setConductor(conductor);

        System.out.println(vehiculo);
        System.out.println(conductor);
    }
}
