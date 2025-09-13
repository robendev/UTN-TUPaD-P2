/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarjetadecreditoclientebanco;

/**
 *
 * @author iRb18
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // Asociación bidireccional
    private Banco banco; // Agregación

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (this.cliente != cliente) {
            this.cliente = cliente;
            if (cliente != null && cliente.getTarjeta() != this) {
                cliente.setTarjeta(this);
            }
        }
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + 
                "numero=" + numero + 
                ", fechaVencimiento=" + fechaVencimiento + 
                ", cliente=" + (cliente != null ? cliente.getNombre() : "Sin Cliente") + 
                ", banco=" + banco + 
                '}';
    }
}
