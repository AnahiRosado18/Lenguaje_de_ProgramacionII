/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author lunar
 */
class Movimiento {
    
    private String nombre;
    private int puntosDeAtaque;
    private int pp; //puntos de poder, cuando llegue a 0 no deberia de poder seguir atacando xd
    private Tipo tipo;
    
    //constructor
    public Movimiento(String nombre, int puntosDeAtaque, int pp, Tipo tipo) {
        this.nombre = nombre;
        this.puntosDeAtaque = puntosDeAtaque;
        this.pp = pp;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public int getPp() {
        return pp;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }
    
    
}
