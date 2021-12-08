package tp6.sorting;

import java.util.List;

public class Sorting {
    public static void bubblesort(List<ordenable> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1; j++) {
                if ((lista.get(j)).esMayor(lista.get(j + 1))) {
                    ordenable tmr = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, tmr);
                }
            }
        }
        for (Object num : lista) {
            System.out.println(num.toString());
        }
    }
}
