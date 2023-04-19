package practica2.java;

public class PruebaPunto {
    public static void main(String[] args) {
        Punto punto = new Punto(5,7);
        System.out.println(punto);
        System.out.println(punto.desplazar(1,1));
        System.out.println(punto.distancia(punto.desplazar(1,1)));
        System.out.println(punto.equals(punto.desplazar(1,1)));
    }

}
