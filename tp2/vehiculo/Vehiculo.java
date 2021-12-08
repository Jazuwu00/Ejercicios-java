package tp2.vehiculo;

public class Vehiculo {
    private String nombre;
    private int ruedas;

    public Vehiculo(String nombre, int ruedas) {
        this.nombre = nombre;
        this.ruedas = ruedas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
}
