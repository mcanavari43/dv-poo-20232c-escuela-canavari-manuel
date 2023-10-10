package domain;

import java.util.Arrays;

public class Escuela {
    private static final int ASIGNACIONES_DEFAULT = 6;
    private Asignacion[] asignaciones;

    private String nombre;

    // Constructor con valor de asignaciones constantes
    public Escuela(String nombre) {
        asignaciones = new Asignacion[ASIGNACIONES_DEFAULT];
        this.nombre = nombre;
    }

    // Constructor con asignaciones variables

    public Escuela(int cantidadAsignaciones, String nombre) {
        this.asignaciones = new Asignacion[cantidadAsignaciones];
        this.nombre = nombre;
    }


    // Recomendacion:

    // Generar una validacion para que no se puedan repetir las asignaciones

    public void addAsignacion(Asignacion asignacion) {

        int i = 0;
        while (i < asignaciones.length) {
            if (this.asignaciones[i] == null) {
                this.asignaciones[i] = asignacion;
                break;
            }
            i++;
        }
        if (i >= asignaciones.length) {
            System.out.println("No se pueden agregar más asignaciones. Limite alcanzado");
        }
    }

    public void getAsignaciones() {
        for (int i = 0; i < asignaciones.length; i++) {
            if (asignaciones[i] != null) {
                System.out.println(asignaciones[i]);
            } else {
                System.out.println("Error en crear asignacion: " + (i + 1));
            }
        }
    }

}
