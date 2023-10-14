/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemon_abstraccion;

import pokemon.PokemonAgua;
import pokemon.PokemonHada;

/**
 *
 * @author lunar
 * Anahi Cristal Rosado Keb- 64124
 */
public class BatallaPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PokemonAgua Blastoise =new PokemonAgua("Blastoise", 10);
        PokemonHada Gardevoir = new PokemonHada("Gardevoir", 10);
        Blastoise.atacar(3, Gardevoir);
        Gardevoir.atacar(0, Blastoise);
    }
    
}