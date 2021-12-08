package tp6.sorting;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //false es femenino
        List<ordenable> personas = new ArrayList<>();
        personas.add(new Persona(1, false));
        personas.add(new Persona(3, true));
        personas.add(new Persona(7, false));
        personas.add(new Persona(1, true));
        personas.add(new Persona(2, true));
        personas.add(new Persona(2, false));
        personas.add(new Persona(9, true));
        personas.add(new Persona(9, false));

        Sorting.bubblesort(personas);

        List<ordenable> par = new ArrayList<>();
        par.add(new Par(1, 3));
        par.add(new Par(1, 6));
        par.add(new Par(3, 3));
        par.add(new Par(3, 5));
        par.add(new Par(8, 3));
        par.add(new Par(8, 6));
        par.add(new Par(6, 7));
        par.add(new Par(6, 7));

        Sorting.bubblesort(par);

        List<ordenable> par2 = new ArrayList<>();
        par2.add(new Par2(2, 4));
        par2.add(new Par2(78, 2));
        par2.add(new Par2(3, 5));
        par2.add(new Par2(9, 6));
        par2.add(new Par2(8, 7));
        par2.add(new Par2(6, 9));
        Sorting.bubblesort(par2);
    }
}