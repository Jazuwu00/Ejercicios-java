package tp6.tareas;

import java.util.List;

public class Estudio extends Proceso implements Tarea {
    private List<Integer> listanumeros;

    public Estudio(String nombre, List<Integer> listanumeros) {
        super(nombre);
        this.nombre = nombre;
        this.listanumeros = listanumeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void ejecutar() {
        for (Integer si : listanumeros) {
            System.out.println("Cantidad de trabajos realizados por el equipo : " + si + 100);
        }
    }
}
