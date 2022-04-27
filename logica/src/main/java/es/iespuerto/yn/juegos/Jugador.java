package es.iespuerto.yn.juegos;

public class Jugador {

    private String nombre;
    /**
     * Constructor con un parametro
     * @param nombre Nombre del jugador
     */
    public Jugador(String nombre) {

        this.nombre = nombre;
    }
    /**
     * Metodo to String de la clase
     */
    @Override
    public String toString() {
        return "Jugador: " + nombre;
    }



}

