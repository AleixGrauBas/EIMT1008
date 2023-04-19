package practica3;

public class Diccionario {
    private static class Nodo {
        String dato;
        int cantidad;
        Nodo sig;

        //Constructor
        Nodo(String dato, int cantidad, Nodo sig) {
            this.dato = dato;
            this.cantidad = cantidad;
            this.sig = sig;
        }

        //Metodos
        public String toString() {
            return dato + "-->" + cantidad;
        }
    }
    private Nodo primero;
    private int talla;

    public void añadir(String unaCadena, int unaCantidad) {
        for(Nodo aux= primero; aux != null; aux = aux.sig)
            if (aux.dato.equals(unaCadena))
                aux.cantidad+=unaCantidad;
        Nodo atrás = null;
        Nodo actual;
        for (actual = primero; actual != null && actual.dato.compareTo(unaCadena) < 0; actual = actual.sig)
            atrás = actual;
        if (actual == null || !actual.dato.equals(unaCadena)) {
            Nodo nuevo = new Nodo(unaCadena, unaCantidad, actual);
            if (atrás != null)
                atrás.sig = nuevo;
            else
                primero = nuevo;
            talla++;
        }


    }
    public String cadenaConMayorCantidad(){
        String ganador = null;
        int mayor = 0;
        for (Nodo aux = primero; aux != null; aux = aux.sig){
            if (aux.cantidad >= mayor){
                mayor = aux.cantidad;
                ganador = aux.dato;
            }
        }
        return ganador;
    }

    public int cantidad(String unaCadena){
        int elElegido = 0;
        for (Nodo aux = primero; aux != null; aux = aux.sig){
            if (aux.dato.equals(unaCadena)){
                elElegido = aux.cantidad;
            }
        }
        return elElegido;
    }
    public String toString() {
        if (primero == null) {
            return "{}";
        } else {
            String resultado = "{" + primero.toString();
            for (Nodo aux = primero.sig; aux != null; aux = aux.sig) {
                resultado += ", " + aux.toString();
            }
            return resultado + "}";
        }
    }
    public void quitar(String unaCadena, int unaCantidad) {
        Nodo atrás = null;
        Nodo actual;
        for (actual = primero; actual != null && actual.dato.compareTo(unaCadena) < 0; actual = actual.sig)
            atrás = actual;
        if (actual == null || !actual.dato.equals(unaCadena)) {
            actual.cantidad = actual.cantidad - unaCantidad;
            if (actual.cantidad < 0) {
                if (atrás != null)
                    atrás.sig = actual.sig;
                else
                    primero = actual.sig;
                talla--;
            }
        }
    }

}