package es.iespuerto.yn.juegos;

import java.util.TreeMap;

public class Historial {

    private TreeMap<Integer, Partida> historial;

    public Historial() {
        this.historial = new TreeMap<Integer, Partida>();
    }

}
