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
    
        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Choque anímico"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Feerichoque"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Carantoña"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Multiataque"));
    }
    
    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad= 1.0;
        
        if(pokemon.getTipo()== Tipo.LUCHA) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.DRAGON) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.SINIESTRO) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.ACERO) efectividad = 0.0;
        if(pokemon.getTipo()== Tipo.FUEGO) efectividad = 1.0;
        if(pokemon.getTipo()== Tipo.VENENO) efectividad = 0.0;
        return efectividad;
    }
}

