package tp6.animal;

public class Medusa extends Animales implements Acuatico {
    public Medusa(String nombre) {
        super(nombre);
    }

    @Override
    public void nadar() {
        System.out.println("La Medusa esta nadando");
    }

    @Override
    public void describir() {
        System.out.println("Las medusas viven en el mar y no suelen molestar a nadie." +
                " Se limitan a flotar en el mar, tienen un aspecto extraño y " +
                "a veces la corriente las arrastra hacia la playa.");
    }
}
