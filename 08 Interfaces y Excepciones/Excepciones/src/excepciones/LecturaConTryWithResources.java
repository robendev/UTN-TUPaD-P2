/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author iRb18
 */
public class LecturaConTryWithResources {
    public void ejecutar() {
        String ruta = "datos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            System.out.println("Contenido del archivo con try-with-resources:");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
