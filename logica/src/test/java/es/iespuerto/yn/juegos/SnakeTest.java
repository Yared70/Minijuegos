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

    @Test
    public void addComidaTest(){

        Assertions.assertTrue(snake.addComida(), "No se ha colocado la comida correctamente");

    }

    @Test
    public void addMuroTest(){

        Assertions.assertTrue(snake.addMuro(), "No se ha colocado el muro correctamente");

        snake.addComida();
        snake.cantidadMuros = 0;
        snake.cantidadComidas = 3;
        Assertions.assertTrue(snake.addMuro(), "Error al colocar un muro");
        for (int i = 0; i < 5; i++) {
            Assertions.assertTrue(snake.addMuro(), "Error al colocar un muro");
        }


    }

    @Test
    public void habraChoqueTest(){



    }

}
