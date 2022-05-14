package es.iespuerto.yn.juegos;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HistorialTest {

    Historial historial;

    @BeforeEach
    public void BeforeEach(){

        if(historial == null){

            historial = new Historial();

        }

    }

    @Test
    public void constructorTest(){

        Assertions.assertNotNull(historial, "El historial no puede ser nulo");

    }

}

