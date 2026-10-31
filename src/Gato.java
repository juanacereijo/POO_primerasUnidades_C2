public class Gato extends Animal {
    //Declaro los atributos especificos de la clase hija
    private int contPresa;

    //Constructor de la clase hija, con los atributos heredados de la clase padre.
    public Gato(String codigoId, String nombre, int edad, double peso) {
        super(codigoId, nombre, edad, peso);
        this.contPresa = 0; // Inicia en cero presas cazadas
    }

    //Sobre escribo el método heredado de la clase padre.
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Miau, miau!");
    }

    //Método de tarea propia de la clase perro.
    public void cazar() {
        this.contPresa++;
        // Disminuye el peso al realizar la tarea
        this.peso -= 0.1;
        System.out.println(getNombre() + " cazó una presa. Total acumulado: " + contPresa + ". Peso actual: " + this.peso + " kg.");
    }
    @Override
    public String toString() {
        // Llama al toString de Animal y le concatena el atributo del Gato
        return super.toString() + " Gato {Contador Presa= " + contPresa + "}";
    }
}
