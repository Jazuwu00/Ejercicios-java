package tp6.animal;

public class Loro extends Animales implements Volador {
    public Loro(String nombre) {
        super(nombre);
    }

    @Override
    public void describir() {
        System.out.println("Los loros se caracterizan por tener un pico curvado");
    }

    @Override
    public void volar() {
        System.out.println("El Loro comienza a volar");
    }
}
