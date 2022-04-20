package es.iespuerto.yn.minijuegos;

import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

public class Snake {

    private TreeMap<Integer, Partida> historial;
    /**
     * Constructor con un parametro
     * @param historial historial de la partida
     */
    public Snake(TreeMap<Integer, Partida> historial) {

        this.historial = new TreeMap<Integer, Partida>();
    }

    //Getters y Setters

    public TreeMap<Integer, Partida> getHistorial() {
        return historial;
    }

    public void setHistorial(TreeMap<Integer, Partida> historial) {
        this.historial = historial;
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

        //Getters y Setters
        
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Jugador getJugador() {
            return jugador;
        }

        public void setJugador(Jugador jugador) {
            this.jugador = jugador;
        }

        public ArrayList<String> getSnake() {
            return snake;
        }

        public void setSnake(ArrayList<String> snake) {
            this.snake = snake;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public boolean isVictoria() {
            return victoria;
        }

        public void setVictoria(boolean victoria) {
            this.victoria = victoria;
        }
    }

}
