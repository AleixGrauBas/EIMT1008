package practica1;

import java.util.Scanner;

public class Ejercicio08 {
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
        int limite = sc.nextInt();
        System.out.print("Los números primos menores que "+ limite +" son: ");
        for (int num = 1; num < limite ; num++){
            if (esPrimo(num)){
                System.out.print(num + " ");
            }
        }
    }
}
