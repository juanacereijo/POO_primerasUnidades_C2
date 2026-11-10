public class Vivora extends Animal {
    public Vivora(String codigoId, String nombre, int edad, double peso) {
        super(codigoId, nombre, edad, peso);
    }

    @Override
    public void hacerSonido() {
        System.out.println("SsSsSs.~ La víbora sisea.");
    }
}
