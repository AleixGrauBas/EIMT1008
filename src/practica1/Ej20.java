package practica1;

import java.util.Arrays;

public class Ej20 {
    public static boolean contiene(int[] v, int n){
        boolean contiene = false;
        for (int i = 0; i < v.length; i++){
            if (v[i] == n){
                contiene = true;
            }

        }
        return contiene;
    }
    public static boolean contiene(int[] v, int[] v1){
        boolean contiene = false;
        int contador = 0;
        for (int i = 0; i < v1.length; i++){
            for (int j = 0; j < v.length; j++){
                if (v1[i] == v[j]){
                    contador ++;
                }
            }
        }
        return contador == v1.length;
    }
    public static void main(String[] args) {
        int[] v = {1,2,3,4,5,6};
        int n = 3;
        int[] v1 = {1,2,3,4,5,6};
        int numero = 7;
        prueba(v, n, true);
        prueba(v1, numero, false);

    }
    private static void prueba(int[] v, int n, boolean esperado) {
        boolean resultado = contiene(v, n);
        System.out.format("Prueba ");
        if (resultado == esperado)
            System.out.println("ok");
        else
            System.out.println("error");
    }

}
