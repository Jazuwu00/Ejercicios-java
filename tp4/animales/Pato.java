package tp4.animales;

public class Pato extends Animal {
    private static String especie = "Pato";
    private String nombre;

    public Pato(String nombre) {
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
        return "Cuak";
    }

    @Override
    public void describir() {
        System.out.println("Me encanta nadar");
    }
}
