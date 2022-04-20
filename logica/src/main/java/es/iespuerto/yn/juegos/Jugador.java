package es.iespuerto.yn.minijuegos;

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

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}

