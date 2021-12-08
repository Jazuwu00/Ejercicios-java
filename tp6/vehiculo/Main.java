package tp6.vehiculo;

public class Main {

    public static void main(String[] args) {
        //Crear instancias de todas las clases.
        Avion avion = new Avion();
        Lancha lancha = new Lancha();
        Auto a1 = new Auto();
        Helicoptero heli = new Helicoptero();
        //Crear una variable de tipo Vehiculo, asignarle las instancias de todas las clases
        Vehiculos vehi1 = new Auto();
        Vehiculos vehi = new Avion();
        Vehiculos v = new Helicoptero();
        Vehiculos vL = new Lancha();
        // castear la variable Vehiculo a Volador
        // ta bien : Volador Auto = (Volador) vehi;
        // error :  Volador lan = (Volador) vL;
        Vehiculos.hacerVolar(v);
        Vehiculos.hacerVolar(vL);
        System.out.println(Vehiculos.esVolador(vehi1));
        System.out.println(Vehiculos.esVolador(vehi));


    }
}
