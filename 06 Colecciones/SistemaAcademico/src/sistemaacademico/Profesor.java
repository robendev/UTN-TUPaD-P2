/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademico;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author iRb18
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;
    
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList();
    }
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    
    public List<Curso> getCursos() {
        return cursos;
    }
    
    public void agregarCurso(Curso c) {
        if (c == null) {
            throw new IllegalArgumentException("El curso no puede ser nulo.");
        }
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
        if (c.getProfesor() != this) {
            c.setProfesor(this);
        }
    }
    
    public void eliminarCurso(Curso c) {
        if (c != null && cursos.contains(c)) {
            cursos.remove(c);
        }
        if (c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }
    
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("Sin cursos asignados.");
        } else {
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("\nLISTADO DE CURSOS\n");
            for (Curso curso : cursos) {
                System.out.println("Codigo: " + curso.getCodigo() +
                        "Nombre: " + curso.getNombre());
            }
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Profesor{" + 
                "id=" + id + 
                ", nombre=" + nombre + 
                ", especialidad=" + especialidad + 
                ", cantidad de cursos=" + cursos.size() + '}');
    }
}