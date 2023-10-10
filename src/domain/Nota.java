package domain;

public class Nota {
    private Double nota;
    private String tipo;

    public Nota(Double nota,String tipo) {
        this.nota = nota;
        this.tipo = tipo;

    }

    public Double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return " " + tipo + " - " + nota;
    }


}
