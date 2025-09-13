/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impuestocontribuyentecalculadora_ddu;

/**
 *
 * @author iRb18
 */
public class ImpuestoContribuyenteCalculadora_DdU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Rodrigo Benitez", "20-12345678-9");
        
        Impuesto impuesto = new Impuesto(15000.0);
        impuesto.setContribuyente(contribuyente);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
}
