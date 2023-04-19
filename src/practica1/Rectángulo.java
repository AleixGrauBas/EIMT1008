package practica1;

public class Rectángulo {
    private int x,y;
    private int anchura, altura;

    public Rectángulo(int x,int y, int anchura, int altura){
        this.x = x;
        this.y = y;
        this.anchura = anchura;
        this.altura = altura;
    }
    public Rectángulo(int anchura, int altura){
        this(0, 0, anchura, altura);
    }
    public double área(){
        return altura * anchura;
    }
    public static Rectángulo mayorÁrea(Rectángulo[] rectangulos){
        double áreaMax = -1;
        int posMax = 0;
        for (int i = 0; i < rectangulos.length; i++){
            if (rectangulos[i].área() >= áreaMax){
                áreaMax = rectangulos[i].área();
                posMax = i;
            }
        }
        return rectangulos[posMax];
    }
}
