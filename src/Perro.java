public class Perro extends Animal implements Domesticable  {

    //Declaro los atributos especificos de la clase hija
    private String sectorPastoreo;

   //Constructor de la clase hija, con los atributos heredados de la clase padre.
    public Perro(String codigoId, String nombre, int edad, double peso, String sectorPastoreo) {
        super(codigoId, nombre, edad, peso);
        this.sectorPastoreo = sectorPastoreo;
    }

    //Sobre escribo el método heredado de la clase padre.
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau, guau!");
    }

    //Método de tarea propia de la clase perro.
    public void pastorear() {
        // Disminuye el peso al realizar la tarea
        this.peso -= 0.3;
        System.out.println(getNombre() + " está pastoreando en el sector " + sectorPastoreo + ". Perdió peso entrenando. Peso actual: " + this.peso + " kg.");
    }

    @Override
    public String toString() {
        // Llama al toString de Animal y le concatena el atributo del Perro
        return super.toString() + "Perro [Sector Pastoreo= " + sectorPastoreo + "]";
    }


    @Override
    public void domesticar(String tipoAlimento, double cantidad){
        System.out.println(getNombre() + " mueve la cola de felicdad  al comer " + cantidad + "kg de " + tipoAlimento);
    }

}
