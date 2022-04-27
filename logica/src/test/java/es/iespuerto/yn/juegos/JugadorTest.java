package es.iespuerto.yn.juegos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JugadorTest {

    public static final String NOMBRE = "yared";
    Jugador jugador;

    @BeforeEach
    public void beforeEach(){

        if(jugador == null){

            jugador = new Jugador(NOMBRE);

        }

    }

    @Test
    public void toStringTest(){

        Assertions.assertNotNull(jugador.toString(), "Respuesta nula");
        Assertions.assertTrue(jugador.toString().contains(NOMBRE), "No contiene el nombre");


    }

}
