package tp4.animales;

public class Perro extends Animal {
    private static String especie = "Perro";
    private String nombre;

    public Perro(String nombre) {
        super(nombre, especie);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String hacerruido() {
        return "guau";
    }

    @Override
    public void describir() {
        System.out.println("Nesecito salir a pasear");
    }
}
