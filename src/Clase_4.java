import java.util.Scanner;

public class Clase_4 {

    public static void main(String[] args) {

        //Invoco la función con un nombre dado

        System.out.println(contarInicial("David"));

        //Ingreso un nombre por cosola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nombre = scanner.nextLine();

        //Invoco la función con el nombre ingresado
        // por consola.
        System.out.println(contarInicial(nombre));


        //Invoco la función con las datos ya dados.
        System.out.println(requisitoPromocion(90,true,10));
        //Ingreso por consola los requisistos
        //que el alumno debe cumplir.
        Scanner alumno = new Scanner(System.in);
        System.out.println("Ingrese el porcentaje de asistencia del alumno:");
        int asistencia = alumno.nextInt();
        System.out.println("El alumno entrego todos los trabajos practicos: (true para si / false para no)");
        boolean trabajoPresentado = alumno.nextBoolean();
        System.out.println("Ingrese la nota del examen final: ");
        int notaFinal = alumno.nextInt();

        //Invoco la funcion con los datos ingresados por la consola
        System.out.println(requisitoPromocion(asistencia,trabajoPresentado,notaFinal));

        //Invoco la funcion con un valor dado
        System.out.println(imprimirCantidadLetrasVocales(" "));
        // Ingreso por consola el texto
        Scanner texto = new Scanner(System.in);
        System.out.println("Ingrese un texto: ");
        String textoIngresado = texto.nextLine();

        //Invoco la funcion con los datos ingresados por la consola
        System.out.println(imprimirCantidadLetrasVocales(textoIngresado));

        //Invoco la funcion con un valor dado
        System.out.println(calcularPorcentaje(600));

         //Ingreso por consola el texto
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        double numero = num.nextDouble();
        //Invoco la funcion con los datos ingresados por la consol
        System.out.println(calcularPorcentaje(numero));

        //Invoco la funcion con un valor dado
        System.out.println(calculoSumaNumNaturales(9));
        // Ingreso por consola el texto
        Scanner naturales = new Scanner(System.in);
        System.out.println("Ingrese un número natural: ");
        int numeroNatural = naturales.nextInt();
        //Invoco la funcion con los datos ingresados por la consola
        System.out.println(calculoSumaNumNaturales(numeroNatural));

            /*Realizar un algoritmo en el cual se muestre cuáles números son pares
e impares partiendo del 1 al 20.*/

        for (int i = 1; i <= 20; i++){
            if(i% 2 == 0){
                System.out.println("El número " + i + " es un número par.");
            }
            else {
                System.out.println("El número " + i + " es un número impar.");
            }
        }

    }

        /*Crea una función que reciba un nombre y retorne la
        inicial del mismo. Debe contar la cantidad de veces
        que se repite esa letra.*/

    //Declaro la función.
    public static int contarInicial( String nombre) {
        //Verifico que no sea nula  o un nombre vacio.
        if (nombre == null || nombre.isBlank()) {
            System.out.println("¡Error. Ingrese un nombre válido.!");
            return 0;
        } else {

            // Contabilizo cuantas veces se repita la letra inicial
            // del nombre.
            int contador = 0;
            //Paso el nombre a minusculas y busco su inicial.
            String nombreMinuscula = nombre.toLowerCase();
            char inicial = nombreMinuscula.charAt(0);

            for (int i = 0; i < nombreMinuscula.length(); i++) {

                if (nombreMinuscula.charAt(i) == inicial) {
                    contador++;
                }
            }
            // Imprimo la incial del nombre y cuantas veces se repite.
            IO.println("El nombre ingresado es : "+ nombreMinuscula + " y su inical es: " + inicial);
            System.out.println("La cantidad de veces que se repite la inicial es : ");
            return contador;
        }
    }

    /*Escribir una función que evalúe si un estudiante
    cumple con los requisitos para promocionar y defina un
    mensaje personalizado para cada caso. El estudiante
    debe contar con al menos el 80% de asistencia, haber
    presentado los trabajos y obtener una nota mayor o
    igual a seis en el examen final.*/

    // Declaro la función
    public static String requisitoPromocion(int asistencia, boolean trabajoPresentado, int notaFinal){

        //Verifico si tiene las condiciones para promocionar.
        if(asistencia < 80 || !trabajoPresentado || notaFinal < 6){
           String mensaje = "No ha promocionado. Motivo:" ;
            // Imprimo mensaje por cada motivo de no promoción.
           if (asistencia < 80){
               mensaje = mensaje + "\nNo cumple con al menos el 80% de asistencia.";
           }
           if (!trabajoPresentado) {
               mensaje = mensaje + "\nNo ha entregado los trabajos.";
           }
           if(notaFinal < 6){
               mensaje = mensaje + "\nHa obtenido una nota menor a 6 en su examen final.";
           }

           return mensaje;
        }
        else {
            String mensaje ="¡¡Felicidades!!. Ha promociono la materia.";
            return mensaje;
        }
    }

    /*Transformar el ejercicio de la clase 3 en función
    para poder utilizarlo con cualquier texto.*/

    public static String imprimirCantidadLetrasVocales(String texto){
        // verifico si el texto ingresado esta vacio o es nulo.
        if (texto == null || texto.isBlank()) {
            String mensaje = "Error. Ingrese un texto válido.";
            return mensaje;
        }
        else{
            int contadorVocales = 0;
            //Transformo el texto a minuscula y elimino espacios vacios.
            String textoNormal = texto.toLowerCase().replace(" ","");

            //Calculo cuantas vocales hay en el texto ingresado.
            for (int i = 0; i < textoNormal.length(); i++){

                if (textoNormal.charAt(i) == 'a'||
                        textoNormal.charAt(i)== 'e' ||
                        textoNormal.charAt(i) == 'i' ||
                        textoNormal.charAt(i) == 'o' ||
                        textoNormal.charAt(i) == 'u') {
                    contadorVocales ++;
                }
            }
            // Imprimo la cantidad de vocales y de letras que posee el texto ingresado.
            String mensaje ="La cantidad de letras que tiene el texto es: " + textoNormal.length()+
                    "\nLa cantidad de vocales que contine el texto ingresado es: " + contadorVocales;
            return mensaje;
        }
    }

    /*1.Construir un algoritmo que permita ingresar un número, si el número
es mayor de 500, se debe calcular y mostrar en pantalla el 18% de
este.*/


    public static String calcularPorcentaje(double numero){
        String mensaje ="El 18% de " + numero + " es ";
         //Verifico si el número ingresado es mayor de 500.
        if (numero <= 500){
            mensaje = "El número imgresado es inválido";
            return mensaje;
        }
        else {
            double resultado = (numero * 18 /100);
            String repuesta= mensaje + resultado;
            return repuesta;
        }


    }

    /*2. Hacer un programa que calcule la suma de los N primeros números
    naturales, donde N es el número límite ingresado por teclado.*/

    public static String calculoSumaNumNaturales(int numero){

        String mensaje = "La suma de los número naturales es : ";
        // Verifico si el número ingresado es un número natural.
        if (numero <= 1){
            String repuesta = "Ingrese un número válido.";
            return repuesta;
        }
        else {
            // Si es un número natural, lo voy sumando.
            int suma = 0;
            int i = 1;

            while (i <= numero) {
                suma = suma + i;
                i++;
            }
            String repuesta = mensaje + suma;
            return repuesta;
        }
    }



}
