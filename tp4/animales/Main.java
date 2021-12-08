package tp4.animales;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> pre = new ArrayList<>();
        pre.add(new Gato("gabi"));
        pre.add(new Perro("lulu"));
        pre.add(new Gato("luna"));
        Animal.escuchartodos(pre);

    }
}
