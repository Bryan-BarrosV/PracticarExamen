import controllers.UniversidadController;
import models.Universidad;

public class App {
    public static void main(String[] args) {

        final String nombreEstudiante = "Bryan Barros";
        final String fila = "A";

        System.out.println("Examen de:");
        System.out.println("Estudiante: " + nombreEstudiante);
        System.out.println("Fila: " + fila);

        // Obtener los datos
        Universidad[] universidades = UniversidadDataSet.getUniversidades();

        // Crear el controlador
        UniversidadController ctrl = new UniversidadController();

        // Ordenar (ejemplo Bubble Asc)
        ctrl.sortInsertionAsc(universidades);

        // Imprimir
        // System.out.println("Universidades ordenadas ascendentemente:");
        // for (Universidad u : universidades) {
        //     System.out.println(u);
        // }
    }
}
