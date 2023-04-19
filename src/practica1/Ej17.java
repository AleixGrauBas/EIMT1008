package practica1;

public class Ej17 {

    public static boolean hayRepetidos(int[] v){
        int j=0;
        for (int i=0; i<v.length -1; i++){
            j= i+1;
            while (j<v.length){
                if (v[i] == v[j])
                    return true;
                else
                    j++;

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] v = {1,2,3,4,5,6,7,8,9};
        int[] v1 = {1,2,-2,-3,-5,-10,-2,-3,-5,-10,3,4,-2,-3,-5,-10,-2,-3,-5,-10,5,6,-2,-3,-5,-10,-2,-3,-5,-10,9,10};
        prueba(v,  false);
        prueba(v1, true);

    }
    private static void prueba(int[] v, boolean esperado) {
        boolean resultado = hayRepetidos(v);
        System.out.format("Prueba ");
        if (resultado == esperado)
            System.out.println("ok");
        else
            System.out.println("error");
    }
}
