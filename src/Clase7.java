import java.util.Scanner;
public class Clase7 {
    /*Comisión total

    Crea una función que solicite ingresar por
    consola el total de ventas realizadas y también
    la cantidad de ventas, ingresando los valores
    como texto. Debe calcular la comisión total, si
    la cantidad de ventas realizadas supera cierto
    número ingresado como parámetro aplicar un plus
    del 5% sobre la comisión. Imprimir el total
    formateado como String.*/

    public static void main(String[]args){
        // Invoco la función
       CalularComisionTotal(10);
    }

    public static void CalularComisionTotal(int cantidadVentaLimite){

        //Ingreso por consola el total de ventas y
        // la cantidad de ventas. Los valores
        // se ingresan como texto.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el total de ventas realizadas $ ");
        String totalVentasTxt = scanner.nextLine();

        System.out.print("Ingrese la cantidad de ventas realizadas: ");
        String cantidadVentasTxt = scanner.nextLine();

        //Convierto los datos ingresasdos  para poder usarlos.

        double totalVentas = Double.parseDouble(totalVentasTxt);
        int cantidadVentas = Integer.parseInt(cantidadVentasTxt);

        //Calculo una comisión base (elijo el 15% del total de la venta)

        double comision = totalVentas * 0.15;

        //Calculo la comisión total.
        // Si la cantidad de ventas realizadas supera cierto
        // número ingresado como parámetro se aplicar un plus
        // del 5% sobre la comisión.

        if (cantidadVentas > cantidadVentaLimite){
            comision = comision + (comision * 0.05);

            //System.out.println("La comision es " + comision);
        }

        // Paso el valor total como String

        String valorTotalTxt = String.valueOf(comision);

        //Imprimo el valor total

        System.out.println("El total de la comisión es: " + valorTotalTxt);

    }
}
