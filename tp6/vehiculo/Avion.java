package tp6.vehiculo;

public class Avion extends Vehiculos implements Volador {
    @Override
    public void volar() {
        System.out.println("el Avion comienza a volar");
    }
}
