package es.iespuerto.yn.minijuegos;


import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

public class Partida {

    private TreeMap<Integer, Entrenador> historial;

    public JuegoPokemon(TreeMap<Integer, Partida.Entrenador> historial) {

        this.historial = new TreeMap<Integer, Partida.Entrenador>();
    }

    public TreeMap<Integer, Partida.Entrenador> getHistorial() {
        return historial;
    }

    public void setHistorial(TreeMap<Integer, Partida.Entrenador> historial) {
        this.historial = historial;
    }

    class Entrenador{

        private Integer id;
        private Jugador jugador;
        private ArrayList<Pokemon> listaPokemons;
        private Date fecha;
        private boolean victoria;

        public Entrenador(Jugador jugador) {
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

        public Tipo(String nombre) {
            this.nombre = nombre;
            this.fuerteVs = new ArrayList<Tipo>();
            this.debilVs = new ArrayList<Tipo>();
        }

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

        public Movimiento(String nombre, Integer pp, Double danio, Tipo tipo) {
            this.nombre = nombre;
            this.pp = pp;
            this.danio = danio;
            this.tipo = tipo;
        }

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
