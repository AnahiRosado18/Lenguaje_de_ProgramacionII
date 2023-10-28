/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author lunar
 */
public class Lanturn extends Pokemon {

    public Lanturn(String nombre, Tipo tipoPrincipal, Tipo tipoSecundario, int PS, int nivel, int velocidad, int ataque, int defensa, int ataqueEspecial, int defensaEspecial) {
        super(nombre, tipoPrincipal, tipoSecundario, PS, nivel, velocidad, ataque, defensa, ataqueEspecial, defensaEspecial);
        
        ListaMovimientos listaMovimientos = new ListaMovimientos();
        
        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Pistola Agua"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Chispa"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Cascada"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Trueno"));
    
        
    }
    
    @Override
    public double obtenerEfectividad(Pokemon pokemonDef) {
        double efectividad =1.0;
        
        if((pokemonDef.getTipoPrincipal()== Tipo.ELECTRICO)==(pokemonDef.getTipoSecundario()== Tipo.TIERRA)) efectividad = 0.25;
        if((pokemonDef.getTipoPrincipal()== Tipo.PLANTA)==(pokemonDef.getTipoSecundario()== Tipo.TIERRA)) efectividad = 0.25;
        
        /*
        if((pokemonDef.getTipoPrincipal()== Tipo.ACERO)==(pokemonDef.getTipoSecundario()== Tipo.ELECTRICO)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.ACERO)==(pokemonDef.getTipoSecundario()== Tipo.VOLADOR)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.AGUA)==(pokemonDef.getTipoSecundario()== Tipo.ACERO)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.AGUA)==(pokemonDef.getTipoSecundario()== Tipo.ELECTRICO)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.AGUA)==(pokemonDef.getTipoSecundario()== Tipo.VOLADOR)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.FUEGO)==(pokemonDef.getTipoSecundario()== Tipo.ACERO)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.FUEGO)==(pokemonDef.getTipoSecundario()== Tipo.ELECTRICO)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.FUEGO)==(pokemonDef.getTipoSecundario()== Tipo.VOLADOR)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.HIELO)==(pokemonDef.getTipoSecundario()== Tipo.ACERO)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.HIELO)==(pokemonDef.getTipoSecundario()== Tipo.ELECTRICO)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.HIELO)==(pokemonDef.getTipoSecundario()== Tipo.VOLADOR)) efectividad = 4.0;
        */
        
       return efectividad;
    }
    
    
}
