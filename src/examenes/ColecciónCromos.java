package examenes;

public class ColecciónCromos {
    public int getCantidad(String código){
        int inicio = 0;
        int fin = n - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (v[medio].getCódigo().compareTo(código) < 0)
                inicio = medio + 1;
            else if (v[medio].getCódigo().compareTo(código) > 0)
                fin = medio - 1;
            else
                return v[medio].getCantidad();
        }
        return -1;
    }
    public int getCantidad(String código){
        int inicio = 0;
        int fin = n -1; // de esta manera solo veremos los elementos del vector que realmente se usan
        while (inicio <= fin){ // búsqueda binaria para que el coste en el peor de los casos de la solución sea O(log n), siendo n la cantidad de cromos almacenados en la colección
            int medio = (inicio + fin) / 2;
            if (v[medio].getCódigo().compareTo(código) <0){
                inicio = medio + 1;
            }
            else{
                if (v[medio].getCódigo().compareTo(código) > 0){
                    fin = medio -1;
                }
                else{
                    return v[medio].getCantidad();
                }
            }
        }
        return -1;
    }
}
