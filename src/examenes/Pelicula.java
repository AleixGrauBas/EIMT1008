package examenes;

public class Pelicula {
    private Pelicula[] v;//vector peliculas y null
    int n;//cantidad de elementos del vector que se estan usando
    public void simplificar(){
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (v[i].getTitulo().compareto(v[j].getTitulo()) == 0 ){//si encontramos dos peliculas con el mismo titulo
                    v[i].incrementarRecaudación(v[j].getRecaudación());//incrementamos la recaudacion de la pelicula antes de quitar el elemento
                    Pelicula[] aux = new Pelicula[v.length -1];//creamos un vector auxiliar de v.length -1
                    for (int k = 0; k < aux.length;k++){//rellenamos el vector auxiliar con los elementos de antes
                        if (k != j) { //copiamos todos los elementos que no son el repetido
                            aux[k] = v[k];
                        }
                    }
                    v = aux;
                }
            }
        }

    }
}
