package es.iespuerto.yn.juegos;

import java.util.*;

public class Ahorcado extends Partida{


    public String palabraSecreta;
    public int errores;
    public boolean victoria;
    private ArrayList<String> historialLetras;
    public final String[] palabras = {
        "prueba", "gato", "murcie"
        + "lago", "caballero", "esternocleidomastoideo", "perro", "frances", 
        "canario", "telefono", "ordenador", "compilar", "televisor", "aguacate",
        "guatemala", "hamburguesa"
    };//poner palabras en el String

    /**
     * Constructor base
     */
    public Ahorcado(Integer id, Jugador jugador) {
        super(id, jugador);
        this.errores = 0;
        this.victoria = false;
        generarPalabraSecreta();
        historialLetras = new ArrayList<>();

    }

    /**
     * Metodo que suma 1 a los errores al introducir un caracter
     *
     * @param letra
     */
    public boolean aumentarErrorLetra(String letra) {

        boolean metodoOK = false;
        addLetra(letra);
        if (!palabraSecreta.contains(letra)) {
            this.errores += 1;
            metodoOK = true;
        } else {
            metodoOK = true;
            compararOcultarPalabra();
        }
        return metodoOK;
    }

    /**
     * Método que suma 1 a los errores al introducir una palabra completa
     *
     * @param palabra
     */
    public void aumentarErrorPalabra(String palabra) {
        if (!palabraSecreta.equals(palabra)) {
            this.errores += 1;
        } else {
            addLetra(palabra);
            compararOcultarPalabra();
        }
    }

    /**
     * Metodo que agrega cadenas de texto
     *
     * @param letra devueve letras
     */
    public void addLetra(String letra) {
        historialLetras.add(letra);
    }

    /**
     * Metodo que dependiendo de la palabra secreta genera los guiones necesario
     * y genera un array de String en el que esta la palabra secreta separada en
     * caracteres
     *
     * @return devuelve guiones por cada char de la palabra a adivinar
     */
    public String compararOcultarPalabra() {
        String palabra = this.palabraSecreta;
        String letraselegidas = "";
        for (int i = 0; i < historialLetras.size(); i++) {
            letraselegidas += historialLetras.get(i);
        }
        String palabraconguiones = palabra.replaceAll("[^ " + letraselegidas + "]", "_ ");

        return palabraconguiones;
    }

    /**
     * Metodo que elige una palabra aleatoriamente del String
     */
    public void generarPalabraSecreta() {
        this.palabraSecreta = this.palabras[(int) ((Math.random() * this.palabras.length))];
    }

    public String getHistorialLetras() {
        String letrasStr = "";

        for (String Letra : historialLetras) {
            letrasStr += Letra;
        }
        String historialStr = "";

        if (letrasStr.length() > 0) {
            for (int i = 0; i < letrasStr.length(); i++) {
                historialStr += letrasStr.charAt(i) + ",";
            }
        }

        return historialStr;
    }


}
       
    


