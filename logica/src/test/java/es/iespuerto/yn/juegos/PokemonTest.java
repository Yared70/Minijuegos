package es.iespuerto.yn.juegos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokemonTest {

    Pokemon pokemon;

    @BeforeEach
    public void beforeEach(){

        if(pokemon == null){

            pokemon = new Pokemon();

        }

    }

    @Test
    public void constructorTest(){

        Assertions.assertNotNull(pokemon, "El juego no puede ser nulo");

    }

}
