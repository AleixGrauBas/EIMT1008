package practica1;

public class Ej21 {
    public static int posiciónInserción(int[] v, int n){
        int posInsertar = 0;
        boolean encontrado = false;
        for (int i = 0; i < v.length; i++){
            if (encontrado == false) {
                if (v[i] >= n) {
                    posInsertar = i;
                    encontrado = true;
                }
            }
        }
        return posInsertar;
    }
    public static void main(String[] args) {
        int[] v = {1,2,4,5,6};
        int n = 3;
        int[] v1 = {1,2,3,4,5,6,9,10};
        int numero = 7;
        prueba(v, n, 2);
        prueba(v1, numero, 6);

    }
    private static void prueba(int[] v, int n, int esperado) {
        int resultado = posiciónInserción(v, n);
        System.out.format("Prueba ");
        if (resultado == esperado)
            System.out.println("ok");
        else
            System.out.println("error");
    }




}
