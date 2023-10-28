/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * Anahi Cristal Rosado Keb- 64124
 */
public abstract class Pokemon {
    private String nombre;
    private Tipo tipoPrincipal;
    private Tipo tipoSecundario;
    private int PS;
    private int nivel;
    private int velocidad;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private Movimiento movimientos[];

    public Pokemon(String nombre, Tipo tipoPrincipal, Tipo tipoSecundario, int PS, int nivel, int velocidad, int ataque, int defensa, int ataqueEspecial, int defensaEspecial) {
        this.nombre = nombre;
        this.tipoPrincipal = tipoPrincipal;
        this.tipoSecundario = tipoSecundario;
        this.PS = PS;
        this.nivel = nivel;
        this.velocidad = velocidad;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.movimientos = new Movimiento[4];
    }
 
    public void setMovimientos(int posicion, Movimiento movimientos) {
        this.movimientos[posicion] = movimientos;
    }
    
    public Movimiento getMovimientos(int posicion) {
        return this.movimientos[posicion];
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipoPrincipal() {
        return tipoPrincipal;
    }

    public Tipo getTipoSecundario() {
        return tipoSecundario;
    }

    public int getPS() {
        return PS;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }
    
    /*public double bonificacion (Pokemon pokemon, Movimiento movimiento, double efectividad){
        if((movimiento.getTipoMovimiento()== getTipoPrincipal())||(movimiento.getTipoMovimiento()== getTipoSecundario())){
            return efectividad=1.5;
        }else{
            return efectividad=1.0;
        }
    }*/
    
    public int comprobarClaseAtaque(Movimiento movimientos, Pokemon pokemonAta){
        if (movimientos.getClase()==ClaseMovimiento.FISICO){
            return pokemonAta.getAtaque();
        }else{
            return pokemonAta.getAtaqueEspecial();
        }
    }
    
    public int comprobarClaseDefensa(Movimiento movimientos, Pokemon pokemonAta){
         if (movimientos.getClase()==ClaseMovimiento.FISICO){
            return getDefensa();
        }else{
            return getDefensaEspecial();
        }
    }
    
    public int calculaDanio(Pokemon pokemonAta, double efectividad, Movimiento movimientos){
       double NumAleatorio=Math.random();
        int max=100;
        int min=85;
        int Variacion= (int)( (NumAleatorio * (max-min+1) + min)); 
     
        double p1= (0.01*1.0*efectividad*Variacion);
        double p2= (0.2*getNivel()+1);
        double p3= (comprobarClaseAtaque(movimientos, pokemonAta)*movimientos.getPotencia());
        double p4= (25*comprobarClaseDefensa(movimientos, pokemonAta));
        double p5= (p2*p3);
        double p6= (p5/p4);
        double p7= (p6+2);
        
        System.out.println(efectividad);
        int danio= (int) ((p1*p7));
       
        double puntosRestados = danio;
        this.PS -= puntosRestados;
        if (puntosRestados>this.PS){
            System.out.printf("%s ha muerto por que recibio %f de danio\n", this.getNombre(), puntosRestados);
        } else{
        System.out.printf("%s recibe %.2f puntos de danio\n",this.getNombre(), puntosRestados);
        }
        
        return danio;
    }
    
    public void recibirAtaque(Movimiento movimientos, Pokemon pokemonAta, double efectividad){
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimientos.getNombre());
        calculaDanio(pokemonAta, efectividad, movimientos);
        System.out.printf("%s tiene ahora %s puntos de vida \n",this.getNombre(), this.PS);
        
    }
    
    protected boolean seHaConcretadoAtaque(Movimiento movimientos, Pokemon pokemonAta, Pokemon pokemon){
        System.out.printf("\n%s ataca a %s con %s\n", this.getNombre(), pokemon.getNombre(), movimientos.getNombre());
        double efectividad= obtenerEfectividad(pokemonAta);
        
        if (movimientos.getPp()>0){
            pokemon.recibirAtaque(movimientos, pokemonAta, efectividad);
            return true;
        }else{
            System.out.println("El movimiento no tiene puntos de pp");
            return false;
        }
    }
    
    public void atacar (int m, Pokemon pokemonAta, Pokemon pokemonDef){
         Movimiento movimientos= getMovimientos(m);
        boolean seHaConcretadoAtaque= seHaConcretadoAtaque(movimientos, pokemonAta, pokemonDef);
        //System.out.printf("\n%s ataca a %s con %s\n", this.getNombre(),pokemon.getNombre(), movimiento);
        //pokemon.recibirAtaque(movimiento);
        if (seHaConcretadoAtaque){
            pokemonAta.getMovimientos(m).setPp(movimientos.getPp()-1);
        }
    }
    
    public abstract double obtenerEfectividad(Pokemon pokemonDef);
}
