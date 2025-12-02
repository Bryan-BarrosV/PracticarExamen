package controllers;

import models.Carrera;
import models.Estudiante;
import models.Universidad;
import test.UniversidadDataSet;

public class UniversidadController {
    public int countMatriculados(Universidad u) {
        int count = 0;
        for (Carrera c : u.getCarreras()) {
            for (Estudiante e : c.getEstudiantes()) {
                if (e.isMatriculado()) {
                    count++;
                }
            }
        }
        return count;
    }


    public void sortBubbleAsc(Universidad[] u) {
        boolean swapped;
        for (int i = 0; i < u.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < u.length - 1 - i; j++) {
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

    // Descendente
    public void sortBubbleDesc(Universidad[] u) {
        boolean swapped;
        for (int i = 0; i < u.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < u.length - 1 - i; j++) {
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


    // Descendente
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


    public void sortInsertionAsc(Universidad[] u) {
        for (int i = 1; i < u.length; i++) {
            Universidad key = u[i];
            int j = i - 1;

            while (j >= 0 && countMatriculados(u[j]) > countMatriculados(key)) {
                u[j + 1] = u[j];
                j--;
            }
            u[j + 1] = key;
        }
    }



    // Descendente
    public void sortInsertionDesc(Universidad[] u) {
        for (int i = 1; i < u.length; i++) {
            Universidad key = u[i];
            int j = i - 1;

            while (j >= 0 && countMatriculados(u[j]) < countMatriculados(key)) {
                u[j + 1] = u[j];
                j--;
            }
            u[j + 1] = key;
        }
    }


    public Universidad binarySearchByEnrollment(Universidad[] universidades,int enrollments,boolean isAscending){
        int left = 0;
        int right = universidades.length-1;
        while (left <= right) {
            int medio = left + (right - left)/2;
            int valormedio = countMatriculados(universidades[medio]);
            if (valormedio == enrollments) {
                return universidades[medio];
            }
            if (isAscending) {
                if (valormedio <enrollments) 
                    left = medio+1;
                else
                    right = medio -1;
            }else{
                if(valormedio >enrollments)
                    left = medio +1;
                else
                    right = medio-1;
            }
        }
        return null;
    }
}
