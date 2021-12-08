package tp8.carritodecompras;

import java.util.Objects;

public class Producto implements Comparable {
    private String nombre;
    private int id;


    public Producto(String nombre, int ID) {
        this.nombre = nombre;
        this.id = ID;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", ID='" + id + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        Producto producto = (Producto) o;
        return Objects.equals(nombre, producto.nombre) && Objects.equals(id, producto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id);
    }

    @Override
    public int compareTo(Object o) {
        Producto producto = (Producto) o;
        if (this.id > producto.id) {
            return 1;
        } else if (this.id < producto.id) {
            return -1;
        } else
            return 0;
    }
}
