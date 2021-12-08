package tp6.vehiculo;

public class Helicoptero extends Vehiculos implements Volador {
    @Override
    public void volar() {
        System.out.println("el Helicoptero comienza a volar");
    }
}
