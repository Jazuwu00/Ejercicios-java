package tp6.animal;

public class Cuervo extends Animales implements Volador {
    public Cuervo(String nombre) {
        super(nombre);
    }

    @Override
    public void describir() {
        System.out.println("El Cuervo se caracteriza por presentar un plumaje negro lustroso," +
                " las plumas de su garganta son duras, su pico es muy fuerte y también negro.");
    }

    @Override
    public void volar() {
        System.out.println("El Cuervo comienza a volar");
    }
}
