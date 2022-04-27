package es.iespuerto.yn.juegos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SnakeTest {

    Snake snake;

    @BeforeEach
    public void beforeEach(){

        if(snake == null){

            snake = new Snake();

        }

    }

    @Test
    public void constructorTest(){

        Assertions.assertNotNull(snake, "El snake no puede ser nulo");

    }

}
