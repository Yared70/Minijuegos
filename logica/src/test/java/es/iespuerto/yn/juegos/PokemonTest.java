package es.iespuerto.yn.juegos;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokemonTest {

    Pokemon pokemonJuego;
    Pokemon.Criatura charmander;
    Pokemon.Criatura charmeleon;
    Pokemon.Tipo fuego;
    Pokemon.Movimiento ascuas;
    @BeforeEach
    public void beforeEach(){

        if(pokemonJuego == null){

            pokemonJuego=new Pokemon(1, new Jugador("nau"));
         fuego = pokemonJuego.new Tipo("fuego");
         charmander = pokemonJuego.new Criatura("charmander", 60.0, 5.0, 5.0, 5, fuego, null);
         charmeleon = pokemonJuego.new Criatura("charmeleon", 80.0, 10.0, 10.0, 8, fuego, null);
         ascuas = pokemonJuego.new Movimiento("ascuas", 25, 60.0, fuego);
        }

    }

    @Test
    public void constructorTest(){

        Assertions.assertNotNull(pokemonJuego, "El juego no puede ser nulo");

    }
    @Test
    public void agregarPokemonSalvajeTest(){
        Assertions.assertEquals(true,
            pokemonJuego.agregarPokemonSalvaje(charmander),"No se agrego bien el pokemon Salvaje");
    }
    @Test
    public void atacarTest(){

 Assertions.assertEquals(true,
        pokemonJuego.atacar(charmander, charmeleon, ascuas),
        "La operacion de atacar no funciona correctamente");
    }
    @Test
    public void BuscarCombateTest(){
        pokemonJuego.agregarPokemonSalvaje(charmander);
    Assertions.assertSame(charmander,
        pokemonJuego.BuscarCombate(),
        "La operacion de BuscarCombate no funciona correctamente");
    }
    @Test
    public void constructorMovimientoTest(){

        Assertions.assertNotNull(ascuas, "El Movimiento no puede ser nulo");

    }
    @Test
    public void MovimientogetDanioTest(){
 Assertions.assertEquals(60.0,
        ascuas.getDanio(),
        "La operacion de getDanio no funciona correctamente");
    }

    @Test
    public void constructorCriaturaTest(){

        Assertions.assertNotNull(charmander, "La Criatura no puede ser nula");

    }

    @Test
    public void CriaturagetAtaqueTest(){
        Assertions.assertEquals(5.0,
               charmander.getAtaque(),
               "La operacion de getAtaque no funciona correctamente");
           }
    @Test
    public void CriaturagetDefensaTest(){
        Assertions.assertEquals(5.0,
            charmander.getDefensa(),
            "La operacion de getDefensa no funciona correctamente");
        }
    @Test
    public void CriaturagetVidaActualTest(){
        Assertions.assertEquals(60.0,
            charmander.getVidaActual(),
            "La operacion de getVidaActual no funciona correctamente");
        }
    @Test
    public void CriaturagetTipoTest(){
        Assertions.assertSame(fuego,
            charmander.getTipo(),
            "La operacion de getTipo no funciona correctamente");
        }
}
