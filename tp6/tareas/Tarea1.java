package tp6.tareas;

public class Tarea1 extends Proceso implements Tarea {
    private String algo;

    public Tarea1(String nombre, String algo) {
        super(nombre);
        this.nombre = nombre;
        this.algo = algo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void ejecutar() {
        System.out.println(algo);
    }
}
