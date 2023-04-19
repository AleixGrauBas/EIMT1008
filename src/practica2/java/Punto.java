package practica2.java;

public class Punto {
    //Atributos
    private double x;
    private double y;
    //Constructores
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Punto(){
        x = 0;
        y = 0;
    }
    //Métodos
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public Punto desplazar(double desplazamientoX, double desplazamientoY){
        Punto nuevo = new Punto(x + desplazamientoX, y +desplazamientoY);
        return nuevo;
    }
    public double distancia(Punto otroPunto){
        return Math.sqrt(Math.pow(x - otroPunto.x,2) + Math.pow(y - otroPunto.y,2));
    }
    public String toString(){
        return "("+x+", "+y+")";
    }
    public boolean equals(Object otroObjeto){
        if (this == otroObjeto){
            return true;
        }
        if (!(otroObjeto instanceof Punto)){
            return false;
        }
        Punto otroPunto = (Punto) otroObjeto;
        if (x == otroPunto.x && y == otroPunto.y){
            return true;
        }
        else {
            return false;
        }
    }
}
