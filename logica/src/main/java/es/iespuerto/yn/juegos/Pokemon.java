package es.iespuerto.yn.juegos;


import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

public class Pokemon {

    private TreeMap<Integer, Partida> historial;
    /**
     * Constructor sin parametros
     */
    public Pokemon() {

        this.historial = new TreeMap<Integer, Partida>();
    }

    class Partida{

        private Integer id;
        private Jugador jugador;
        private ArrayList<Criatura> Pokemons;
        private Date fecha;
        private boolean victoria;
        /**
         * Constructor con un parametro
         * @param jugador Un jugador de la partida
         */
        public Partida(Jugador jugador) {
            Integer id = (int) Math.random() * 100000;
            while (historial.containsKey(id)) {
                id = (int) Math.random() * 100000;
            }
            this.id = id;
            this.jugador = jugador;
            this.Pokemons = new ArrayList<Criatura>();
            this.fecha = new Date();
            this.victoria = false;
        }
    };

    class Tipo{

        private String nombre;
        private ArrayList<Tipo> fuerteVs;
        private ArrayList<Tipo> debilVs;

        /**
         * Constructor con un parametro
         * @param nombre nombre del tipo
         */
        public Tipo(String nombre) {
            this.nombre = nombre;
            this.fuerteVs = new ArrayList<Tipo>();
            this.debilVs = new ArrayList<Tipo>();
        }

    }

    class Movimiento{

        private String nombre;
        private Integer pp;
        private Double danio;
        private Tipo tipo;
        /**
         * Constructor con 4 parametros
         * @param nombre nombre del movimiento
         * @param pp Cantidad de pp del movimiento
         * @param danio Cantidad de danio del movimiento
         * @param tipo Tipo del movimiento
         */
        public Movimiento(String nombre, Integer pp, Double danio, Tipo tipo) {
            this.nombre = nombre;
            this.pp = pp;
            this.danio = danio;
            this.tipo = tipo;
        }

    }

    class Criatura{

        private String nombre;
        private Double vida;
        private Double ataque;
        private Double defensa;
        private Integer nivel;
        private Tipo tipo;
        private Movimiento listaMovimientos[];
        private String asciiArt;
        /**
         * Constructor con 7 parametros 
         * @param nombre nombre del pokemon
         * @param vida  Cantidad de puntos vida del pokemon 
         * @param ataque Cantidad de puntos de ataque del pokemon
         * @param defensa Cantidad de puntos de defensa del pokemon
         * @param nivel Nivel actual del pokemon
         * @param tipo  Tipo del pokemon
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
        }

    };

}
