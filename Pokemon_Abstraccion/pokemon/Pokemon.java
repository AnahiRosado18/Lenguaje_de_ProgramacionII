/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;
/**
 *
 * @author lunar
 * Anahi Cristal Rosado Keb- 64124
 */
public abstract class Pokemon {
    
    private String nombre;
    private Tipo tipo;
    private int HP=250; //instanciar hp con un valor de 100 directamente
    private int nivel;
    private Movimiento movimientos [];
        
    
    public Pokemon(String nombre,Tipo tipo, int nivel) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.movimientos = new Movimiento[4];
    }
    
    //set y get del atributo movimiento
    public void setMovimientos(int posicion, Movimiento movimientos) {
        this.movimientos[posicion] = movimientos;
    }
    
    public Movimiento getMovimientos(int posicion) {
        return this.movimientos[posicion];
    }

    // gets de los atributos
    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getHP() {
        return HP;
    }

    public int getNivel() {
        return nivel;
    }

    
    //métodos
    
    private void calculaDanio(int danio, double efectividad) {//investigar para que es el System.out.printf
        double puntosRestados=danio*efectividad;
        this.HP -= puntosRestados;
        System.out.printf("%s recibe %.2f puntos de danio\n",this.getNombre(), puntosRestados);
    }
    
    public void recibirAtaque (Movimiento movimiento, double efectividad){
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento.getNombre());
        //double danioAleatorio=Math.random();//star casting
        calculaDanio(movimiento.getPuntosDeAtaque(), efectividad);// end casting
        System.out.printf("%s tiene ahora %s puntos de vida \n",this.getNombre(), this.HP);
        
    }
    
    protected boolean seHaConcretadoAtaque(Movimiento movimiento, Pokemon pokemon){
        System.out.printf("\n%s ataca a %s con %s\n", this.getNombre(), pokemon.getNombre(), movimiento.getNombre());
        double efectividad= obtenerEfectividad(pokemon);
        
        if (movimiento.getPp()>0){
            pokemon.recibirAtaque(movimiento,efectividad);
            return true;
        }else{
            System.out.println("El movimiento no tiene puntos de pp");
            return false;
        }
    }
    
    public void atacar(int m, Pokemon pokemon) {
        Movimiento movimiento= getMovimientos(m);
        boolean seHaConcretadoAtaque= seHaConcretadoAtaque(movimiento, pokemon);
        //System.out.printf("\n%s ataca a %s con %s\n", this.getNombre(),pokemon.getNombre(), movimiento);
        //pokemon.recibirAtaque(movimiento);
        if (seHaConcretadoAtaque){
            pokemon.getMovimientos(m).setPp(movimiento.getPp()-1);
        }
    }
    
    public abstract double obtenerEfectividad(Pokemon pokemon);
}

