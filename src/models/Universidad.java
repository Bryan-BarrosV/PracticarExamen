package models;

import java.util.Arrays;

public class Universidad {
    private String nombre;
    private Carrera[] carreras;

    public Universidad(String nombre, Carrera[] carreras) {
        this.nombre = nombre;
        this.carreras = carreras;
    }

    public String getNombre() {
        return nombre;
    }

    public Carrera[] getCarreras() {
        return carreras;
    }

    // public int getTotalMatriculados() {
    // int total = 0;
    // for (Carrera c : carreras) {
    // for (Estudiante e : c.getEstudiantes()) {
    // if (e.isMatriculado()) {
    // total++;
    // }
    // }
    // }
    // return total;
    // }

    @Override
    public String toString() {
        return "Universidad [nombre=" + nombre + ", carreras=" + Arrays.toString(carreras) + "]";
    }

}
