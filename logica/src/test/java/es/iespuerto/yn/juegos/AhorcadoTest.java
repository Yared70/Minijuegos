package es.iespuerto.yn.juegos;



import es.iespuerto.yn.juegos.Ahorcado;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static es.iespuerto.yn.juegos.PartidaTest.ID;
import static es.iespuerto.yn.juegos.PartidaTest.JUGADOR;


/**
 * Unit test for simple App.
 */
public class AhorcadoTest {


    Ahorcado ahorcado;


    @BeforeEach
    public void beforeEach(){

        if(ahorcado == null){

            ahorcado = new Ahorcado(ID, JUGADOR);

        }

    }

    @Test
    public void constructorAhorcadoTest(){

        Assertions.assertNotNull(ahorcado, "El ahorcado no puede ser NULO");

    }

    @Test
    public void aumentarErrorLetraTest(){

        ahorcado.aumentarErrorLetra("ñ");
        Assertions.assertTrue(!ahorcado.getHistorialLetras().contains("a"), "El historial no " +
                "contiene la letra elegida");

        ahorcado.palabraSecreta = "palabra";
        ahorcado.aumentarErrorLetra("a");
        Assertions.assertTrue(ahorcado.getHistorialLetras().contains("a"), "El historial no " +
                "contiene la letra elegida");
        Assertions.assertTrue(ahorcado.aumentarErrorLetra("a"), "la letra no se ha añadido correctamente");
    }

    @Test
    public void aumentarErrorPalabraTest(){

        ahorcado.aumentarErrorPalabra("ñ");
        Assertions.assertTrue(!ahorcado.getHistorialLetras().contains("a"), "El historial no " +
                "contiene la letra elegida");

        ahorcado.palabraSecreta = "palabra";
        ahorcado.aumentarErrorPalabra("palabra");
        Assertions.assertTrue(ahorcado.getHistorialLetras().contains("a"), "El historial no " +
                "contiene la letra elegida");

    }

    @Test
    public void addLetraTest(){

        ahorcado.addLetra("a");
        Assertions.assertTrue(ahorcado.getHistorialLetras().contains("a"), "El historial no " +
                "contiene la letra elegida");
    }

}

