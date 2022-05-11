package es.iespuerto.yn.juegos;

import java.util.TreeMap;

public class Jugador {

    private String nombre;
    private int cantidadPartidas;
    private TreeMap<Integer, Partida> partidas;
    /**
     * Constructor con un parametro
     * @param nombre Nombre del jugador
     */

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.cantidadPartidas = 0;
        this.partidas = new TreeMap<Integer, Partida>();
    }



}

