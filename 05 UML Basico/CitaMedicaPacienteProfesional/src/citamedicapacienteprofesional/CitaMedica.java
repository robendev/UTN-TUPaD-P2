/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citamedicapacienteprofesional;

/**
 *
 * @author iRb18
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente; // Asociación unidireccional
    private Profesional profesional; // Asociación unidireccional

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    } 

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + 
                "fecha=" + fecha + 
                ", hora=" + hora + 
                ", paciente=" + paciente +
                ", profesional=" + profesional + 
                '}';
    }
}
