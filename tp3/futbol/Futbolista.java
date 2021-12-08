package tp3.futbol;

public class Futbolista {
    private String nombre;
    private String equipo;
    private int CantidadGoles;
    private static Futbolista maximogoleador = null;

    public Futbolista(String nombre, String equipo, int cantidadGoles) {
        this.nombre = nombre;
        this.equipo = equipo;
        CantidadGoles = cantidadGoles;
    }

    public String getNombre() {
        return nombre;
    }

    public static Futbolista getMaximogoleador() {
        return maximogoleador;
    }


    public static void setMaximogoleador(Futbolista maximogoleador) {
        Futbolista.maximogoleador = maximogoleador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getCantidadGoles() {
        return CantidadGoles;
    }

    public void anotargol() {
        CantidadGoles++;
        if (this.getCantidadGoles() > maximogoleador.CantidadGoles) {
            setMaximogoleador(this);
        }
    }

    public void mostrarMaximogoleador() {
        System.out.println("Maximo goleador:\nNombre : " + maximogoleador.getNombre() + "\nEquipo : " +
                maximogoleador.getEquipo() + "\nCantidad de goles : " +
                maximogoleador.getCantidadGoles());
    }
}
