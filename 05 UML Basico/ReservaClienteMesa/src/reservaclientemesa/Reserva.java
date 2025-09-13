/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservaclientemesa;

/**
 *
 * @author iRb18
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente; // Asociación unidireccional
    private Mesa mesa; // Agregación

    public Reserva(String fecha, String hora, byte numero, byte capacidad) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = new Mesa(numero, capacidad);
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }
    
    @Override
    public String toString() {
        return "Reserva{" + 
                "fecha=" + fecha + 
                ", hora=" + hora + 
                ", cliente=" + cliente + 
                ", mesa=" + mesa + 
                '}';
    }
}
