public class Main {
    public static void main(String[] args) {
        //Instancio algunos animales de la granja
        Perro perro = new Perro("P01", "Puerco", 4, 25.0, "Sur");
        Caballo caballo = new Caballo("C01", "Spirit", 6, 450.0, "Mestizo");
        Gato gato = new Gato("G01", "Zen", 2, 4.5);

        //Pruebo los métodos de hacerSonido de cada clase
        System.out.println("\n--- Sonidos de los animales ---");
        perro.hacerSonido();
        caballo.hacerSonido();
        gato.hacerSonido();

        //Pruebo los métodos para comer (Sobrecarga)
        //Alimento balanceado
        perro.comer();
        //Otra alimento con cantidad especifica.
        gato.comer("Atún en lata", 0.2);

        //Pruebo los metodos especificos de cada clase hija.
        perro.pastorear();
        caballo.cabalgar();
        gato.cazar();
        //Pruebo el método de caza para probar el contador de caza.
        gato.cazar();

        //Pruebo método final en las clases hijas.
        perro.dormir();
        gato.dormir();
        caballo.dormir();

        System.out.println("\n--- Probando toString() ---");
        System.out.println(perro.toString());

        System.out.println("\n--- Probando equals() y hashCode() ---");
        // Creao otro perro con el mismo ID para ver si el sistema los reconoce como iguales
        Perro perroClon = new Perro("P01", "Puerco Clon", 4, 25.0, "Sur");

        System.out.println("¿El perro original es igual al clon? " + perro.equals(perroClon));
        System.out.println("HashCode Perro: " + perro.hashCode());
        System.out.println("HashCode Clon: " + perroClon.hashCode());
    }
}

