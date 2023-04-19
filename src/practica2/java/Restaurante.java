package practica2.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Restaurante {
    //Atributos
    private String nombre;
    private Punto posición;
    private int valoración;
    //Constructor
    public Restaurante(String nombre, Punto posición, int valoración){
        this.nombre = nombre;
        this.posición = posición;
        this.valoración = valoración;
    }
    //Métodos
    public String getNombre(){
        return nombre;
    }
    public Punto getPosición(){
        return posición;
    }
    public int getValoración(){
        return valoración;
    }
    public double distancia(Punto p){
        return posición.distancia(p);
    }
    public static Restaurante[] leeRestaurantes(String nombreFichero)
        throws FileNotFoundException{
        Scanner fichero = new Scanner(new File(nombreFichero));
        Restaurante[] vector = new Restaurante[fichero.nextInt()];
        while (fichero.hasNextLine()){
            for (int i = 0; i < vector.length; i ++){
             Punto posición = new Punto(fichero.nextDouble(),fichero.nextDouble());
             int valoración = fichero.nextInt();
             String nombre = fichero.next();
             vector[i] = new Restaurante(nombre,posición,valoración);
            }
        }
        fichero.close();
        return vector;
    }
}
