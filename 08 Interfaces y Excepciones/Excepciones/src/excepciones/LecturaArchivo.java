/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author iRb18
 */
public class LecturaArchivo {
    
public void ejecutar() {
    Scanner lector = null;
    try {
        File archivo = new File("datos.txt"); // Asegurate de que el archivo exista en el proyecto
        lector = new Scanner(archivo);
        
        System.out.println("Contenido del archivo:");
        while (lector.hasNextLine()) {
            String linea = lector.nextLine();
            System.out.println(linea);
        }
    } catch (FileNotFoundException e) {
        System.out.println("Error: El archivo no fue encontrado.");
    } finally {
        lector.close();
    }
}
}
