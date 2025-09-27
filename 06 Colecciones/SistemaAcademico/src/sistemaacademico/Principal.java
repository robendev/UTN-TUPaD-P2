/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademico;

/**
 *
 * @author iRb18
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN Posadas");

        // 1. Crear profesores
        Profesor prof1 = new Profesor("P001", "Ana Gómez", "Matemática");
        Profesor prof2 = new Profesor("P002", "Luis Pérez", "Programación");
        Profesor prof3 = new Profesor("P003", "María López", "Física");

        // 2. Agregar profesores
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        // 3. Crear cursos
        Curso curso1 = new Curso("C101", "Álgebra");
        Curso curso2 = new Curso("C102", "Java");
        Curso curso3 = new Curso("C103", "Electromagnetismo");
        Curso curso4 = new Curso("C104", "Estructuras de Datos");
        Curso curso5 = new Curso("C105", "Física Moderna");

        // 4. Agregar cursos
        uni.agregarCurso(curso1);
        uni.agregarCurso(curso2);
        uni.agregarCurso(curso3);
        uni.agregarCurso(curso4);
        uni.agregarCurso(curso5);

        // 5. Asignar profesores a cursos
        uni.asignarProfesorACurso("C101", "P001"); // Ana → Álgebra
        uni.asignarProfesorACurso("C102", "P002"); // Luis → Java
        uni.asignarProfesorACurso("C103", "P003"); // María → Electromagnetismo
        uni.asignarProfesorACurso("C104", "P002"); // Luis → Estructuras
        uni.asignarProfesorACurso("C105", "P003"); // María → Física Moderna

        // 6. Listar profesores con sus cursos
        uni.listarProfesores();

        // 7. Listar cursos con su profesor
        uni.listarCursos();

        // 8. Cambiar el profesor de un curso
        System.out.println("\nCambiando profesor del curso C101 a Luis...");
        uni.asignarProfesorACurso("C101", "P002"); // Álgebra → Luis

        // Verificar sincronización
        uni.listarProfesores();
        uni.listarCursos();

        // 9. Eliminar un curso
        System.out.println("\nEliminando curso C104...");
        uni.eliminarCurso("C104"); // Estructuras de Datos

        // Verificar que ya no está en la lista del profesor
        uni.listarProfesores();
        uni.listarCursos();

        // 10. Eliminar un profesor
        System.out.println("\nEliminando profesor P003...");
        uni.eliminarProfesor("P003"); // María

        // Verificar que los cursos que dictaba ahora tienen profesor = null
        uni.listarCursos();

        // 11. Reporte: cantidad de cursos por profesor
        System.out.println("\nREPORTE: Cantidad de cursos por profesor");
        for (Profesor prof : uni.getProfesores()) {
            System.out.println(prof.getNombre() + " dicta " + prof.getCursos().size() + " curso(s).");
        }
    }
}
