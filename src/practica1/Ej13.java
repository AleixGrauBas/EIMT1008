package practica1;

public class Ej13 {
    public static void main(String[] args) {

        System.out.println(obtenerPalabra("hol que haces", 2));
    }

    public static String obtenerPalabra(String cadena, int palabra) {
        int palabras = 0;
        int inicio= 0;
        int fin= cadena.length();
        boolean finPalabra = false;
        for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) != ' ' && (i == 0 || cadena.charAt(i - 1) == ' ')) {
                palabras++;
                if (palabras == palabra) {
                    inicio = i;
                }
            }
            if (palabras == palabra && cadena.charAt(i)==' ' && finPalabra== false) {
                fin = i;
                finPalabra=true;

            }
        }
        return cadena.substring(inicio, fin);
    }
}