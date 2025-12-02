package models;

import java.util.Arrays;

public class Carrera {
    private String nombre;
    private Estudiante[] estudiantes;

    public Carrera(String nombre, Estudiante[] estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    
    @Override
    public String toString() {
        return nombre + " | Estudiantes: " + estudiantes.length;
    }

}
