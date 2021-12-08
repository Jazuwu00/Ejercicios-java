package tp6.vehiculo;

public class Vehiculos {

    public static void hacerVolar(Vehiculos vehiculo) {
        if (vehiculo instanceof Volador) {
            Volador vuela = (Volador) vehiculo;
            vuela.volar();
        } else {
            System.out.println("este Vehiculo no vuela");
        }
    }

    public static boolean esVolador(Vehiculos vehiculo) {
        if (vehiculo instanceof Volador) {
            return true;
        } else {
            return false;
        }
    }
}
