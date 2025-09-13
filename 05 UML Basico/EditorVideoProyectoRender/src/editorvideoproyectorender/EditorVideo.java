/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editorvideoproyectorender;

/**
 *
 * @author iRb18
 */
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato);
        render.setProyecto(proyecto);
        
        System.out.println("Editando video - formato: " + render.getFormato());
        System.out.println("Proyecto: " + proyecto.getNombre());
    }
}
