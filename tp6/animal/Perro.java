package tp6.animal;

public class Perro extends Animales {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void describir() {
        System.out.println("Mamífero doméstico de la familia de los cánidos , de tamaño , forma y " +
                "pelaje muy diversos , según las razas , que tiene olfato muy fino y es inteligente");
    }
}
