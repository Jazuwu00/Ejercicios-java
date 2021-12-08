package tp6.animal;

public class Gato extends Animales {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void describir() {
        System.out.println(" mamífero de contextura pequeña, carnívoro y cuyos rasgos salientes son:" +
                " cabeza redonda, lengua áspera, patas cortas, uñas importantes, filosas y retráctiles");
    }
}
