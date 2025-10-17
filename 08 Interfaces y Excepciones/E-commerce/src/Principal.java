/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author iRb18
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto("Mouse", 1500.0);
        Producto p2 = new Producto("Teclado", 3000.0);

        // Crear cliente
        Cliente cliente = new Cliente("Rodrigo Benitez", "rodrigo@gmail.com");

        // Crear pedido y agregar productos
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        // Calcular total del pedido
        pedido.calcularTotal();

        // Medio de pago: Tarjeta de crédito (con descuento)
        Pago medioPago = new TarjetaCredito("123456789", "Rodrigo Benitez");

        // Obtener total del pedido
        double total = 0;
        for (Producto p : pedido.getProductos()) {
            total += p.getPrecio();
        }

        // Aplicar descuento si corresponde
        if (medioPago instanceof PagoConDescuento) {
            PagoConDescuento pagoConDescuento = (PagoConDescuento) medioPago;
            total = pagoConDescuento.aplicarDescuento(total);
        }

        // Procesar el pago
        medioPago.procesarPago(total);

        // Cambiar estado del pedido
        pedido.cambiarEstado("Pagado");
    }
}
