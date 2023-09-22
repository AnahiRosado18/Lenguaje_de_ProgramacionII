/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semestre3;

/**
 *Corrección, impresion de datos completos- Anahí Cristal Rosado Keb
 * @author lunar
 */
public class AlumnoFinal1 {
    
    public static void main (String[] args){
        
        Telefono telefonoTutor = new Telefono("+52","981","9811693047");
        Tutor tutor01 = new Tutor("Arlethe", 50,telefonoTutor);
        Alumno Alumno01 = new Alumno("Jorge","Diseño Multimedia", 469142,3, 'C',tutor01); 
        Alumno Alumno1 = Alumno01;
        Tutor tutor1=tutor01;
        System.out.println("Los datos del alumno son: "+Alumno1);
        System.out.println("El telefono del Tutor es: "+Alumno01.getTutor().getTelefono().toString());
       
    }
}
