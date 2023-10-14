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
        //movimientos de tipo awa
        movimientos.add(new Movimiento("Azote Torrencial", 25, 8, Tipo.AGUA));
        movimientos.add(new Movimiento("Branquibocado",85,16,Tipo.AGUA));
        movimientos.add(new Movimiento("Buceo", 80, 16, Tipo.AGUA));
        movimientos.add(new Movimiento("Cascada", 80, 24, Tipo.AGUA));
        
        //movimeintos de tipo Hada
        movimientos.add(new Movimiento("Choque anímico", 75, 24, Tipo.HADA));
        movimientos.add(new Movimiento("Feerichoque", 100, 16, Tipo.HADA));
        movimientos.add(new Movimiento("Carantoña", 90, 16,Tipo.HADA));
        movimientos.add(new Movimiento("Multiataque", 120, 16, Tipo.HADA));
        }
        //Metoqdo que devuelve el movimiento buscando el nombre
        
        public Movimiento buscarMovimientoPorNombre(String nombre){   
            for(Movimiento movimiento: movimientos){
                if (movimiento.getNombre().equals(nombre)){
                    return movimiento;
                }
            }
            return null;
        }
    }

