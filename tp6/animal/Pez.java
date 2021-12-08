package tp6.animal;

public class Pez extends Animales implements Acuatico {
    public Pez(String nombre) {
        super(nombre);
    }

    @Override
    public void nadar() {
        System.out.println("El Pez comienza a nadar");
    }

    @Override
    public void describir() {
        System.out.println("Vertebrado acuático de respiración branquial generalmente con "+
                            "extremidades en forma de aleta ");
    }
}