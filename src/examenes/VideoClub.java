package examenes;

import practica3.Diccionario;

public class VideoClub {
    private static class Nodo {
        Pelicula película;
        int numCopias;
        Nodo siguiente;

        public Nodo(Pelicula película, int numCopias, Nodo siguiente) {
            this.película = película;
            this.numCopias = numCopias;
            this.siguiente = siguiente;
        }
    }

    public Nodo primero;

    // Constructor por defecto

    // Resto de métodos
    public boolean añadir(Pelicula película, int numCopias) { // metodo que añade a la lista una pelicula y la cantidad de copias de esta.
        // Si la pelicula ya esta en la lista se actualiza la cantidad y se devuelve false
        // Si la pelicula no esta en la lista se añade otro nodo a la lista y se devuelve true
        if (primero == null) // Si la lista esta vacía creamos una con la pelicula pasada
            primero = new Nodo(película, numCopias, null);
        return true;
        Nodo anterior = null;
        for (Nodo aux = primero; aux != null; aux = aux.sig) //Recorremos la lista para ver si esta la pelicula
            if (aux.película.equals(película)) {
                aux.numCopias += numCopias;
                return false;
            }
        }
        // Si no se ha encontrado la pelicula la añadimos a la lista
        Nodo nuevo = new Nodo(película, numCopias, primero);
        primero = nuevo;
        return true;
    }
}
