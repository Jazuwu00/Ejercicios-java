package tp4.animales;

public class Gato extends Animal {
    private static String especie = "Gato";
    private String nombre;

    public Gato(String nombre) {
        super(nombre, especie);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String hacerruido() {
        return "miau";
    }

    @Override
    public void describir() {
        System.out.println("Soy un Gato y me gusta domir");
    }
}
