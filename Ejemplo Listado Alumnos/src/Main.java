/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Main {

    public static Console c = new Console("");

    public Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno al1 = new Alumno("Alumno 1", 40.0);
        Alumno al2 = new Alumno("Alumno 2", 50.0);
        Alumno al3 = new Alumno("Alumno 3", 30.0);
        Alumno al4 = new Alumno("Alumno 4", 60.0);

        Curso curso1 = new Curso("8vo A");
        curso1.agregarAlumno(al1);
        curso1.agregarAlumno(al2);
        curso1.agregarAlumno(al3);
        curso1.agregarAlumno(al4);

        c.println("Ingrese el nombre del alumno: ");
        String nombre = c.readString();

        c.println("Ingrese la nota del alumno: ");
        double nota = c.readDouble();

        Alumno al5 = new Alumno(nombre, nota);
        curso1.agregarAlumno(al5);

        c.println(curso1.getListadoAlumnos());

        c.println(curso1.buscarAlumno(al1));
        c.println(curso1.buscarAlumno("Alumno 1"));
        c.println(curso1.buscarAlumno("AlUmNo 1"));

        c.println(curso1.eliminarAlumno(al1));
        c.println(curso1.eliminarAlumno(al3));

        c.println(curso1.getListadoAlumnos());
        c.println(curso1.obtenerMejorAlumno());

    }

}
