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
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public List<Profesor> getProfesores() {
        return profesores;
    }
    
    public boolean agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
            return true;
        }
        return false;
    }
    
    public boolean agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
            return true;
        }
        return false;
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = null;
        int i = 0;
        
        while (i < cursos.size() && c == null) {            
            if (cursos.get(i).getCodigo().equalsIgnoreCase(codigoCurso)) {
                c = cursos.get(i);
            }
            i++;
        }
        
        Profesor p = null;
        int j = 0;
        
        while (j < profesores.size() && p == null) {            
            if (profesores.get(j).getId().equalsIgnoreCase(idProfesor)) {
                p = profesores.get(j);
            }
            j++;
        }
        
        if (c != null && p != null) {
            c.setProfesor(p);
        }
    }
    
    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores asignados.");
        } else {
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("\nLISTADO DE PROFESORES\n");
            for (Profesor profesor : profesores) {
                System.out.println("idProfesor: " + profesor.getId() +
                        ", Nombre: " + profesor.getNombre() +
                        ", Especialidad: " + profesor.getEspecialidad());
                
                System.out.print("CURSOS ASIGNADOS: ");
                if (profesor.getCursos().isEmpty()) {
                    System.out.println("El profesor no tiene cursos asignados.");
                } else {
                    for (Curso curso : profesor.getCursos()) {
                        System.out.println(" - codigoCurso: " + curso.getCodigo() +
                                ", Nombre: " + curso.getNombre());
                    }
                    System.out.println("\n");
                }
                
            }
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        }
    }
    
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos asignados.");
        } else {
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("\nLISTADO DE CURSOS\n");
            for (Curso curso : cursos) {
                System.out.println(" - codigoCurso: " + curso.getCodigo() +
                                ", Nombre: " + curso.getNombre());
                
                String nombreProfesor = (curso.getProfesor() != null) ? curso.getProfesor().getNombre() : "Sin asignar";
                System.out.println("PROFESOR ASIGNADO: " + nombreProfesor + "\n");
            }
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        Profesor profesorBuscado = null;
        int i = 0;
        
        while (i < profesores.size() && profesorBuscado == null) {            
            if (profesores.get(i).getId().equalsIgnoreCase(id)) {
                profesorBuscado = profesores.get(i);
            }
            i++;
        }

        return profesorBuscado;
    }
    
    public Curso buscarCursoPorCodigo(String codigo) {
        Curso cursoBuscado = null;
        int i = 0;
        
        while (i < cursos.size() && cursoBuscado == null) {            
            if (cursos.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                cursoBuscado = cursos.get(i);
            }
            i++;
        }
        
        return cursoBuscado;
    }
    
    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        
        if (c != null) {
            Profesor p = c.getProfesor();
            
            if (p != null) {
                p.eliminarCurso(c);
            }
            
            cursos.remove(c);
            System.out.println("Curso eliminado correctamente.");
        } else {
            System.out.println("Curso no encontrado.");
        }
    }
    
    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        
        if (p != null) {
            List<Curso> cursosProfesor = new ArrayList<>(p.getCursos());
            
            for (Curso curso : cursosProfesor) {
                curso.setProfesor(null);
            }
            
            profesores.remove(p);
            System.out.println("Profesor eliminado correctamente.");
        } else {
          System.out.println("Profesor no encontrado.");
        }
    }
}
