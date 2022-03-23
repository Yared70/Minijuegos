package es.iespuerto.yn.minijuegos;

import java.util.*;

public class JuegoAhorcado {

    private TreeMap<Integer, Partida> historial;

    public JuegoAhorcado() {
        this.historial = new TreeMap<Integer, Partida>();
    }

    public TreeMap<Integer, Partida> getHistorial() {
        return historial;
    }

    public void setHistorial(TreeMap<Integer, Partida> historial) {
        this.historial = historial;
    }

    class Partida{

        private Integer id;
        private HashMap<Jugador, Jugador> jugadores;
        private Integer puntosTotales;
        private Integer fallos;
        private Integer dificultad;
        private ArrayList<String> historialLetras;
        private Date fecha;
        private String palabraAdivinar;
        private String palDif1[] =  {"angel", "ojo", "pizza", "enojado", "helado",
                "calabaza", "flor", "arco", "barba"};
        private String palDif2[] = {"cerebro", "hebilla", "langosta", "iman", "megafono",
                "saxofonista", "aspersor", "computadora", "libertad"};
        private String palDif3[] = {"adaptacion", "evaluacion", "diagnostico", "circulacion",
                "procedimiento", "trasladar", "ocupacional", "geolocalizacion", "trasnochador"
        };

        public Partida(Jugador jugador1, Integer dificultad) {

            Random rnd = new Random();
            Integer id = (int) Math.random() * 100000;
            while (historial.containsKey(id)) {
                id = (int) Math.random() * 100000;
            }
            this.id = id;
            this.jugadores = new HashMap<Jugador, Jugador>();
            jugadores.put(jugador1, null);
            this.puntosTotales = 0;
            this.fallos = 0;
            this.dificultad = dificultad;
            this.fecha = new Date();
            this.historialLetras = new ArrayList<String>();
            if (dificultad == 1) {
                int aleatorio = rnd.nextInt(palDif1.length);
                palabraAdivinar = palDif1[aleatorio];
            } else if (dificultad == 2) {
                int aleatorio = rnd.nextInt(palDif2.length);
                palabraAdivinar = palDif2[aleatorio];
            } else {
                int aleatorio = rnd.nextInt(palDif3.length);
                palabraAdivinar = palDif3[aleatorio];
            }

        }

        public Partida(Jugador jugador1, Jugador jugador2){

            Integer id = (int) Math.random() * 100000;
            while (historial.containsKey(id)) {
                id = (int) Math.random() * 100000;
            }
            this.id = id;
            this.jugadores = new HashMap<Jugador, Jugador>();
            jugadores.put(jugador1, jugador2);
            this.puntosTotales = 0;
            this.fallos = 0;
            this.dificultad = 3;

        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public HashMap<Jugador, Jugador> getJugadores() {
            return jugadores;
        }

        public void setJugadores(HashMap<Jugador, Jugador> jugadores) {
            this.jugadores = jugadores;
        }

        public Integer getPuntosTotales() {
            return puntosTotales;
        }

        public void setPuntosTotales(Integer puntosTotales) {
            this.puntosTotales = puntosTotales;
        }

        public Integer getFallos() {
            return fallos;
        }

        public void setFallos(Integer fallos) {
            this.fallos = fallos;
        }

        public Integer getDificultad() {
            return dificultad;
        }

        public void setDificultad(Integer dificultad) {
            this.dificultad = dificultad;
        }

        public ArrayList<String> getHistorialLetras() {
            return historialLetras;
        }

        public void setHistorialLetras(ArrayList<String> historialLetras) {
            this.historialLetras = historialLetras;
        }

        public String getPalabraAdivinar() {
            return palabraAdivinar;
        }

        public void setPalabraAdivinar(String palabraAdivinar) {
            this.palabraAdivinar = palabraAdivinar;
        }

        public String[] getPalDif1() {
            return palDif1;
        }

        public void setPalDif1(String[] palDif1) {
            this.palDif1 = palDif1;
        }

        public String[] getPalDif2() {
            return palDif2;
        }

        public void setPalDif2(String[] palDif2) {
            this.palDif2 = palDif2;
        }

        public String[] getPalDif3() {
            return palDif3;
        }

        public void setPalDif3(String[] palDif3) {
            this.palDif3 = palDif3;
        }
    }

}
