package practica1;

import java.util.Scanner;

public class Ejercicio09 {
    public static  boolean esPrimo(int n){
        int contador = 0;
        for (int divisor = 1; divisor < n+1; divisor++){
            if (n % divisor == 0){
                contador++;
            }
        }
        return contador == 2;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();
        int primorial = 1;
        for (int i = 1; i <= n; i++){
            if (esPrimo(i)){
                primorial *= i;
            }
        }
        System.out.print(n + "# = " + primorial);
    }
}
