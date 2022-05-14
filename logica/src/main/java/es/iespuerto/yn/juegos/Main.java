/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuerto.yn.juegos;

import es.iespuerto.yn.juegos.Pokemon.Criatura;
import es.iespuerto.yn.juegos.Pokemon.Tipo;

/**
 *
 * @author daw
 */
public class Main {
    
    public static void main(String[] args) {
        
        Pokemon pokemonJuego=new Pokemon(1, new Jugador("nau"));
        Tipo fuego = pokemonJuego.new Tipo("fuego");
        Criatura charmander = pokemonJuego.new Criatura("charmander", 5.0, 5.0, 5.0, 5, fuego, null);
        pokemonJuego.agregarPokemonSalvaje(charmander);
        
    }
    
}

