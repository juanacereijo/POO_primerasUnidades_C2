public class Animal {

    //Declaro los atributos de la clase padre
    private String codigoId;
    private String nombre;
    private int edad;
    // Declaro el atributo peso como protected
    // para que las hijas disminuyan el peso al trabajar
    protected double peso;

    //Constructor de la clase animal.
    public Animal(String codigoId, String nombre, int edad, double peso) {
        this.codigoId = codigoId;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    // Propiedades,
    // Solo getter para unicamente ver los datos.
    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public String getCodigoId() {
        return codigoId;
    }

    // Método de hacer sonido.
    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }

    // Sobrecarga 1: Come alimento balanceado.
    public void comer() {
        this.peso += 0.5;
        System.out.println(nombre + " comió su alimento balanceado habitual. Nuevo peso: " + this.peso + " kg.");
    }

    // Sobrecarga 2: Come otro tipo de alimento con una cantidad específica
    public void comer(String tipoAlimento, double cantidad) {
        this.peso += (cantidad * 0.1);
        System.out.println(nombre + " comió " + cantidad + " kg de " + tipoAlimento + ". Nuevo peso: " + this.peso + " kg.");
    }

    // Método final (no se puede sobrescribir)
    public final void dormir() {
        System.out.println(nombre + " está durmiendo... ¡ZzZzZz!");
    }

    @Override
    public String toString() {
        return "Animal {ID= " + codigoId +
                ", Nombre= " + nombre +
                ", Edad= " + edad + " años," +
                "Peso= " + peso + " kg}";
    }

    @Override
    public boolean equals(Object obj) {
        //Si apuntan a la misma memoria, son iguales
        if (this == obj) return true;

        // Si el otro objeto es nulo o de otra clase, no son iguales
        if (obj == null || getClass() != obj.getClass()) return false;

        // Convertimos el objeto a tipo Animal para comparar sus atributos
        Animal other = (Animal) obj;

        // Dos animales son iguales si tienen el mismo codigoId
        if (codigoId == null) {
            if (other.codigoId != null) return false;
        } else if (!codigoId.equals(other.codigoId)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoId == null) ? 0 : codigoId.hashCode());
        return result;
    }

}
