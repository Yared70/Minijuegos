package es.iespuerto.yn.juegos;

import java.util.*;

public class Ahorcado extends Partida{

        private Integer puntosTotales;
        private Integer fallos;
        private Integer dificultad;
        private ArrayList<String> historialLetras;
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
         * @param jugador 1º jugador
         * @param dificultad nivel de dificultad
         */
        public Ahorcado(Integer id, Jugador jugador, Integer dificultad) {
            super(id, jugador);

            this.puntosTotales = 0;
            this.fallos = 0;
            this.dificultad = dificultad;
            this.historialLetras = new ArrayList<String>();

            Random rnd = new Random();
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



    }


