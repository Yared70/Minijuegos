package es.iespuerto.yn.juegos;

import java.util.*;

public class Snake extends Partida {


    String mapaMatriz[][];
    Comida comida;
    ArrayList<Muro> muros;
    Personaje personaje;
    int cantidadMuros;
    boolean perdido;
    int cantidadComidas;

    public Snake(Integer id, Jugador jugador) {
        super(id, jugador);

        this.mapaMatriz = new String[50][50];
        this.muros = new ArrayList<Muro>();
        this.comida = null;
        this.personaje = new Personaje();
        this.cantidadMuros = 0;
        this.perdido = false;
        this.cantidadComidas = 0;

    }

    Random rnd = new Random();

    public void addComida() {

        setComida(null);

        int x = rnd.nextInt(mapaMatriz.length - 1) + 1;
        int y = rnd.nextInt(mapaMatriz.length - 1) + 1;

        this.comida = new Comida(x, y);
        boolean colocado = false;
        while (!colocado) {

            if (isOcupado(x, y)) {
                x = rnd.nextInt(mapaMatriz.length - 1) + 1;
                y = rnd.nextInt(mapaMatriz.length - 1) + 1;
            } else {
                colocado = true;

            }
        }

    }

    public void addMuro() {

        if (cantidadMuros <= 40 && cantidadComidas == 3) {
            int murosPuestos = 0;
            while (murosPuestos < 3) {

                int size = rnd.nextInt(5) + 5;
                int direccion = rnd.nextInt(4);
                int x = 0;
                int y = 0;
                boolean colocado = false;

                switch (direccion) {
                    case 0:

                        x = rnd.nextInt(mapaMatriz.length - 4) + 2;
                        y = rnd.nextInt(mapaMatriz.length - 4) + 2;
                        while (!colocado) {

                            for (int i = 0; i < size; i++) {
                                if (!isOcupado(x, y - i) && y > 0) {

                                    muros.add(new Muro(x, y - i));

                                }

                            }
                            colocado = true;
                        }

                        break;
                    case 1:

                        x = rnd.nextInt(mapaMatriz.length - 4) + 2;
                        y = rnd.nextInt(mapaMatriz.length - 4) + 2;
                        while (!colocado) {

                            for (int i = 0; i < size; i++) {
                                if (!isOcupado(x + i, y) && y > mapaMatriz.length) {

                                    muros.add(new Muro(x + i, y));

                                }

                            }
                            colocado = true;
                        }

                        break;
                    case 2:

                        x = rnd.nextInt(mapaMatriz.length - 4) + 2;
                        y = rnd.nextInt(mapaMatriz.length - 4) + 2;
                        while (!colocado) {

                            for (int i = 0; i < size; i++) {
                                if (!isOcupado(x, y + i) && y > mapaMatriz.length) {

                                    muros.add(new Muro(x, y + i));

                                }

                            }
                            colocado = true;
                        }

                        break;
                    case 3:

                        x = rnd.nextInt(mapaMatriz.length - 4) + 2;
                        y = rnd.nextInt(mapaMatriz.length - 4) + 2;
                        while (!colocado) {

                            for (int i = 0; i < size; i++) {
                                if (!isOcupado(x - i, y) && x > 0) {

                                    muros.add(new Muro(x - i, y));

                                }

                            }
                            colocado = true;
                        }

                        break;

                }
                this.cantidadMuros += 1;
                cantidadComidas = 0;
                murosPuestos += 1;
            }
        }

    }

    public boolean isOcupado(int x, int y) {

        boolean ocupado = false;
        if (comida.getX() == x && comida.getY() == y) {
            return true;
        }
        for (Muro muro : muros) {
            if (muro.getX() == x && muro.getY() == y) {
                return true;
            }
        }
        for (Parte parte : personaje.getPersonaje()) {
            if (parte.getX() == x && parte.getY() == y) {
                return true;
            }
        }
        return ocupado;
    }

