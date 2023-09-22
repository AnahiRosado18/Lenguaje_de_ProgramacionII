/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semestre3;

/**
 *Anahi Cristal Rosado Keb 
 * @author lunar
 */
public class Alumno {

    public String nombre;
    public String carrera;
    public int matricula;
    public int grado;
    public char grupo;
    Tutor tutor;

    public Alumno() {
    }

    public Alumno(String nombre, String carrera, int matricula, int grado, char grupo, Tutor tutor) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.matricula = matricula;
        this.grado = grado;
        this.grupo = grupo;
        this.tutor = tutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
    
}
