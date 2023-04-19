package practica1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ej24 {
    public static void main(String[] args)
            throws FileNotFoundException {

        String[] equipos = {"Atlético_Madrid", "Real_Betis_F", "Sporting_Huelva"};
        int esperado = 2;
        prueba(equipos, "C:\\Users\\raule\\OneDrive\\Documentos\\IdeaProjects\\EIMT1008\\src\\practica1\\resultados.txt", esperado);
    }
    public static char[][] crearMatrizResultados(String[] equipos, String fichero)
            throws FileNotFoundException {
        char[][] matriz = new char[equipos.length][equipos.length];
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                matriz[i][j] = '-';
                Scanner ficheroTexto = new Scanner(new File(fichero));
                while (ficheroTexto.hasNextLine()) {
                    String nombreLocal = ficheroTexto.next();
                    int golesLocal = ficheroTexto.nextInt();
                    String nombreVisitante = ficheroTexto.next();
                    int golesVisitante = ficheroTexto.nextInt();
                    int posLocal = -1;
                    int posVisitante = -1;
                    for (int k=0; k<equipos.length; k++){
                        if (equipos[k].equals(nombreLocal)) {
                            posLocal = k;
                        }
                        if (equipos[k].equals(nombreVisitante)){
                            posVisitante = k;
                        }
                    }
                    if (golesLocal < golesVisitante){
                        matriz[posLocal][posVisitante] = '2';
                    }
                    if (golesLocal > golesVisitante){
                        matriz[posLocal][posVisitante] = '1';
                    }
                    if (golesLocal == golesVisitante){
                        matriz[posLocal][posVisitante] = 'X';
                    }
                }
                ficheroTexto.close();
            }
        }
        return matriz;
    }

    public static int sinDerrotasEnCasa(char[][] matriz){
        int invicto = 0;
        boolean sigueInvicto = true;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                if (matriz[i][j] == '2'){
                    sigueInvicto = false;
                }
            }
            if (sigueInvicto)
                invicto++;
        }
        return invicto;
    }
    public static void prueba(String[] equipos, String fichero, int esperado)
            throws FileNotFoundException {
        char[][] matriz = crearMatrizResultados(equipos, fichero);
        int resultado = sinDerrotasEnCasa(matriz);
        if (resultado == esperado){
            System.out.println("ok");
        }
        else{
            System.out.println("error");
        }
    }


}