package practica1;

import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();
        int factorial = 1;
        for(int i = 1; i <= n; ++i){
        factorial *= i;
        }
        System.out.print(n +"! = "+factorial);

    }
}
// El error es debido a que int no puede soportar valores números tan grandes