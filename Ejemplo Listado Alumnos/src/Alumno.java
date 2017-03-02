/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Alumno {

    private String nombre;
    private double nota;

    public Alumno() {
        this.nombre = "";
        this.nota = 0;
    }

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public Alumno(Alumno alumno) {
        this.nombre = alumno.getNombre();
        this.nota = alumno.getNota();
    }

    public String getInformacion() {
        return "Nombre: " + this.nombre + "(NOTA: " + this.nota + ")";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
