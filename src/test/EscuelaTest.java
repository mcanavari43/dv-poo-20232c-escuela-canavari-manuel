package test;


import domain.*;

public class EscuelaTest {
    public static void main(String[] args) {

        // Crear escuela
        Escuela escuela = new Escuela("Universidad de Lujan");

        // Crear materia
        Materia materia1 = new Materia("Matemáticas", 2);
        Materia materia2 = new Materia("Física", 1);
        Materia materia3 = new Materia("Química", 3);

        //Crear alumno
        Alumno alumno1 = new Alumno("Manuel", 27);
        Alumno alumno2 = new Alumno("Juan", 20);
        Alumno alumno3 = new Alumno("Barbara", 24);

        //Asignar alumno a materia
        Asignacion asignacion1 = new Asignacion(alumno1, materia2);
        Asignacion asignacion2 = new Asignacion(alumno1, materia3);
        Asignacion asignacion3 = new Asignacion(alumno2, materia1);
        Asignacion asignacion4 = new Asignacion(alumno2, materia3);
        Asignacion asignacion5 = new Asignacion(alumno3, materia1);
        Asignacion asignacion6 = new Asignacion(alumno3, materia2);

        //Crear notas de alumnno
        Nota[] alumno1Materia2 = {new Nota(10D, "Primer Parcial"), new Nota(7.5, "Segundo Parcial"), new Nota(8.50, "Tp")};
        Nota[] alumno1Materia3 = {new Nota(7.0, "Primer Parcial"), new Nota(4.5, "Segundo Parcial"), new Nota(9.5, "Tp")};
        Nota[] alumno2Materia1 = {new Nota(5.25, "Primer Parcial"), new Nota(9.5, "Segundo Parcial"), new Nota(10D, "Tp")};
        Nota[] alumno2Materia3 = {new Nota(4.75, "Primer Parcial"), new Nota(10D, "Segundo Parcial"), new Nota(9.25, "Tp")};
        Nota[] alumno3Materia1 = {new Nota(9.5, "Primer Parcial"), new Nota(8.25, "Segundo Parcial"), new Nota(7.25, "Tp")};
        Nota[] alumno3Materia2 = {new Nota(8D, "Primer Parcial"), new Nota(7.0, "Segundo Parcial"), new Nota(8.25, "Tp")};

        // Asignar notas del alumno y realizar promedio
        asignacion1.setNotas(alumno1Materia2);
        asignacion2.setNotas(alumno1Materia3);
        asignacion3.setNotas(alumno2Materia1);
        asignacion4.setNotas(alumno2Materia3);
        asignacion5.setNotas(alumno3Materia1);
        asignacion6.setNotas(alumno3Materia2);

        // Asignar alumno-materia a escuela
        escuela.addAsignacion(asignacion1);
        escuela.addAsignacion(asignacion2);
        escuela.addAsignacion(asignacion3);
        escuela.addAsignacion(asignacion4);
        escuela.addAsignacion(asignacion5);
        escuela.addAsignacion(asignacion6);

        // Mostrar asignaciones de la escuela
        escuela.getAsignaciones();
    }

}
