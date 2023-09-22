/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semestre3;

/**
 *
 * @author lunar
 */
public class AlumnoFinal {
    
    public static void main (String[] args){
        
        Telefono telefonoTutor = new Telefono("+52","981","9811693047");
        Tutor tutor01 = new Tutor("Arlethe", 50, telefonoTutor);
        Alumno Alumno01 = new Alumno("Jorge","Diseño Multimedia", 469142,3, 'C',tutor01); 
        String telefonoS = Alumno01.getTutor().getTelefono().toString();
        System.out.println("El telefono del Tutor es: "+telefonoS);
    }
}
