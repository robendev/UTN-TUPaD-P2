/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author iRb18
 */
public class PayPal implements Pago{
    private String email;

    public PayPal(String email) {
        this.email = email;
    }
    
@Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal por $" + monto);
    }
}
