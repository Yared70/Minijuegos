package es.iespuerto.yn.juegos;

import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

public class Snake {

    private TreeMap<Integer, Partida> historial;
    /**
     * Constructor sin parametros
     */
    public Snake() {

        this.historial = new TreeMap<Integer, Partida>();
    }


    class Partida{

        private Integer id;
        private Jugador jugador;
        private ArrayList<String> snake;
        private Date fecha;
        private boolean victoria;
        /**
         * Constructor con un parametro
         * @param jugador
         */
        public Partida(Jugador jugador) {

            Integer id = (int)Math.random()*100000;
            while(historial.containsKey(id)){
                id = (int)Math.random()*100000;
            }
            this.id = id;
            this.jugador = jugador;
            this.snake = new ArrayList<String>();
            this.fecha = new Date();
            this.victoria = false;
        }

    }

}
