package practica1;

public class Ejercicio12 {
    public static int contarPalabras(String cadena){
        int palabras = 0;
        for (int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) !=  ' ' && (i == 0 || cadena.charAt(i -1) == ' ')){
                palabras++;
            }
        }
        return palabras;
    }

    public static void main(String[] args) {
        prueba("hola como estas",  3);
        prueba("dime frases",  2);
        prueba("o entregamos el mio", 4);
        prueba("                 hola                     mundo", 2) ;

    }
    private static void prueba(String s1, int esperado) {
        int resultado = contarPalabras(s1);
        System.out.format("Prueba con %s y %d: ", s1, esperado);
        if (resultado == esperado)
            System.out.println("ok");
        else
            System.out.println("error");
    }




}


