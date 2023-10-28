/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author lunar
 */
public class Movimiento {
    private String nombre;
    private Tipo tipoMovimiento;
    private int pp;
    private int potencia;
    private ClaseMovimiento clase;
    
    //constructor

    public Movimiento(String nombre, Tipo tipoMovimiento, int pp, int potencia, ClaseMovimiento clase) {
        this.nombre = nombre;
        this.tipoMovimiento = tipoMovimiento;
        this.pp = pp;
        this.potencia = potencia;
        this.clase = clase;
    }
    
    //getters
    public String getNombre() {
        return nombre;
    }

    public Tipo getTipoMovimiento() {
        return tipoMovimiento;
    }

    public int getPp() {
        return pp;
    }

    public int getPotencia() {
        return potencia;
    }

    public ClaseMovimiento getClase() {
        return clase;
    }
    
    //set

    public void setPp(int pp) {
        this.pp = pp;
    }
    
}
