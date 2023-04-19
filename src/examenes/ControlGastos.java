package examenes;

import practica3.Diccionario;

public class ControlGastos {
    private static class Nodo {
        Fecha fechaGasto;
        String códigoArtículo;
        double importe;
        Nodo siguiente;

        public Nodo(Fecha fechaGasto, String códigoArtículo, double importe, Nodo siguiente) {
            this.fechaGasto = fechaGasto;
            this.códigoArtículo = códigoArtículo;
            this.importe = importe;
            this.siguiente = siguiente;
        }

    }

    private Nodo primero;

    // Constructor por defecto

    // Resto de métodos

    public void borrarMásReciente() {//borra de la lista el nodo con la fecha de gasto más reciente
        Nodo anterior = null;
        Nodo actual = primero;
        String borrar;
        while (actual != null) {
            for (Nodo aux = primero;aux != null; aux = aux.siguiente){//Comparamos el nodo en el que nos encontramos con el resto de nodos
                if (actual.fechaGasto.compareTo(aux.fechaGasto) > 0) { //comprobamos cual es la fecha mas reciente
                    borrar = aux.códigoArtículo;
                    anterior = actual; // Avanzar anterior y actual
                    actual = actual.siguiente;
                }
                else {
                    anterior = actual; // Avanzar anterior y actual
                    actual = actual.siguiente;
                }
            }
        }
        Nodo actual1 = primero;
        Nodo anterior1 = null;
        while (actual1 != null) {//una vez tenemos el codigo del elemento que queremos borrar lo buscamos y lo borramos
            if (actual1.códigoArtículo.equals(borrar)) { // Encontrado
                // Borrar elemento
                if (anterior != null) {
                    anterior1.siguiente = actual1.siguiente;
                } else {
                    primero = actual1.siguiente;
                }

            } else {
                // Avanzar anterior y actual
                anterior1 = actual;
                actual = actual1.siguiente;
            }
        }
    }

}
