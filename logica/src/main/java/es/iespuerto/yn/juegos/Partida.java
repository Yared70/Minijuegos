package es.iespuerto.yn.juegos;

import java.util.Date;
import java.util.HashMap;

abstract class Partida {

    protected Integer id;
    protected Jugador jugador;
    protected Date fecha;

    public Partida(Integer id, Jugador jugador) {
        this.id = id;
        this.jugador = jugador;
        this.fecha = new Date();
    }

    public Integer getId() {
        return id;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Date getFecha() {
        return fecha;
    }
}

