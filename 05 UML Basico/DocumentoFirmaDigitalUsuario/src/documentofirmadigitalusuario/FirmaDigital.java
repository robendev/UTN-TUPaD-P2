/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documentofirmadigitalusuario;

/**
 *
 * @author iRb18
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Documento doc; // Composición
    private Usuario usuario; // Agregación

    public FirmaDigital(String codigoHash, String fecha, String nombre, String email) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = new Usuario(nombre, email);
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public Documento getDoc() {
        return doc;
    }

    public void setDoc(Documento doc) {
        if (this.doc != doc) {
            this.doc = doc;
            if (doc != null & doc.getFirma() != this) {
                doc.setFirma(this);
            }
        }
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + 
                "codigoHash=" + codigoHash + 
                ", fecha=" + fecha + 
                ", doc=" + (doc != null ? doc.getTitulo() : "Sin titulo") + 
                ", usuario=" + usuario + 
                '}';
    }
}
