package es.iespuerto.yn.juegos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static es.iespuerto.yn.juegos.PartidaTest.ID;
import static es.iespuerto.yn.juegos.PartidaTest.JUGADOR;

public class SnakeTest {

    Snake snake;

    @BeforeEach
    public void beforeEach(){

        if(snake == null){

            snake = new Snake(ID, JUGADOR);

        }

    }

    @Test
    public void constructorTest(){

        Assertions.assertNotNull(snake, "El snake no puede ser nulo");

    }

}
