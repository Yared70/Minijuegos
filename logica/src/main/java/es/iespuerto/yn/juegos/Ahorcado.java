package es.iespuerto.yn.juegos;

import java.util.*;

public class Ahorcado {

    private TreeMap<Integer, Partida> historial;

    /**
     * Constructor de la clase
     */
    public Ahorcado() {

        this.historial = new TreeMap<Integer, Partida>();
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
        /**
         * Constructor de la clase con 2 parametros 
         * @param jugador1 1º jugador 
         * @param dificultad nivel de dificultad
         */
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
        /**
         * Constructor de la clase con 2 parametros 
         * @param jugador1 1º jugador 
         * @param jugador2 2º jugador 
         */
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



    }

}
