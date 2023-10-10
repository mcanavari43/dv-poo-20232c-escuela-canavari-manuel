package domain;

public class Asignacion {

    private static final int CANTIDAD_NOTAS = 3;
    private Alumno alumno;
    private Materia materia;
    private Nota[] notas;

    // Constructor con valor de nota constante
    public Asignacion(Alumno alumno, Materia materia) {

        
        this.alumno = alumno;
        this.materia = materia;
        this.notas = new Nota[CANTIDAD_NOTAS];
    }

    // Constructor con notas variables
    public Asignacion(Alumno alumno, Materia materia, int cantidad_notas) {
        this.alumno = alumno;
        this.materia = materia;
        this.notas = new Nota[cantidad_notas];
    }

    public void setNotas(Nota[] notas) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] != null) {
                this.notas[i] = notas[i];
            } else {
                System.out.println("Error de asignación");
            }
        }
    }

    public Double calcularPromedio() {
        Double suma = 0D;
        for (Nota nota : notas) {
            if (nota != null && nota.getNota() != null) {
                suma += nota.getNota();
            }
        }
        return suma / notas.length;
    }

    public String mostrarNotas() {
        String tipoDeNota = "";
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] != null) {
                if (notas[i] == notas[2]) {
                    tipoDeNota += notas[i];
                } else {
                    tipoDeNota += notas[i] + " | ";
                }
            }
        }
        return tipoDeNota;
    }

    ;

    public String getEstado() {
        double promedio = calcularPromedio();
        return promedio >= 6 ? "Aprobada" : "Reprobado";
    }

    ;

    @Override
    public String toString() {
        return "Alumno: " + alumno + "\n" + "Materia: " + materia + "\n" + "Notas:" + mostrarNotas() +

                "\nPromedio: " + calcularPromedio().toString().substring(0, 3) + "\n" + "Estado: " + getEstado() + "\n-------------";
    }
}
