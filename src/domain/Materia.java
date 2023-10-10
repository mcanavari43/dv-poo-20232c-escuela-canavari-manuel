package domain;

public class Materia {
    private String nombre;
    private Integer cuatrimestre;

    public Materia(String nombre, Integer cuatrimestre) {
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
    }
    @Override
    public String toString() {
        return
                 nombre + "\n" + "Cuatrimestre: " +cuatrimestre ;

    }

}