/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

import java.util.ArrayList;

/**
 *
 * @author lunar
 */
public class ListaMovimientos {
    private ArrayList<Movimiento> movimientos = new ArrayList<>();
    
    public ListaMovimientos(){
        //movimiento Planta fisico
        movimientos.add(new Movimiento("Abrecaminos", Tipo.PLANTA, 20,50,ClaseMovimiento.FISICO));
        //movimiento Planta especial
        movimientos.add(new Movimiento("Energibola", Tipo.PLANTA, 10,90,ClaseMovimiento.ESPECIAL));
        //movimiento Dragon fisico
        movimientos.add(new Movimiento("Cola dragon", Tipo.DRAGON, 10,60,ClaseMovimiento.FISICO));
        //movimiento Dragon especial
        movimientos.add(new Movimiento("Pulsodragon", Tipo.DRAGON, 10,85,ClaseMovimiento.ESPECIAL));
        //movimiento awa fisico
        movimientos.add(new Movimiento("Cascada", Tipo.AGUA, 15,80,ClaseMovimiento.FISICO));
        //movimento awa especial
        movimientos.add(new Movimiento("Pistola Agua", Tipo.AGUA, 25,40,ClaseMovimiento.ESPECIAL));
        //movimiento electrico fisico
        movimientos.add(new Movimiento("Chispa", Tipo.ELECTRICO, 20,65,ClaseMovimiento.FISICO));
        //movimiento electrico especial
        movimientos.add(new Movimiento("Trueno", Tipo.ELECTRICO, 10,110,ClaseMovimiento.ESPECIAL));
    }
    
    public Movimiento buscarMovimientoPorNombre(String nombre){
        for(Movimiento movimiento: movimientos){
                if (movimiento.getNombre().equals(nombre)){
                    return movimiento;
                }
            }
            return null;
    }
}
