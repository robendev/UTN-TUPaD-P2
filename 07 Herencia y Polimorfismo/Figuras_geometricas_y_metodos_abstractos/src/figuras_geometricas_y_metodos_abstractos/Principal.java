/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras_geometricas_y_metodos_abstractos;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList();
        
        figuras.add(new Circulo("Círculo 1", 3));
        figuras.add(new Rectangulo("Rectángulo 1", 4, 5));
        figuras.add(new Circulo("Círculo 2", 2.34));
        figuras.add(new Rectangulo("Rectángulo 2", 3.21, 5.43));
        
        for (Figura figura : figuras) {
            System.out.println("Área de " + 
                    figura.getClass().getSimpleName() + 
                    ": " + 
                    String.format(Locale.US, "%.2f", figura.calcularArea()));
        }
    }
    
}
