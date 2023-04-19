package practica1;

public class pruebaRectangulo {
    Rectángulo a = new Rectángulo(4,5);
    Rectángulo b = new Rectángulo(4,5);
    Rectángulo c = new Rectángulo(2,5);
    Rectángulo d = new Rectángulo(5,5);
    Rectángulo[] rectangulos = {a,b,c,d};
    Rectángulo resultado = Rectángulo.mayorÁrea(rectangulos);
}
