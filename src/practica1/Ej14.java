package practica1;

public class Ej14 {
    public static void main(String[] args) {
        int[] v = {1, 1, 2, 3, 7, 0};
        prueba(v, 5, -1);
        prueba(v, 1, 1);
        prueba(v, 3, 3);
        prueba(v, 2, 2);
        prueba(v, 7, 4);
        prueba(v, 0, 5);

    }
    private static int últimaPosición(int[] v, int filtro) {
        int posición = -1;
        for (int i=0; i<v.length; i++){
            if (v[i] == filtro)
                posición = i;
        }
        return posición;

    }
    private static void prueba(int[] v, int filtro, int esperado) {
        int resultado = últimaPosición(v, filtro);
        if (resultado == esperado) System.out.println("ok");
        else System.out.println("error");
    }
}
