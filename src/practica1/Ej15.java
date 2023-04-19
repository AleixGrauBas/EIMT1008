package practica1;

import java.util.Arrays;

public class Ej15 {
    public static void main(String[] args) {
        String[] v1 = {"CCCC", "AAAA", "ZZZZ"};
        String[] v = {"AAAAA", "BBBBB", "ZZZZZ"};
        prueba(v, true);
        prueba(v1, false);


    }
    private static boolean estáOrdenado(String[] v) {
        for (int i=0; i<v.length - 1; i++){
            if ( v[i].compareTo(v[i +1]) < 0){
                return false;
            }
        }
        return true;

    }
    private static void prueba(String[] v, boolean esperado) {
        boolean resultado = estáOrdenado(v);
        if (resultado == esperado) System.out.println("ok");
        else System.out.println("error");
    }
}
