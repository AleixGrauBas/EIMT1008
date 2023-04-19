package practica1;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();
        boolean esPrimo = (n==1)?false:true;
        for(int divisor = 2; divisor <= n/2 && esPrimo; divisor++) {
            if (n % divisor == 0){
                esPrimo = false;
            }
        }
        if(esPrimo){
            System.out.print("Es primo");
        }
        else{
            System.out.println("No es primo");
        }
    }
}
