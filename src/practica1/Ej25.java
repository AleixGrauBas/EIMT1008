package practica1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ej25 {
    public static void main(String[] args)
            throws FileNotFoundException {

        String[] equipos = {"Atlético_Madrid", "Real_Betis_F", "Sporting_Huelva"};
        String esperado = "Atlético_Madrid";
        String fichero = "C:\\Users\\raule\\OneDrive\\Documentos\\IdeaProjects\\EIMT1008\\src\\practica1\\resultados.txt";
        char[][] matriz = crearMatrizResultados(equipos, fichero);
        prueba(equipos, matriz, esperado);
 }
    public static String obtenerLíder(String[] equipos, char[][] matriz){
        int posicion = 0;
        int puntosMax = 0;
        for (int i = 0; i < matriz.length; i++){
            int puntos = 0;
            for (int j = 0; j < matriz[0].length; j++){
                if (matriz[i][j] == '1'){
                    puntos += 3;
                }
                if (matriz[i][j] == 'X'){
                    puntos += 1;
                }
            }
            if (puntos >= puntosMax){
                puntosMax = puntos;
                posicion = i;
            }
        }

        return equipos[posicion];
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
    public static void prueba(String[] equipos, char[][] matriz, String esperado) {
        String resultado = obtenerLíder(equipos, matriz);
        if (resultado.equals(esperado)) {
            System.out.println("ok");
        } else {
            System.out.println("error");
        }
    }
    }