/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancariaclaveseguridadtitular;

/**
 *
 * @author iRb18
 */
public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo) {
        this.codigo = codigo;
        this.ultimaModificacion = java.time.LocalDate.now().toString();
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" + 
                "codigo=" + codigo + 
                ", ultimaModificacion=" + ultimaModificacion + 
                '}';
    }
}
