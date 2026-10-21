import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/* Necesitamos una función que solicite al usuario ingresar cuatro películas separadas por coma.
Debe crear un Array, ordenarlo (a-z) y retornarlo.
Crea una copia del array con el texto en mayúscula. Necesitamos cargar una película más.
Crea una variable que guarde el primer valor del array que comience con “c”.*/
class Pelicula {

    public ArrayList<String> procesarPeliculas() {
        Scanner scanner = new Scanner(System.in);

        // Solicito al usuario ingresar las cuatro películas separadas por coma
        System.out.println("Ingresa 4 películas separadas por coma (ej: Cars, Matrix, Sherk, Titanic):");
        String entrada = scanner.nextLine();

        // Creo un Array  para guardar las peliculas
        String[] peliculasOriginales = entrada.split(",");

        // Saco los espacios en blanco que pueden quedar
        for (int i = 0; i < peliculasOriginales.length; i++) {
            peliculasOriginales[i] = peliculasOriginales[i].trim();
        }
        // Creo una nueva lista para guardar las peliculas ordenadas
        ArrayList<String> listaPeliculas = new ArrayList<>();

        // Recorro el array original y añado a la lista que cree cada elemento
        for (int i = 0; i < peliculasOriginales.length; i++) {
            listaPeliculas.add(peliculasOriginales[i]);
        }
        // Ordeno de la  a-z las peliculas.
        Collections.sort(listaPeliculas);

        // Retorno el array ordenado
        return listaPeliculas;
    }
}
