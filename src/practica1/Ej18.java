package practica1;

import java.util.Arrays;

public class Ej18 {
    public static int[] eliminarPosición(int[] v, int n) {
        if (n >= v.length || n < 0)
            return v;
        int[] aux = new int[v.length - 1];
        int iAux = 0;
        int jV = 0;
        while (jV < v.length) {
            if (jV != n) {
                aux[iAux] = v[jV];
                iAux++;
            }
            jV++;
        }
        return aux;
    }
    public static void main(String[] args) {
        int[] v = {1,-2,-3,-5,-10,5,15,16,-2,-3,-5,-10,4,2,5,-2,-3,-5,-10,1,5,6};
        int n = 3;
        int[] esperado1 = {1,-2,-3,-10,5,15,16,-2,-3,-5,-10,4,2,5,-2,-3,-5,-10,1,5,6};
        int[] v1 = {1,2,-2,-3,-5,-10,-2,-3,-5,-10,3,4,-2,-3,-5,-10,-2,-3,-5,-10,5,6,-2,-3,-5,-10,-2,-3,-5,-10,9,10};
        int numero = 7;
        int[] esperado2 = {1,2,-2,-3,-5,-10,-2,-5,-10,3,4,-2,-3,-5,-10,-2,-3,-5,-10,5,6,-2,-3,-5,-10,-2,-3,-5,-10,9,10};
        prueba(v, n, esperado1);
        prueba(v1, numero, esperado2);

    }
    private static void prueba(int[] v, int n, int[] esperado) {
        int[] resultado = eliminarPosición(v, n);
        System.out.format("Prueba ");
        if (Arrays.equals(resultado, esperado) )
            System.out.println("ok");
        else
            System.out.println("error");
    }
}
