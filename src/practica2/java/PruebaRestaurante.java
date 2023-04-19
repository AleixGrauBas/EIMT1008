package practica2.java;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class PruebaRestaurante {
    public static void main(String[] args) throws FileNotFoundException {
        Restaurante restaurante = new Restaurante("pepe", new Punto(0, 0), 8);
        System.out.println(restaurante.getNombre());
        System.out.println(restaurante.getPosición());
        System.out.println(restaurante.getValoración());
        Restaurante[] vector = Restaurante.leeRestaurantes("/home/al394752/IdeaProjects/EIMT1008/src/practica2/restaurantes.txt");
        System.out.print(Arrays.toString(vector));
    }
}