public class Clase_6 {


    public static void main(String[] args) {


        /*Llamo a la funcion en una variable para poder imprimir el resultado.
        en los ejercicios anteriores directamente ponia la funcion para que
        devuelva un String, pero me di cuenta que tambien lo podia hacer asi.
        y que ademas puedo usarla en otros lados que si lo dejo solo string no
        me servia*/
        int duracionJornada = duracionJornadaCompleta(4);
        System.out.println("La duración total de jornada es " + duracionJornada + " minutos.");

        double costoTotal = costoTotalViaje(150,200,350,2500,2955.5, 0.40);
        System.out.println("El costo total del viaje es $" + costoTotal);
    }

/*En una jornada escolar se dictan varias materias.Todas tienen la misma
duración en minutos. Además, hay recreos de 15 minutos entre cada una.
Si se dictan cierta cantidad de materias, ¿cuánto dura la jornada
completa?*/

    //Declaro la función
    public static int duracionJornadaCompleta(int cantidadMateria) {

        //Declaro las variables que debo utilizar.
        int duracionClases = 120;
        int sumaRecreo = 0;
        int contadorRecreo = 0;
        int duracionJornadaTotal = 0;

        //Verifico si la cantidad de materias es 1
        // ya que no va a contar con recreos.
        if (cantidadMateria <= 1) {
            sumaRecreo = 0;
            duracionJornadaTotal = cantidadMateria * duracionClases;
            System.out.println("La cantidad de recreos " + contadorRecreo);

            return duracionJornadaTotal;
        }
        else {
            contadorRecreo = cantidadMateria- 1;
            int duracionTotalClases = cantidadMateria * duracionClases;
            sumaRecreo = contadorRecreo * 15;
            duracionJornadaTotal = duracionTotalClases + sumaRecreo;
            System.out.println("La cantidad de recreos " + contadorRecreo + ". Un total de " + sumaRecreo + " minutos.");
            return duracionJornadaTotal;
        }
    }

/*Una empresa debe entregar paquetes en 3 ciudades. Cada ciudad está a
cierta distancia. El camión consume X cantidad de litros por kilómetro
y el litro de combustible cuesta un valor X. Además, se paga un peaje
por ciudad. ¿Cuál es el costo total del viaje?*/


   public static double costoTotalViaje (int distanciaCiudad1,int distanciaCiudad2, int distanciaCiudad3,
                                         double peaje, double valorCombustible,double consumoPorKilometro){

       int sumaDistancia = distanciaCiudad1 + distanciaCiudad2 + distanciaCiudad3;
       double consumoCamion = (double) (sumaDistancia * consumoPorKilometro * valorCombustible);
       double totalPeaje = peaje * 3;
       double totalViaje = consumoCamion + totalPeaje;
       return totalViaje;
   }
}
