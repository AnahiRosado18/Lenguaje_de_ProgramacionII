/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemon_herencia;

/**
 *
 * @author lunar
 */
public class BatallaPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pokemon Blastoise =new Pokemon("Blastoise","Tipo Agua", 10);
        Pokemon Gardevoir= new Pokemon("Gardevoir", "Tipo Psiquíco-Hada", 10);
        Blastoise.atacar("Torriente", Gardevoir);
        Gardevoir.atacar("Sincronizar", Blastoise);
    }
    
}
