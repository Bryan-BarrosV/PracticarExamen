package controllers;

import models.Carrera;
import models.Estudiante;
import models.Universidad;

public class UniversidadController {

    // ============================================================
    // MÉTODO QUE EL TEST NECESITA: contar matriculados
    // ============================================================
    private int countMatriculados(Universidad universidad) {
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

    // ============================================================
    // ORDENAMIENTOS
    // ============================================================

    public void sortBubbleAsc(Universidad[] u) {
        boolean swapped;
        for (int i = 0; i < u.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < u.length - 1; j++) {
                if (countMatriculados(u[j]) > countMatriculados(u[j + 1])) {
                    Universidad temp = u[j];
                    u[j] = u[j + 1];
                    u[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public void sortBubbleDesc(Universidad[] u) {
        boolean swapped;
        for (int i = 0; i < u.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < u.length - 1; j++) {
                if (countMatriculados(u[j]) < countMatriculados(u[j + 1])) {
                    Universidad temp = u[j];
                    u[j] = u[j + 1];
                    u[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public void sortInsertionAsc(Universidad[] u) {
        for (int i = 1; i < u.length; i++) {
            Universidad aux = u[i];
            int j = i;

            while (j > 0 && countMatriculados(aux) < countMatriculados(u[j - 1])) {
                u[j] = u[j - 1];
                j--;
            }
            u[j] = aux;
        }
    }

    public void sortInsertionDesc(Universidad[] u) {
        for (int i = 1; i < u.length; i++) {
            Universidad aux = u[i];
            int j = i;

            while (j > 0 && countMatriculados(aux) > countMatriculados(u[j - 1])) {
                u[j] = u[j - 1];
                j--;
            }
            u[j] = aux;
        }
    }

    public void sortSelectionAsc(Universidad[] u) {
        for (int i = 0; i < u.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < u.length; j++) {
                if (countMatriculados(u[j]) < countMatriculados(u[minIndex])) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Universidad temp = u[i];
                u[i] = u[minIndex];
                u[minIndex] = temp;
            }
        }
    }

    public void sortSelectionDesc(Universidad[] u) {
        for (int i = 0; i < u.length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < u.length; j++) {
                if (countMatriculados(u[j]) > countMatriculados(u[maxIndex])) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                Universidad temp = u[i];
                u[i] = u[maxIndex];
                u[maxIndex] = temp;
            }
        }
    }

    // ============================================================
    // BÚSQUEDA BINARIA POR MATRÍCULADOS
    // ============================================================

    public Universidad binarySearchByEnrollment(Universidad[] u, int enrollment, boolean isAscending) {

        int left = 0;
        int right = u.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midEnrollment = countMatriculados(u[mid]);

            if (midEnrollment == enrollment) {
                return u[mid];
            }

            if (isAscending) {
                if (midEnrollment < enrollment) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (midEnrollment > enrollment) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return null;
    }
}
