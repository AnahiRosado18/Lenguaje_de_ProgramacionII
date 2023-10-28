/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author lunar
 */
public class Appletun extends Pokemon{

    public Appletun(String nombre, Tipo tipoPrincipal, Tipo tipoSecundario, int PS, int nivel, int velocidad, int ataque, int defensa, int ataqueEspecial, int defensaEspecial) {
        super(nombre, tipoPrincipal, tipoSecundario, PS, nivel, velocidad, ataque, defensa, ataqueEspecial, defensaEspecial);
        
        ListaMovimientos listaMovimientos = new ListaMovimientos();
        
        //especial
        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Energibola"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Pulsodragron"));
        //fisico
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Cola dragon"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Abrecaminos"));
    
    }
    
    

    @Override
    public double obtenerEfectividad(Pokemon pokemonDef) {
        
         double efectividad= 1.0;    
        //MUY fuerte x4
        if((pokemonDef.getTipoPrincipal()== Tipo.AGUA)==(pokemonDef.getTipoSecundario()== Tipo.AGUA)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.AGUA)==(pokemonDef.getTipoSecundario()== Tipo.ELECTRICO)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.AGUA)==(pokemonDef.getTipoSecundario()== Tipo.FUEGO)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.AGUA)==(pokemonDef.getTipoSecundario()== Tipo.PLANTA)) efectividad = 4.0;
        //if((pokemonDef.getTipoPrincipal()== Tipo.AGUA)==(pokemonDef.getTipoSecundario()==Tipo.NA)) efectividad = 2.0;
        
        if((pokemonDef.getTipoPrincipal()== Tipo.ELECTRICO)==(pokemonDef.getTipoSecundario()==Tipo.AGUA)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.ELECTRICO)==(pokemonDef.getTipoSecundario()==Tipo.ELECTRICO)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.ELECTRICO)==(pokemonDef.getTipoSecundario()==Tipo.FUEGO)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.ELECTRICO)==(pokemonDef.getTipoSecundario()==Tipo.PLANTA)) efectividad = 4.0;
        //if((pokemonDef.getTipoPrincipal()== Tipo.ELECTRICO)==(pokemonDef.getTipoSecundario()==Tipo.NA)) efectividad = 2.0;
        
        if((pokemonDef.getTipoPrincipal()== Tipo.PLANTA)==(pokemonDef.getTipoSecundario()==Tipo.AGUA)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.PLANTA)==(pokemonDef.getTipoSecundario()==Tipo.ELECTRICO)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.PLANTA)==(pokemonDef.getTipoSecundario()==Tipo.FUEGO)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.PLANTA)==(pokemonDef.getTipoSecundario()==Tipo.PLANTA)) efectividad = 4.0;
        //if((pokemonDef.getTipoPrincipal()== Tipo.PLANTA)==(pokemonDef.getTipoSecundario()==Tipo.NA)) efectividad = 2.0;
        
        if((pokemonDef.getTipoPrincipal()== Tipo.TIERRA)==(pokemonDef.getTipoSecundario()==Tipo.AGUA)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.TIERRA)==(pokemonDef.getTipoSecundario()==Tipo.ELECTRICO)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.TIERRA)==(pokemonDef.getTipoSecundario()==Tipo.FUEGO)) efectividad = 4.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.TIERRA)==(pokemonDef.getTipoSecundario()==Tipo.PLANTA)) efectividad = 4.0;
        //if((pokemonDef.getTipoPrincipal()== Tipo.TIERRA)==(pokemonDef.getTipoSecundario()==Tipo.NA)) efectividad = 2.0;
        if((pokemonDef.getTipoPrincipal()== Tipo.FUEGO)==(pokemonDef.getTipoSecundario()==Tipo.TIERRA)) efectividad = 4.0;
        //if((pokemonDef.getTipoPrincipal()== Tipo.FUEGO)==(pokemonDef.getTipoSecundario()==Tipo.NA)) efectividad = 2.0;
        
         /*
        if(pokemonDef.getTipoPrincipal()== Tipo.PLANTA) efectividad = 2.0;
        if(pokemonDef.getTipoPrincipal()== Tipo.TIERRA) efectividad = 2.0;
        
        if(pokemonDef.getTipoSecundario()== Tipo.AGUA) efectividad= 2.0;
        if(pokemonDef.getTipoSecundario()==Tipo.ELECTRICO) efectividad = 2.0;
        if(pokemonDef.getTipoSecundario()==Tipo.PLANTA ) efectividad = 2.0;
        if(pokemonDef.getTipoSecundario()==Tipo.FUEGO ) efectividad = 2.0;
        
        if(pokemonDef.getTipoPrincipal()== Tipo.AGUA) efectividad= 2.0;
  
        // debil contra 

        if(pokemonDef.getTipoPrincipal()== Tipo.BICHO) efectividad = 0.5;
        if(pokemonDef.getTipoPrincipal()== Tipo.FUEGO) efectividad = 0.5;
        if(pokemonDef.getTipoPrincipal()== Tipo.HIELO) efectividad = 0.5;
        if(pokemonDef.getTipoPrincipal()==Tipo.VENENO) efectividad=0.5;
        if(pokemonDef.getTipoPrincipal()==Tipo.VOLADOR) efectividad=0.5;
        
        if(pokemonDef.getTipoSecundario()==Tipo.DRAGON ) efectividad = 0.5;
        if(pokemonDef.getTipoSecundario()==Tipo.HADA ) efectividad = 0.5;
        if(pokemonDef.getTipoSecundario()==Tipo.HIELO ) efectividad = 0.5;
        */
        return efectividad;
    }
  
}
