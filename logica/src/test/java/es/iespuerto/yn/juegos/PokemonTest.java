package es.iespuerto.yn.juegos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.IDN;

import static es.iespuerto.yn.juegos.PartidaTest.ID;
import static es.iespuerto.yn.juegos.PartidaTest.JUGADOR;

public class PokemonTest {

    Pokemon pokemon;

    @BeforeEach
    public void beforeEach(){

        if(pokemon == null){

            pokemon = new Pokemon(ID, JUGADOR);

        }

    }

    @Test
    public void constructorTest(){

        Assertions.assertNotNull(pokemon, "El pokemon no puede ser nulo");

    }

}
