package examenes;

public class Conciertos {
    private static class Nodo {
        String ciudad;
        Fecha día;
        Nodo siguiente;

        public Nodo(String ciudad, Fecha día, Nodo siguiente) {
            this.ciudad = ciudad;
            this.día = día;
            this.siguiente = siguiente;
        }

    }
    }

    private Nodo primero;

    // Constructor por defecto
    // Resto de métodos
    public Conciertos[] getDías (String ciudad){ //devuelve un objeto nuevo de tipo Conciertos con los nodos de los eventos que tendrán lugar en esa ciudad
        Nodo primero2;
        Conciertos[] conciertos = new Conciertos[0];//creamos el vector tipo Conciertos conciertos
        for (Nodo aux = primero; aux != null;aux = aux.siguiente){//recorremos el vector Conciertos hasta encontar la ciudad que se nos pide
            if (Conciertos.ciudad().equals(ciudad));{
                Conciertos[] aux2 = new Conciertos[conciertos.length +1];//un vector de longitud +1 de esta manera el vector resultado tendrá la longitud de las veces que haya coincidido
                Nodo aux3 = primero2;
                aux2 = aux3 = new Nodo(Conciertos.ciudad,Conciertos.dia,primero2);
                conciertos = aux2;
                primero = aux3.siguiente;
            }

        }
        return conciertos;
    }
    public Fecha[] getFechas(String asunto){
        Fecha[] fechas = new Fecha[0]; // creamos el vector tipo fechas fecha
        for (int i = 0; i < citas.length ; i++) {
            for (int j = 0; j < asunto.length; j++ )
                if(citas[i].getAsunto().compareTo(asunto[j]) == 0){ //si encontramos un elemnto cuyo asunto coincide creamos un vector auxiliar
                    Fecha[] aux = new Fecha[fechas.length + 1]; //un vector de longitud +1 de esta manera el vector resultado tendrá de longitud las veces que haya coincidido
                    aux[i] = citas[i].getAsunto();
                    fechas = aux;
                }
        }
        return fechas;
}
