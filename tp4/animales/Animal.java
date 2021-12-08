package tp4.animales;

import java.util.List;

public abstract class Animal {
    protected String nombre;
    protected String especie;

    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public abstract String hacerruido();

    public void describir() {
        System.out.println("");
    }

    public static void escuchartodos(List<Animal> animal1) {
        for (Animal animal : animal1) {
            System.out.println(animal.nombre + " especie " + animal.getEspecie() + " hizo " + animal.hacerruido());
        }
    }

}
