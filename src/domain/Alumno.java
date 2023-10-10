package domain;

public class Alumno {
    private String name;
    private Integer edad;

    public Alumno(String name, Integer edad) {
        this.name = name;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return name;
    }
}
