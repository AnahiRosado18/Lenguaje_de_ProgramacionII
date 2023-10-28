/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemon_polimorfismo;

import pokemon.Appletun;
import pokemon.Lanturn;
import pokemon.Tipo;

/**
 *
 * @author lunar
 */
public class BatallaPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Appletun Appletun = new Appletun("Appletun", Tipo.PLANTA, Tipo.DRAGON,110,10, 30,85,80,100,80);
        Lanturn Lanturn = new Lanturn("Lanturn", Tipo.AGUA, Tipo.ELECTRICO, 125,10,67,88,88,76,76);
        
        Appletun.atacar(0, Appletun, Lanturn);
        Lanturn.atacar(3, Lanturn, Appletun);
    
    }
    
}
