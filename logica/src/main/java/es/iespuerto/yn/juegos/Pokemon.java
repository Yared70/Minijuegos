package es.iespuerto.yn.minijuegos;


import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

public class Pokemon {

    private TreeMap<Integer, Entrenador> historial;
    /**
     * Constructor con un parametro
     * @param historial historial de la partida
     */
    public Pokemon(TreeMap<Integer, Pokemon.Partida> historial) {

        this.historial = new TreeMap<Integer, Pokemon.Partida>();
    }

    //Getters y Setters

    public TreeMap<Integer, Pokemon.Partida> getHistorial() {
        return historial;
    }

    public void setHistorial(TreeMap<Integer, Pokemon.Partida> historial) {
        this.historial = historial;
    }

    class Partida{

        private Integer id;
        private Jugador jugador;
        private ArrayList<Pokemon> listaPokemons;
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
            this.listaPokemons = new ArrayList<Pokemon>();
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

        //Getters y Setters

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public ArrayList<Tipo> getFuerteVs() {
            return fuerteVs;
        }

        public void setFuerteVs(ArrayList<Tipo> fuerteVs) {
            this.fuerteVs = fuerteVs;
        }

        public ArrayList<Tipo> getDebilVs() {
            return debilVs;
        }

        public void setDebilVs(ArrayList<Tipo> debilVs) {
            this.debilVs = debilVs;
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

        //Getters y Setters

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Integer getPp() {
            return pp;
        }

        public void setPp(Integer pp) {
            this.pp = pp;
        }

        public Double getDanio() {
            return danio;
        }

        public void setDanio(Double danio) {
            this.danio = danio;
        }

        public Tipo getTipo() {
            return tipo;
        }

        public void setTipo(Tipo tipo) {
            this.tipo = tipo;
        }
    }

    class Pokemon{

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
        public Pokemon(String nombre, Double vida,
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

        //Getters y Setters
        
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Double getVida() {
            return vida;
        }

        public void setVida(Double vida) {
            this.vida = vida;
        }

        public Double getAtaque() {
            return ataque;
        }

        public void setAtaque(Double ataque) {
            this.ataque = ataque;
        }

        public Double getDefensa() {
            return defensa;
        }

        public void setDefensa(Double defensa) {
            this.defensa = defensa;
        }

        public Integer getNivel() {
            return nivel;
        }

        public void setNivel(Integer nivel) {
            this.nivel = nivel;
        }

        public Tipo getTipo() {
            return tipo;
        }

        public void setTipo(Tipo tipo) {
            this.tipo = tipo;
        }

        public Movimiento[] getListaMovimientos() {
            return listaMovimientos;
        }

        public void setListaMovimientos(Movimiento[] listaMovimientos) {
            this.listaMovimientos = listaMovimientos;
        }

        public String getAsciiArt() {
            return asciiArt;
        }

        public void setAsciiArt(String asciiArt) {
            this.asciiArt = asciiArt;
        }
    };

}
