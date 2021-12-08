package tp6.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animales> ani = new ArrayList<>();
        ani.add(new Gato("julio"));
        ani.add(new Pez("uuw"));
        ani.add(new Cuervo("lorenzo"));
        // imprimir lista Acuatico
        List<Animales> lista = Animales.dameAcuaticos(ani);
        Animales.showDeAnimales(lista);
        // imprimir lista Animales
        Animales.showDeAnimales(ani);



    }
}