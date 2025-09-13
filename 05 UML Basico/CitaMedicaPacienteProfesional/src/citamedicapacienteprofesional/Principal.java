/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package citamedicapacienteprofesional;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Lucía Fernández", "OSDE");
        Profesional profesional = new Profesional("Dr. Juan López", "Cardiología");

        CitaMedica cita = new CitaMedica("2025-09-15", "10:30");

        cita.setPaciente(paciente);
        cita.setProfesional(profesional);

        System.out.println(cita);
    }
}
