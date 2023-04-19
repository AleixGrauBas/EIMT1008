package practica1;

import  java.util.Scanner;
public class Ejercicio07 {
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

        if (esPrimo(n)){
            System.out.print("Es primo");
        }
        else {
            System.out.print("No es primo");
        }

    }
}
