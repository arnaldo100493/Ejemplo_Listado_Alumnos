
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FABAME
 */
public class Curso {

    private String nombre;
    private List<Alumno> listadoAlumnos;

    public Curso() {
        this.nombre = "";
        this.listadoAlumnos = new LinkedList<>();
    }

    public Curso(String nombre) {
        this.nombre = nombre;
        this.listadoAlumnos = new LinkedList<>();
    }

    public Curso(Curso curso) {
        this.nombre = curso.getNombre();
        this.listadoAlumnos = new LinkedList<>();
    }

    public String agregarAlumno(String nombre, double nota) {
        Alumno alumno = new Alumno(nombre, nota);
        this.listadoAlumnos.add(alumno);
        return "Alumno Matriculado.";
    }

    public String agregarAlumno(Alumno alumno) {
        this.listadoAlumnos.add(alumno);
        return "Alumno Matriculado.";
    }

    public String getListadoAlumnos() {
        String s = "\nListado del Curso " + this.nombre + ":";
        Iterator<Alumno> iterator = this.listadoAlumnos.iterator();
        while (iterator.hasNext()) {
            Alumno alumno = (Alumno) iterator.next();
            s += "\n" + alumno.getInformacion();
        }
        return s;
    }

    public String buscarAlumno(String nombreBuscado) {
        Iterator<Alumno> iterator = this.listadoAlumnos.iterator();
        while (iterator.hasNext()) {
            Alumno alumno = (Alumno) iterator.next();
            if (alumno.getNombre().equalsIgnoreCase(nombreBuscado)) {
                return "El alumno " + nombreBuscado + " se encuentra en el curso " + this.nombre;
            }
        }
        return "El alumno " + nombreBuscado + " no se encuentra en el curso " + this.nombre;
    }

    public String buscarAlumno(Alumno alumno) {
        if (this.listadoAlumnos.contains(alumno)) {
            return "El alumno " + alumno.getNombre() + " se encuentra en el curso " + this.nombre;
        }
        return "El alumno " + alumno.getNombre() + " no se encuentra en el curso " + this.nombre;
    }

    public String eliminarAlumno(String nombreBuscado) {
        Iterator<Alumno> iterator = this.listadoAlumnos.iterator();
        while (iterator.hasNext()) {
            Alumno alumno = (Alumno) iterator.next();
            if (alumno.getNombre().equalsIgnoreCase(nombreBuscado)) {
                this.listadoAlumnos.remove(alumno);
                return "El alumno " + nombreBuscado + " fue eliminado del curso ";
            }
        }
        return "El alumno " + nombreBuscado + " no se encuentra en el curso " + this.nombre;
    }

    public String eliminarAlumno(Alumno alumno) {
        if (this.listadoAlumnos.remove(alumno)) {
            return "El alumno " + alumno.getNombre() + " fue eliminado del curso. ";
        }
        return "El alumno " + alumno.getNombre() + " no se encuentra en el curso. ";
    }

    public String obtenerMejorAlumno() {
        double notaMejor = 0;
        String nombreMejor = "";
        Iterator<Alumno> iterator = this.listadoAlumnos.iterator();
        while (iterator.hasNext()) {
            Alumno alumno = (Alumno) iterator.next();
            if (alumno.getNota() > notaMejor) {
                notaMejor = alumno.getNota();
                nombreMejor = alumno.getNombre();
            }
        }
        return "El mejor alumno del curso es: " + nombreMejor + "(NOTA: " + notaMejor + ")";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
