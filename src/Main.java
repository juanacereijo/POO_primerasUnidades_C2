import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pelicula titulo = new Pelicula();

        // Llamo a la función  y obtengo el array ordenado
        ArrayList<String> listaPeliculas = titulo.procesarPeliculas();
        System.out.println("Lista original ordenada: " + listaPeliculas);

        // Crea una copia del array con el texto en mayúscula
        ArrayList<String> listaMayusculas = new ArrayList<>();
        for (String pelicula : listaPeliculas) {
            listaMayusculas.add(pelicula.toUpperCase());
        }
        System.out.println("Copia en mayúsculas: " + listaMayusculas);

        //Cargo una película más a la lista original
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una película más para agregar a la lista:");
        String nuevaPelicula = scanner.nextLine().trim();
        listaPeliculas.add(nuevaPelicula);
        System.out.println("Lista con la nueva película: " + listaPeliculas);

        // Creo una variable que guarde el primer valor del array que comience con “c”
        String peliculaConC = null;
        // Recorro la lista
        for (int i = 0; i < listaPeliculas.size(); i++) {
            String pelicula = listaPeliculas.get(i);

            if (pelicula.toLowerCase().startsWith("c")) {
                peliculaConC = pelicula;
                break;
            }
        }

        // Mostramos el resultado de la búsqueda
        if (peliculaConC != null) {
            System.out.println("Primera película que empieza con 'C': " + peliculaConC);
        } else {
            System.out.println("No se encontró ninguna película que empiece con 'C'.");
        }
    }
}