package practica1;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();
        long dobleFactorial = 1;
        if(n == 0 || n== 1){
            dobleFactorial = 1;
        }
        else{
            if(n % 2 == 0){
                for(int i = 2;i <= n; i+=2 ){
                    dobleFactorial *= i;
                }
            }
            if(n % 2 != 0){
                for(int i = 1;i <= n; i += 2){
                    dobleFactorial *= i;

                }
            }
        }
        System.out.print(n +"!! = "+dobleFactorial);

    }
}