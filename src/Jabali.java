public class Jabali extends Animal {

    public Jabali(String codigoId, String nombre, int edad, double peso) {
        super(codigoId, nombre, edad, peso);}


    @Override
    public void hacerSonido() {
        System.out.println("Okin (Agresivo)- El jabalí gruñe.");
    }



}
