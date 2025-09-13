/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celularbateriausuario;

/**
 *
 * @author iRb18
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // Asociación bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    
    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        if (this.celular != celular) {
            this.celular = celular;
            if (celular != null && celular.getUsuario() != this) {
                celular.setUsuario(this);
            }
        }
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + (celular != null ? celular.getModelo() : "Sin celular") + '}';
    }
}
