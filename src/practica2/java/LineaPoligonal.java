package practica2.java;

public class LineaPoligonal {
    //Atributos
    private Punto[] vector;
    private int cantidadSegmentos;
    private int talla;

    //Constructores

    public LineaPoligonal() {
        cantidadSegmentos = 0;
        talla = 8;
        vector = new Punto[talla];
    }
    public void añadir(Punto punto) {
        if (cantidadSegmentos == talla) {
            talla *= 2;
            Punto[] aux = new Punto[talla];
            for (int i = 0; i < talla / 2; i++) {
                aux[i] = vector[i];
            }
            vector = aux;
        }
        vector[cantidadSegmentos] = punto;
        cantidadSegmentos++;
    }
    public void quitar(int posición){
        if (posición >= vector.length || posición < 0){
            for (int i=posición; i< talla; i++){
                vector[i] = vector[i+1];
            }
        }
    }
    public void quitar(Punto punto){
        for (int i = 0; i < talla; i++){
            if (vector[i].equals(punto)){
                quitar(i);
            }
        }
    }
    public void trasladar(double desplazamientoX, double desplazamientoY){
        for (int i = 0; i < cantidadSegmentos; i++){
            vector[i].desplazar(desplazamientoX, desplazamientoY);
        }
    }
    public double longitud(){
        double longitud = 0;
        if(cantidadSegmentos > 1){
            for (int i = 0; i < cantidadSegmentos -1; i++){
                longitud += vector[i].distancia(vector[i + 1]);
            }
        }
        return longitud;
    }
    public String toString() {
        String cadena = "";
        for (int i = 0; i < cantidadSegmentos; i++) {
            cadena += "(" + vector[i].getX() + " " + vector[i].getY() + ")--";
        }
        cadena += "(" + vector[cantidadSegmentos].getX() + " " + vector[cantidadSegmentos].getY() + ")";
        return cadena;
    }
    public boolean equals(Object otroObjeto) {
        if (this == otroObjeto)
            return true;
        if (!(otroObjeto instanceof LineaPoligonal))
            return false;
        LineaPoligonal otraLinea = (LineaPoligonal) otroObjeto;
        for (int i = 0; i < cantidadSegmentos; i++) {
            if (!vector[i].equals(otraLinea.vector[i]))
                return false;
        }
        return true;
    }
    public LineaPoligonal unir(LineaPoligonal otraLinea){
        LineaPoligonal aux = new LineaPoligonal();
        for (int i = 0; i < vector.length; i++){
            aux.añadir(vector[i]);
        }
        for (int i = 0; i < otraLinea.longitud();i++){
            aux.añadir(otraLinea.vector[i]);
        }
        return aux;
    }
}
