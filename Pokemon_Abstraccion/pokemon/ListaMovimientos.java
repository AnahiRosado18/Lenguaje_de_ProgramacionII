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
        movimientos.add(new Movimiento("Acua Cola", 90, 10, Tipo.AGUA));
        movimientos.add(new Movimiento("Hidroariete",85,10,Tipo.AGUA));
        movimientos.add(new Movimiento("Buceo", 80, 10, Tipo.AGUA));
        movimientos.add(new Movimiento("Cascada", 80, 15, Tipo.AGUA));
        
        //movimeintos de tipo Fantasma
        movimientos.add(new Movimiento("Sombra Vil", 40, 30, Tipo.FANTASMA));
        
        //movimientos de tipo siniestro
        movimientos.add(new Movimiento("Ladrón", 60, 25, Tipo.SINIESTRO));
        
        //movimientos psiquico
        movimientos.add(new Movimiento("Cabezazo Zen", 80, 15,Tipo.PSIQUICO));
        
        //movimientos tipo normal
        movimientos.add(new Movimiento("Imagen", 70, 20, Tipo.NORMAL));
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

