public class Dueño {
    //declaro los atributos
    private String nombre;

    //Constructor
    public Dueño(String nombre){
        this.nombre = nombre;
    }

    //Métodos

    public void adiestrar(Domesticable animal, String comida, double cantidad){
        System.out.println(this.nombre + " está intentando adiestrar al animal.");
        animal.domesticar(comida, cantidad);
    }
}
