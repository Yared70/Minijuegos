package es.iespuerto.yn.juegos;



import es.iespuerto.yn.juegos.Ahorcado;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AhorcadoTest {

    Ahorcado ahorcado = new Ahorcado();


    @BeforeAll
    public void before(){

        if(ahorcado == null){

            ahorcado = new Ahorcado();

        }

    }

    @Test
    public void constructorAhorcadoTest(){

        Assertions.assertNotNull(ahorcado, "El ahorcado no puede ser NULO");

    }

}

