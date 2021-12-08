package tp6.animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Animales {
    public Animales(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void describir();

    public static List<Animales> dameAcuaticos(List<Animales> animal) {
        List<Animales> animalesAcuaticos = new ArrayList<>();
        for (Animales ani : animal) {
            if (ani instanceof Acuatico) {
                animalesAcuaticos.add(ani);
            }
        }
        return animalesAcuaticos;
    }

    public static void showDeAnimales(List<Animales> uwu) {
        for (Animales ani : uwu) {
            if (ani instanceof Acuatico) {
                ((Acuatico) ani).nadar();
            } else if (ani instanceof Volador) {
                ((Volador) ani).volar();
            } else {
                System.out.println(ani.getNombre() + " no hace nada");
            }
        }
    }

}
