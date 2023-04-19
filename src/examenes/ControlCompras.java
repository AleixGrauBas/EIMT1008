package examenes;

public class ControlCompras {

    private static class Nodo {
        Fecha fechaCompra;
        String códigoArtículo;
        int unidades;
        Nodo siguiente;

        public Nodo(Fecha fechaCompra, String códigoArtículo, int unidades, Nodo siguiente) {

            this.fechaCompra = fechaCompra;

            this.códigoArtículo = códigoArtículo;

            this.unidades = unidades;

            this.siguiente = siguiente;

        }

    }

    private Nodo primero;

    // Constructor por defecto

    // Resto de métodos

    public int borrarArticulos(String[] artículos){ //metodo que devuelve la cantidad de unidades que se han borrado
        int totalUnidades = 0;
        if(primero == null)
            return 0;
        Nodo actual = primero;
        Nodo anterior = null;
        while (actual != null){
            anterior = actual;
            for (int i = 0; i < artículos.lenght; i++){
                if (actual.códigoArtículo.equals(artículos[i])){ //comprobamos toda la lista de nodos para comprobar si coincide con alguna cadena de asuntos
                    totalUnidades += actual.unidades; //si coincide sumamos las unidades borradas al total
                    anterior.siguiente = actual.siguiente; //y pasamos al siguiente nodo dde la lista
                }
                else {
                    anterior = actual;
                }
                actual = actual.siguiente;
            }
        }
        return totalUnidades;
    }

}
