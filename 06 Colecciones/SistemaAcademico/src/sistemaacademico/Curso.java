/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademico;

/**
 *
 * @author iRb18
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        if (this.profesor == p) {
            return;
        }
        
        Profesor anterior = this.profesor;
        this.profesor = null;
        
        if (anterior != null) {
            anterior.eliminarCurso(this);
        }
        
        this.profesor = p;
        
        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Curso{" + 
                "codigo=" + codigo + 
                ", nombre=" + nombre + 
                ", profesor=" + profesor.getNombre() + '}');
    }
}
