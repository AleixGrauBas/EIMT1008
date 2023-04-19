package practica1;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();
        int valorMaximo = 0;
        int maxDivisores = 0;
        for(int i = 1; i <= n; i++){
            int divisores = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    divisores++;
                }
            }
            if(divisores >= maxDivisores ){
                maxDivisores = divisores;
                valorMaximo = i;
            }
        }
        System.out.print("El número con más divisores es "+valorMaximo+" ("+maxDivisores+" divisores)");
    }
}
