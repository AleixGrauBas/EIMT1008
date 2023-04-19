package examenes;
import
public class Agenda {
    public class Cita {
        private Fecha fecha;
        private String asunto;

        public Fecha getFecha() {
            return fecha;
        }

        public String getAsunto() {
            return asunto;
        }
    }
    public Fecha[] getFechas (String asunto){ //Devuelve un vector ded tipo fecha de todas las fechas del asunto indicado
        int longitudVeector = 1;
        Fecha[] vectorFechas;
        for (int i =0; i < asunto.length; i++){
            for (int j = 0; j < citas.length; j++){ //recorremos el vector citas para comprobar si se encontra la cita con el asunto
                if (asunto[i].equals(citas[j].getAsunto())){
                    if (longitudVeector == 0){
                        Fecha[] aux = cita[j];
                        vectorFechas = aux;
                    }
                    else{
                        longitudVeector += 1;
                        redimensionar(vectorFechas,longitudVeector);
                        vectorFechas[vectorFechas.length -1] = cita[j];
                    }

                }
            }
        }
        return vectorFechas;
    }
    public static Fecha[] redimensionar(Fecha[] vector, int nuevaLongitud) { //Clase proporcionada en los ejemplos del aulavirtual modificada para Fecha
        Fecha[] nuevoVector = new String[nuevaLongitud];
        int longitudMínima = vector.length < nuevaLongitud ? vector.length : nuevaLongitud;
        for (int i = 0; i < longitudMínima; i++)
            nuevoVector[i] = vector[i];
        return nuevoVector;
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
}