    public boolean habraChoque(int x, int y) {

        boolean choque = false;

        for (int i = personaje.getPersonaje().size() - 1; i >= 1; i--) {

            if (personaje.getPersonaje().get(i).getX() == x
                    && personaje.getPersonaje().get(i).getY() == y) {
                choque = true;
            }

        }

        for (Muro muro : muros) {
            if (muro.getX() == x && muro.getY() == y) {
                choque = true;
            }
        }

        return choque;

    }

    public boolean encontradaComida(int x, int y) {

        boolean comidaEncontrada = false;

        if (comida.getX() == x && comida.getY() == y) {
            comidaEncontrada = true;
            cantidadComidas += 1;
            addMuro();
            addMuro();
        }

        return comidaEncontrada;

    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public void avanzar() {

        Parte cabeza = this.personaje.getPersonaje().getFirst();
        int xCabeza = cabeza.getX();
        int yCabeza = cabeza.getY();

        Parte cola = this.personaje.getPersonaje().getLast();

        int tamanoSnake = this.personaje.getPersonaje().size();
        LinkedList<Parte> snakeCompleta = this.personaje.getPersonaje();

        for (int i = tamanoSnake - 1; i >= 1; i--) {
            snakeCompleta.get(i).setX(snakeCompleta.get(i - 1).getX());
            snakeCompleta.get(i).setY(snakeCompleta.get(i - 1).getY());

        }

        switch (this.personaje.getDireccion()) {
            case "UP":
                this.personaje.getPersonaje().getFirst().setY(yCabeza - 1);
                this.personaje.setDireccion("UP");
                if (yCabeza < 1) {

                    cabeza.setY(mapaMatriz.length - 1);

                }
                if (encontradaComida(xCabeza, yCabeza)) {

                    this.personaje.addParte(new Parte(cola.getX(), cola.getY() + 1));
                    addComida();

                }
                break;

            case "DOWN":
                this.personaje.getPersonaje().getFirst().setY(yCabeza + 1);
                this.personaje.setDireccion("DOWN");

                if (yCabeza > mapaMatriz.length - 1) {

                    cabeza.setY(1);

                }
                if (encontradaComida(xCabeza, yCabeza)) {

                    this.personaje.addParte(new Parte(cola.getX(), cola.getY() - 1));
                    addComida();

                }

                break;

            case "RIGHT":
                this.personaje.getPersonaje().getFirst().setX(xCabeza + 1);
                this.personaje.setDireccion("RIGHT");

                if (xCabeza > mapaMatriz.length - 1) {

                    cabeza.setX(1);

                }
                if (encontradaComida(xCabeza, yCabeza)) {

                    this.personaje.addParte(new Parte(cola.getX() - 1, cola.getY()));
                    addComida();
                }

                break;

            case "LEFT":
                this.personaje.getPersonaje().getFirst().setX(xCabeza - 1);
                this.personaje.setDireccion("LEFT");

                if (xCabeza < 1) {

                    cabeza.setX(mapaMatriz.length - 1);

                }
                if (encontradaComida(xCabeza, yCabeza)) {

                    this.personaje.addParte(new Parte(cola.getX() + 1, cola.getY()));
                    addComida();
                }

                break;
        }

        cabeza = this.personaje.getPersonaje().getFirst();

        if (habraChoque(cabeza.getX(), cabeza.getY())) {

            perdido = true;

        }


    }

    class Personaje {

        private LinkedList<Parte> personaje;
        String direccion;

        public Personaje() {

            this.personaje = new LinkedList<Parte>();
            this.direccion = "RIGHT";
            personaje.add(new Parte(30, 30));
            personaje.add(new Parte(31, 30));

        }

        public void addParte(Parte parte) {

            personaje.addLast(parte);

        }

        public LinkedList<Parte> getPersonaje() {
            return personaje;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
    }

    class Parte {

        int x;
        int y;

        public Parte(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {

            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }


    }

    class Muro {

        int x;
        int y;
        int size;

        public Muro(int x, int y) {
            this.x = x;
            this.y = y;
            this.size = 0;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }


    }


    class Comida {

        int x;
        int y;

        public Comida(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }


    }


}



