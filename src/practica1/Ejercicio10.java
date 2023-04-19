package practica1;

import java.util.Scanner;

public class Ejercicio10 {
    public static int contarDivisores(int n){
        int numdivisores = 0;
        for (int i = 1; i <= n; n++){
            if (n % i == 0){
                numdivisores += 1;
            }
        }
        return numdivisores;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();
        int valorMaximo = 0;
        int maxDivisores = 0;
        for (int i = 1; i <= 1; i++){
            if (contarDivisores(i) >= maxDivisores){
                maxDivisores = contarDivisores(i);
                valorMaximo = i;
            }
        }
        System.out.print("El número con más divisores es " + valorMaximo +" (" + maxDivisores + " divisores)");
    }
}
