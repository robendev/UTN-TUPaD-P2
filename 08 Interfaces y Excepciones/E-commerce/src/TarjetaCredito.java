/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author iRb18
 */
public class TarjetaCredito implements PagoConDescuento{
    private String numeroTarjeta;
    private String titular;

    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * 0.10;
        double montoFinal = monto - descuento;
        System.out.println("Descuento aplicado: $" + descuento);
        return montoFinal;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito por $" + monto);
    }
    
}
