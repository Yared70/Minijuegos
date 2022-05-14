package es.iespuerto.yn.juegos;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static es.iespuerto.yn.juegos.PartidaTest.ID;
import static es.iespuerto.yn.juegos.PartidaTest.JUGADOR;

public class SnakeTest {

    Snake snake;
    Snake.Personaje personaje;

    @BeforeEach
    public void beforeEach(){

        if(snake == null){

            snake = new Snake(ID, JUGADOR);


        }
        if(personaje == null) {
            personaje = snake.new Personaje();
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

        Assertions.assertTrue(!snake.habraChoque(3, 2), "ha habido choque");

        snake.personaje.addParte(snake.new Parte(3, 2));
        Assertions.assertTrue(snake.habraChoque(3, 2), "no ha habido choque");

        snake.muros.add(snake.new Muro(7, 4));
        Assertions.assertTrue(snake.habraChoque(7, 4), "no ha habido choque");

    }

    @Test
    public void encontradaComidaTest(){

        snake.setComida(snake.new Comida(4, 3));
        Assertions.assertTrue(snake.encontradaComida(4, 3), "no se ha encontrado comida");

    }

    @Test
    public void avanzarTest(){

        snake.setComida(snake.new Comida(4, 3));
        Assertions.assertTrue(snake.avanzar(), "error al avanzar la serpiente");


        snake.personaje.direccion = "UP";
        Assertions.assertTrue(snake.avanzar(), "error al avanzar la serpiente");


        snake.personaje.direccion = "LEFT";
        Assertions.assertTrue(snake.avanzar(), "error al avanzar la serpiente");


        snake.personaje.direccion = "DOWN";
        Assertions.assertTrue(snake.avanzar(), "error al avanzar la serpiente");


    }

    @Test
    public void addParteTest(){


        Assertions.assertTrue(personaje.addParte(snake.new Parte(4, 5)), "error al añadir la parte");

    }


}
