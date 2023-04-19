package examenes;

public class Libreria {
    private Librería[] libros;
    private int cantidad;
    public int cantidadLibrosNoComunes(Librería otraLibrería){//recorremos los vectores de ambos objetos y si no encontramos el objeto sumamos 1
        int Nocomunes = 0;
        for (int i = 0; i < cantidad; i++){
            boolean noesta = true;
            for (int j = 0; j < otraLibrería.cantidad; j++){
                if (libros[i].getISBN() == otraLibrería.libros[j].getISBN){
                    noesta = false;
                }
            }
            if (noesta){
                Nocomunes++;
            }
        }
        return Nocomunes;
    }
}
