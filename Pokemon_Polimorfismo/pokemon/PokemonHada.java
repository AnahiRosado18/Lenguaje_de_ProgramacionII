/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author lunar
 */
public class PokemonHada extends Pokemon {
    
    public PokemonHada(String nombre, int nivel){
        super(nombre,Tipo.HADA, nivel);
    
        ListaMovimientos listaMovimientos = new ListaMovimientos();
    
        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Imagen"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Cabezazo Zen"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Ladrón"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Sombra Vil"));
    }
    
    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad= 1.0;
        
        if(pokemon.getTipo()== Tipo.LUCHA) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.DRAGON) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.SINIESTRO) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.ACERO) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.FUEGO) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.VENENO) efectividad = 0.5;
        return efectividad;
    }
}

