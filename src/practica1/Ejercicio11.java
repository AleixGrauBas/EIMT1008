package practica1;

public class Ejercicio11 {
    public static void main(String[] args) {
        prueba("hola", "ola", true);
        prueba("hola", "osa", false);
        prueba("hola", "hola", true);
        prueba("hola", "", true);

    }
    private static boolean esSufijo(String s1, String s2) {
        int tamSufijo = s2.length();
        int tamPalabra = s1.length();
        int contador = 0;
        for (int i = tamPalabra - tamSufijo; i < tamSufijo; i++,contador ++) {
                if (s1.charAt(i) != s2.charAt(contador )) {
                    return false;
                }
        }
        return true;
    }
    private static void prueba(String s1, String s2, boolean esperado) {
        boolean resultado = esSufijo(s1, s2);
        System.out.format("Prueba con %s y %s: ", s1, s2);
        if (resultado == esperado)
            System.out.println("ok");
        else
            System.out.println("error");
    }
}
