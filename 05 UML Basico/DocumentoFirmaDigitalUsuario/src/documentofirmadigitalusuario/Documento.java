/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documentofirmadigitalusuario;

/**
 *
 * @author iRb18
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // Composición

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public FirmaDigital getFirma() {
        return firma;
    }

    public void setFirma(FirmaDigital firma) {
        if (this.firma != firma) {
            this.firma = firma;
            if (firma != null && firma.getDoc() != this) {
                firma.setDoc(this);
            }
        }
    }

    @Override
    public String toString() {
        return "Documento{" + 
                "titulo=" + titulo + 
                ", conteniedo=" + contenido + 
                ", firma=" + (firma != null ? firma.getCodigoHash() : "Sin firma") + 
                '}';
    }
}
