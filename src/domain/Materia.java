package domain;

public class Materia {
    private String nombre;
    private String cuatrimestre;

    public Materia(String nombre, String cuatrimestre) {
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
    }
    @Override
    public String toString() {
        return
                 nombre + "\n" + "Cuatrimestre: " +cuatrimestre ;

    }

}