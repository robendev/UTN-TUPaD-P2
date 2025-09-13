/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarjetadecreditoclientebanco;

/**
 *
 * @author iRb18
 */
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // Asociación bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    
    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        if (this.tarjeta != tarjeta) {
            this.tarjeta = tarjeta;
            if (tarjeta != null && tarjeta.getCliente() != this) {
                tarjeta.setCliente(this);
            }
        }
    } 

    @Override
    public String toString() {
        return "Cliente{" + 
                "nombre=" + nombre + 
                ", dni=" + dni + 
                ", tarjeta=" + (tarjeta != null ? tarjeta.getNumero() : "Sin tarjeta") + 
                '}';
    }
}
