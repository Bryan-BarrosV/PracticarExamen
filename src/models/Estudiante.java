package models;

public class Estudiante {
    private String nombre;
    private boolean matriculado;

    public Estudiante(String nombre, boolean matriculado) {
        this.nombre = nombre;
        this.matriculado = matriculado;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", matriculado=" + matriculado + "]";
    }
}
