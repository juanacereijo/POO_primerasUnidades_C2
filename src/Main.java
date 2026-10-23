public class Main {
    public static void main(String[] args) {

        //Redondeo de madera
        double metrosPedido = 12.7;
        System.out.println("Se necesitan: " + metrosPedido + "m. Debe llevar: " + CalculadoraCarpinteria.redondearMetros(metrosPedido) + "m");

        // Área de un circulo
        double diametro = 1.5;
        double areaCirculo = CalculadoraCarpinteria.calcularAreaCircular(diametro);
        System.out.printf("Área para mesa circular (diámetro %.2fm): %.2f m²\n", diametro, areaCirculo);

        //Lado de mesa cuadrada
        double areaTotal = 9.0;
        System.out.println("Para un área de " + areaTotal + "m2, cada lado mide: " + CalculadoraCarpinteria.calcularLadoCuadrado(areaTotal) + "m");

        //Sorteo del 15% de descuento
        int numeroCliente = 7;
        System.out.println("\nEl número que dice el cliente es : " + numeroCliente);

        if (CalculadoraCarpinteria.jugarPorDescuento(numeroCliente)) {
            System.out.println("¡Felicitaciones! Se ganó un 15% de descuento para la próxima compra.");
        } else {
            System.out.println("No ha ganado. ¡Suerte la próxima vez!");
        }
    }
}