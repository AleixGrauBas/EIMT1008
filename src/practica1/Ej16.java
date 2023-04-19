package practica1;

public class Ej16 {


    public static int contarOlasDeFrío(double[] v, int n) {
        int numOlas = 0;
        int olasSeguidas = 0;
        for (int i = 0; i < v.length -1; i++) {

            if (v[i] < 0) {
                olasSeguidas++;
                if (olasSeguidas > n && v[i+1] > 0)
                    numOlas++;
            }
            else{
                olasSeguidas = 0;
            }
        }
        if (olasSeguidas > n-1 && v[v.length-1] < 0)
            numOlas++;
        return numOlas;
    }
    public static void main(String[] args) {
        double[] v = {1,-2,-3,-5,-10,5,15,16,-2,-3,-5,-10,4,2,5,-2,-3,-5,-10,1,5,6};
        int n = 3;
        double[] v1 = {1,2,-2,-3,-5,-10,-2,-3,-5,-10,3,4,-2,-3,-5,-10,-2,-3,-5,-10,5,6,-2,-3,-5,-10,-2,-3,-5,-10,9,10};
        int numero = 7;
        prueba(v, n, 3);
        prueba(v1, numero, 3);

    }
    private static void prueba(double[] v, int n, int esperado) {
        int resultado = contarOlasDeFrío(v, n);
        System.out.format("Prueba ");
        if (resultado == esperado)
            System.out.println("ok");
        else
            System.out.println("error");
    }
}