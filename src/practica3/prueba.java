package practica3;

public class prueba {
    public static void main(String[] args) {
        Diccionario prueba = new Diccionario();
        prueba.añadir("hola", 2);
        prueba.añadir("adios", 3);
        System.out.println(prueba);
        prueba.añadir("zorra", 4);
        System.out.println(prueba);
        prueba.quitar("hola", 2);
        prueba.quitar("f", 5);
        prueba.quitar("adios", 1);
        prueba.quitar("zorra", 1);
        System.out.println(prueba);
    }
}
