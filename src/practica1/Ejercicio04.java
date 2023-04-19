package practica1;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();
        int i = 0;
        int cantidad = 0;
        System.out.print("Los números primos menores que "+n+" son: ");
        while (i < n) {
            boolean esPrimo = (n==1)?false:true;
            for(int divisor = 2; divisor <= i/2 && esPrimo; divisor++) {
                if (i % divisor == 0){
                    esPrimo = false;
                }
            }
            if(esPrimo){
                System.out.print(i + " ");
                cantidad++;
            }
            i++;

        }
        if(cantidad == 0){
            System.out.print("Ninguno");
        }
    }
}