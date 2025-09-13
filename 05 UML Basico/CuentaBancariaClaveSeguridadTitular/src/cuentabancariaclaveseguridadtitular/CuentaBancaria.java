/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancariaclaveseguridadtitular;

/**
 *
 * @author iRb18
 */
public class CuentaBancaria {
    private String cbu;
    private String saldo;
    private ClaveSeguridad claveSeguridad; // Composición
    private Titular titular; // Asociación bidireccional
    
    public CuentaBancaria(String cbu, String saldo, String codigo) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo);
    }

    public String getCbu() {
        return cbu;
    }
    
    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        if (this.titular != titular) {
             this.titular = titular;
             if (titular != null && titular.getCuentaBancaria() != this) {
                titular.setCuentaBancaria(this);
            }
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + 
                "cbu=" + cbu +
                ", saldo=" + saldo + 
                ", claveSeguridad=" + claveSeguridad + 
                ", titular=" + (titular != null ? titular.getNombre() : "Sin titular") + 
                '}';
    }
}
