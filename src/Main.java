//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    /*
Primera práctica: El gimnasio

Para esta primera clase comencemos a construir un programa que
permita consultar la información de un nuevo cliente. Tener en
cuenta que el gimnasio brinda la posibilidad de comprar paquetes de
horas y organizarlas en clases de una determinada duración.
Para el primer cliente se requiere:

1. Guardar su nombre completo, contacto, cantidad de horas que
compró y un tiempo de duración de clase ( puede ser 0.75, 1.3 o
2.5 teniendo en cuenta que la unidad equivale a 60 minutos).
2. Averiguar cuántas clases tiene disponibles.
3. Visualizar un mensaje de bienvenida con la información
guardada.
* */

    //Datos.

    String nombreCompleto = "Bautista Cereijo";
    int contacto = 1563005966;
    int cantHorasCompradas = 60;
    double tiempoClase = 2.5;

    // Clases disponibles

    int clasesDisponible = (int) (cantHorasCompradas / tiempoClase);

    System.out.println(clasesDisponible);

    // Mensaje de Bienvenida

    System.out.println("Bienvenido/a!!" + "\n" + "Nombre y apellido: " + nombreCompleto + "\n" + "Contacto: " + contacto + "\n" +
            "Cantidad de horas compradas: " + cantHorasCompradas + " horas." + "\n" + "Duraciòn de clase: " +
            tiempoClase + "\n" + "Clases disponibles: " + clasesDisponible + "\n");

/*4. Cada seis clases se realiza un ajuste de rutina. Se debe
visualizar cuántos ajustes tendrá en total.
5. Solicitar el ingreso de un número de clase y responder si
aplica el descuento en la cafetería que se otorga cada cinco
clases. Tener en cuenta que no puede superar la cantidad de
clases reservadas.
* */

    //Ajuste de rutina cada 6 clases.

    int contadorAjuste = 0;

    for (int i = 0; i < clasesDisponible; i++) {
        if (i % 6 == 0) {
            contadorAjuste += 1;

        }

    }

    System.out.println("La cantidad de ajustes ha realizar de la rutina es: " + contadorAjuste + "\n");

    // Aplicar descuento cada 5 clases.
    // No debe superar la cantidad de clases en total.

    int numeroClase = 21;

    if (numeroClase >= clasesDisponible || numeroClase < 1 ) {
        System.out.println("Los datos ingresados son incorrector." + "\n");
    } else {
        if (numeroClase % 5 == 0) {
            System.out.println("Para la clase Nº " + numeroClase + " aplica el descuento en la feteria" + "\n");
        } else {
            System.out.println("Para la clase Nº " + numeroClase + " no aplica el descuento de la cafeteria." + "\n");
        }
    }

/* 6. El gimnasio tiene sus actividades distribuidas por piso: sector
a (musculación) en el 2°, sector b (spinning) en el 3°, sector
c (natación) en el 4°. Dado el sector que ingresa el socio,
indicá a qué piso dirigirlo.
7. Por último, cada seis clases se considera importante realizar
una autoevaluación del progreso. Contabilizar partiendo del n°
de clases reservado de forma regresiva la cantidad que corresponde. **/

    // Distribución del gimnasio.

    int sector = 4;

    switch (sector) {
        case 2 ->
                IO.println("El socio/a se dirige al Sector de Musculaciòn." + "\n");
        case 3 ->
                IO.println("El socio/a se dirige al Sector de Spinning." + "\n");
        case 4 ->
                IO.println("El socio/a se dirige al Sector de Natación." + "\n");
        default ->
                System.out.println("Sector inválido." + "\n");
    }

    // Se realiza una autoevaluación cada 6 clases.
    //Contabilizo de forma regresiva partiendo desde el nº de clases disponibles.

    int contadorAutoevaluacion = 0;
    for (int i = clasesDisponible; i >=1;  i --) {
        if (i % 6 == 0) {

            System.out.println("Clase nº: "+ i+ " corresponde realizar una autoevalución.");
            contadorAutoevaluacion ++;
        }
    }

    System.out.println("La Cantidad de autoevaluaciones son: "+ contadorAutoevaluacion);

/*String
Imprimí la cantidad de letras y vocales que
tiene un nombre ingresado por consola.
Verificar al principio que la cadena no sea
nula ni esté vacía.
**/


    // Ingreso de nombre por consola.

    Scanner scanner = new Scanner(System.in);
    IO.println("Ingrese un nombre: ");

    String nombre = scanner.nextLine();

    // Verifico si el valor ingresado
    // no se nula ni este vacia.

    if (nombre == null || nombre.isBlank()) {
        IO.println("Error. Ingrese un nombre válido.");
    }
    // Imprimo la cantidad de letras del nombre
    else{
       IO.println("La cantidad de letras que contine el nombre ingresado es: "+ nombre.length());

       // Contabilizo la cantidad de vocales qur posee el nombre.

        int contadorVocales = 0;

        for (int i = 0; i < nombre.length(); i++){

            if (nombre.toLowerCase().charAt(i) == 'a'||
                    nombre.toLowerCase().charAt(i) == 'e' ||
                    nombre.toLowerCase().charAt(i) == 'i' ||
                    nombre.toLowerCase().charAt(i) == 'o' ||
                    nombre.toLowerCase().charAt(i) == 'u') {
                contadorVocales ++;
            }
        }
        // Imprimo la cantidad de vocales
        IO.println("La cantidad de vocales que contine el nombre ingresado es: " + contadorVocales);
    }

}
