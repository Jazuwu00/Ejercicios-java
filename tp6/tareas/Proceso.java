package tp6.tareas;

import java.util.List;

abstract public class Proceso implements Tarea {
    protected String nombre;

    public Proceso(String nombre) {
        this.nombre = nombre;
    }

    public static void procesarBatch(List<Tarea> tarea) {
        for (Tarea ta : tarea) {
            System.out.println("Ejecutando la Tarea " + ta.getNombre());
            ta.ejecutar();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ejecutar() {
    }
}
