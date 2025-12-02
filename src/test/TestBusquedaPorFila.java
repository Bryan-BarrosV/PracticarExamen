package test;

import controllers.UniversidadController;
import models.Carrera;
import models.Estudiante;
import models.Universidad;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBusquedaPorFila {

    Universidad[] data = UniversidadDataSet.getUniversidades();
    UniversidadController ctrl = new UniversidadController();

    private int fixauditable(Universidad universidad) {
        int total = 0;
        for (Carrera carrera : universidad.getCarreras()) {
            for (Estudiante estudiante : carrera.getEstudiantes()) {
                if (estudiante.isMatriculado()) {
                    total++;
                }
            }
        }
        return total;
    }

    private boolean isSortedAsc(Universidad[] universidades) {
        for (int i = 0; i < universidades.length - 1; i++) {
            if (fixauditabole(universidades[i]) > fixauditabole(universidades[i + 1])) {
                return false;
            }
        }
        return true;
    }

    // private boolean isSortedDesc(Universidad[] universidades) {
    //     for (int i = 0; i < universidades.length - 1; i++) {
    //         if (fixauditabole(universidades[i]) < fixauditabole(universidades[i + 1])) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    private int fixauditabole(Universidad universidad) {
        return fixauditable(universidad);
    }

    @Test
    public void testFilaA() {
        ctrl.sortInsertionAsc(data);
        assertTrue(isSortedAsc(data));
        Universidad u = ctrl.binarySearchByEnrollment(data, 13, true);
        assertNotNull(u);
        assertEquals("Universidad Alpha", u.getNombre());

        assertNull(ctrl.binarySearchByEnrollment(data, 5, false));
        assertNull(ctrl.binarySearchByEnrollment(data, 13, false));
    }

    // @Test
    // public void testFilaB() {
    //     ctrl.sortInsertionDesc(data);
    //     assertTrue(isSortedDesc(data));
    //     Universidad u = ctrl.binarySearchByEnrollment(data, 16, false);
    //     assertNotNull(u);
    //     assertEquals("Universidad Epsilon", u.getNombre());

    //     Universidad noExiste1 = ctrl.binarySearchByEnrollment(data, 6, true);
    //     assertNull(noExiste1);

    //     Universidad noExiste2 = ctrl.binarySearchByEnrollment(data, 16, true);
    //     assertNull(noExiste2);
    // }

    // @Test
    // public void testFilaC() {
    //     ctrl.sortBubbleAsc(data);
    //     assertTrue(isSortedAsc(data));
    //     Universidad u = ctrl.binarySearchByEnrollment(data, 7, true);
    //     assertNotNull(u);
    //     assertEquals("Universidad Gamma", u.getNombre());

    //     assertNull(ctrl.binarySearchByEnrollment(data, 9, false));
    //     assertNull(ctrl.binarySearchByEnrollment(data, 7, false));
    // }

    // @Test
    // public void testFilaD() {
    //     ctrl.sortBubbleDesc(data);
    //     assertTrue(isSortedDesc(data));
    //     Universidad u = ctrl.binarySearchByEnrollment(data, 12, false);
    //     assertNotNull(u);
    //     assertEquals("Universidad Delta", u.getNombre());

    //     assertNull(ctrl.binarySearchByEnrollment(data, 10, true));

    //     Universidad u2 = ctrl.binarySearchByEnrollment(data, 12, true);
    //     assertNotNull(u2);
    //     assertEquals("Universidad Delta", u2.getNombre());

    // }

    // @Test
    // public void testFilaE() {
    //     ctrl.sortSelectionAsc(data);
    //     assertTrue(isSortedAsc(data));
    //     Universidad u = ctrl.binarySearchByEnrollment(data, 16, true);
    //     assertNotNull(u);
    //     assertEquals("Universidad Epsilon", u.getNombre());

    //     assertNull(ctrl.binarySearchByEnrollment(data, 4, false));
    //     assertNull(ctrl.binarySearchByEnrollment(data, 16, false));
    // }

    // @Test
    // public void testFilaF() {
    //     ctrl.sortSelectionDesc(data);
    //     assertTrue(isSortedDesc(data));
    //     Universidad u = ctrl.binarySearchByEnrollment(data, 13, false);
    //     assertNotNull(u);
    //     assertEquals("Universidad Alpha", u.getNombre());

    //     assertNull(ctrl.binarySearchByEnrollment(data, 99, true));
    //     assertNull(ctrl.binarySearchByEnrollment(data, 13, true));
    // }

}