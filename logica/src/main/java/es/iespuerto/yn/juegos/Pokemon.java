package es.iespuerto.yn.juegos;



import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

public class Pokemon extends Partida {
    private ArrayList<Criatura> pokemons;
    private ArrayList<Criatura> pokemonsalvajes;
    private boolean victoria;
    
    
    public Pokemon(Integer id, Jugador jugador) {
        super(id, jugador);
        this.pokemons = new ArrayList<Criatura>();
        this.victoria = false;
    }
    public boolean agregarPokemonSalvaje(Criatura pokemon){
        this.pokemonsalvajes.add(pokemon);
        return true;
    }
    
    public boolean atacar(Criatura pokemon1,Criatura pokemon2,Movimiento movimiento){
        Double ataque=pokemon1.getAtaque();
        Double defensa=pokemon2.getDefensa();
        Double vida=pokemon2.getVidaActual();
        Double danio=movimiento.getDanio();
        Double vidaAquitar;
        Double potencia=danio/100;
        vidaAquitar=(ataque*potencia)-(defensa/2);
        Double vidaFinal=vida-vidaAquitar;
        pokemon2.setVidaActual(vidaFinal);
        
      
        return true;
    }
    public Criatura BuscarCombate(){
        int intPokemon = (int) (Math.random()*this.pokemonsalvajes.size())+1;
        Criatura pokemon = pokemonsalvajes.get(intPokemon);
        return pokemon;
}
    
    class Tipo {

        private String nombre;
        private ArrayList<Tipo> fuerteVs;
        private ArrayList<Tipo> debilVs;

        /**
         * Constructor con un parametro
         *
         * @param nombre nombre del tipo
         */
        public Tipo(String nombre) {
            this.nombre = nombre;
            this.fuerteVs = new ArrayList<Tipo>();
            this.debilVs = new ArrayList<Tipo>();
        }

    }

    class Movimiento {

        private String nombre;
        private Integer pp;
        private Double danio;
        private Tipo tipo;

        /**
         * Constructor con 4 parametros
         *
         * @param nombre nombre del movimiento
         * @param pp     Cantidad de pp del movimiento
         * @param danio  Cantidad de danio del movimiento
         * @param tipo   Tipo del movimiento
         */
        public Movimiento(String nombre, Integer pp, Double danio, Tipo tipo) {
            this.nombre = nombre;
            this.pp = pp;
            this.danio = danio;
            this.tipo = tipo;
        }
       public Double getDanio() {
            return danio;
        }


    }

    class Criatura {

        private String nombre;
        private Double vida;
        private Double vidaActual;
        private Double ataque;
        private Double defensa;
        private Integer nivel;
        private Tipo tipo;
        private Movimiento listaMovimientos[];
        private String asciiArt;

        /**
         * Constructor con 7 parametros
         *
         * @param nombre   nombre del pokemon
         * @param vida     Cantidad de puntos vida del pokemon
         * @param ataque   Cantidad de puntos de ataque del pokemon
         * @param defensa  Cantidad de puntos de defensa del pokemon
         * @param nivel    Nivel actual del pokemon
         * @param tipo     Tipo del pokemon
         * @param asciiArt Codigo asciiArt del pokemon
         */
        public Criatura(String nombre, Double vida,
                        Double ataque, Double defensa, Integer nivel,
                        Tipo tipo,
                        String asciiArt) {
            this.nombre = nombre;
            this.vida = vida;
            this.ataque = ataque;
            this.defensa = defensa;
            this.nivel = nivel;
            this.tipo = tipo;
            this.listaMovimientos = new Movimiento[4];
            this.asciiArt = asciiArt;
            this.vidaActual=vida;
        }

        public void setVidaActual(Double vidaActual) {
            this.vidaActual = vidaActual;
        }

        public Double getVidaActual() {
            return vidaActual;
        }
        public Double getAtaque() {
            return ataque;
        }

        public Double getDefensa() {
            return defensa;
        }

        public Tipo getTipo() {
            return tipo;
        }

        private String getNombre() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    ;

}

