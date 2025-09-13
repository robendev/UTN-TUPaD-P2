/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package editorvideoproyectorender;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Video institucional", 120.5);

        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto);

    }
    
}
