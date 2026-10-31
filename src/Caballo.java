public class Caballo extends Animal {
    //Declaro los atributos especificos de la clase hija
    private String raza;

    //Constructor de la clase hija, con los atributos heredados de la clase padre.
    public Caballo(String codigoId, String nombre, int edad, double peso, String raza) {
        super(codigoId, nombre, edad, peso);
        this.raza = raza;
    }

    //Sobre escribo el método heredado de la clase padre.
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " relincha: ¡Iiiihhhh!");
    }

    //Método de tarea propia de la clase perro.
    public void cabalgar() {
        // Disminuye el peso al realizar la tarea
        this.peso -= 0.8;
        System.out.println(getNombre() + " (Raza: " + raza + ") está cabalgando libremente. Peso actual: " + this.peso + " kg.");
    }

    @Override
    public String toString() {
        // Llama al toString de Animal y le concatena el atributo del Caballo
        return super.toString() + " Caballo {Raza= " + raza + "}";
    }
}
