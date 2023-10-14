/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author lunar
 */
public class PokemonAgua extends Pokemon { //Como tal esta es la herencia por lo que entendi, y tambien es lo del
    //principio abierto y cerrado, por la palabra esa "extends", esta y la del pokemon hada son las clases hijas
    
    public PokemonAgua(String nombre, int nivel) {
        super(nombre, Tipo.AGUA, nivel);
        
        ListaMovimientos listaMovimientos = new ListaMovimientos();
    
        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Azote Torrencial"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Branquibocado"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Buceo"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Cascada"));    
    }
    
    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad= 1.0;
        
        if(pokemon.getTipo()== Tipo.TIERRA) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.FUEGO) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.ROCA) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.PLANTA) efectividad = 1.0;
        if(pokemon.getTipo()== Tipo.DRAGON) efectividad = 1.0;
        if(pokemon.getTipo()== Tipo.AGUA) efectividad = 1.0;
        if(pokemon.getTipo()== Tipo.ELECTRICO) efectividad = 0.0;
        return efectividad;
    }
}
