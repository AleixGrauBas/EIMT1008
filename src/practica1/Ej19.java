package practica1;

import java.util.Arrays;

public class Ej19 {

    public static int[] eliminarValor(int[] v, int n) {
        int contador=0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == n)
               contador++;
        }
        int[] aux = new int[v.length-contador ];
        int j=0;
        for (int i=0; i<v.length; i++){
            if (v[i] != n){
                aux[j]=v[i];
                j++;
            }
        }
        return aux;
    }
    public static void main(String[] args) {
        int[] v = {1,2,3,4,5,6,7,2,6};
        int n = 6;
        int[] esperado1 = {1,2,3,4,5,7,2};
        int[] v1 = {1,2,3,7,7,7,7,4,5,6};
        int numero = 7;
        int[] esperado2 = {1,2,3,4,5,6};
        prueba(v, n, esperado1);
        prueba(v1, numero, esperado2);

    }
    private static void prueba(int[] v, int n, int[] esperado) {
        int[] resultado = eliminarValor(v, n);
        System.out.format("Prueba ");
        if (Arrays.equals(resultado, esperado) )
            System.out.println("ok");
        else
            System.out.println("error");
    }
}
