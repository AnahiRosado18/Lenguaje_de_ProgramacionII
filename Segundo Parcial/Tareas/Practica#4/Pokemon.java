/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
    Anahi Cristal Rosado Keb - 64124
 
 */
package pokemon_herencia;

/**
 *
 * @author lunar
 */
public class Pokemon {
    
    private String nombre;
    private String tipo;
    private int HP =100; //inicializar hp con un valor de 100 directamente
    private int nivel;

    public Pokemon(String nombre, String tipo, int nivel) {   //contructor con los parametros nombre ripo y nivel
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public String getNombre() {  //getters de los atributos
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getHP() {
        return HP;
    }

    public int getNivel() {
        return nivel;
    }
    
    //métodos
    
    private void calculaDanio(int danio) {
        this.HP -= danio;
        System.out.printf("%s recibe %d puntos de danio\n",this.getNombre(), danio);
    }
    
    public void recibirAtaque (String movimiento){
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento);
        double danioAleatorio=Math.random();//casting
        calculaDanio((int) (danioAleatorio*10 +1));
        System.out.printf("%s tiene ahora %s puntos de vida \n",this.getNombre(), this.HP);
        
    }
    
    public void atacar(String movimiento, Pokemon pokemon) {
        System.out.printf("\n%s ataca a %s con %s\n", this.getNombre(),pokemon.getNombre(), movimiento);
        pokemon.recibirAtaque(movimiento);
    }
    
}

