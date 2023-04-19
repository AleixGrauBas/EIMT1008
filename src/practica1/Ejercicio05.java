package practica1;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();
        int i = 1;
        int primorial = 1;
        while (i <= n) {
            boolean esPrimo = (n==1)?false:true;
            for(int divisor = 2; divisor <= i/2 && esPrimo; divisor++) {
                if (i % divisor == 0){
                    esPrimo = false;
                }
            }
            if(esPrimo){
                primorial *= i;
            }
            i++;

        }
        System.out.print(n + "# = "+primorial);

    }
}
