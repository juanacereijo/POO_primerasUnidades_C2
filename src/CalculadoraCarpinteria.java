import java.util.Random;

public class CalculadoraCarpinteria {

    //Redondo la cantidad de metros de madera al entero más cercano
    public static long redondearMetros(double metros) {
        return Math.round(metros);
    }

    //Calculo el area de una mesa circular ingresando el diámetro
    public static double calcularAreaCircular(double diametro) {
        double radio = diametro / 2.0;
        // Math.PI nos da el valor de pi y Math.pow eleva el radio al cuadrado
        return Math.PI * Math.pow(radio, 2);
    }

    //Calculo cuánto mide cada lado de una mesa cuadrada sabiendo el área
    public static double calcularLadoCuadrado(double area) {
        return Math.sqrt(area);
    }

    //Genero un número aleatorio entre 1 y 10 y verifico si el usuario acerto
    public static boolean jugarPorDescuento(int numeroUsuario) {
        Random random = new Random();
        // random.nextInt(10)
        int numeroGanador = random.nextInt(10) + 1;

        System.out.println("El número ganador es: " + numeroGanador);

        // Retorna true si acertó, false si no
        return numeroUsuario == numeroGanador;
    }
}