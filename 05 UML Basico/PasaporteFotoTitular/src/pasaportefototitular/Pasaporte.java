/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasaportefototitular;

/**
 *
 * @author iRb18
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; // Composición
    private Titular titular; // Asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        if (this.titular != titular) {
            this.titular = titular;
            if (titular != null && titular.getPasaporte() != this) {
                titular.setPasaporte(this);
            }
        }
    }

    @Override
    public String toString() {
        return "Pasaporte{" +
                "numero='" + numero + "', " +
                "fechaEmision='" + fechaEmision + "', " +
                "foto=" + foto + ", " +
                "titular=" + (titular != null ? titular.getNombre() : "Sin titular") +
                '}';
    }
}
