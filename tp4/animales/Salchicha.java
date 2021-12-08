package tp4.animales;

public class Salchicha extends Perro {
    private String nombre;
    private static String raza = "Salchicha";

    public Salchicha(String nombre) {
        super(nombre);
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void describir() {
        System.out.println("Tengo forma de salchica");
    }
}
