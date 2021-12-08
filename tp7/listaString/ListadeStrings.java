package tp7.listaString;

import java.util.List;

public class ListadeStrings {

    public static void iterarclasico(List<String> listaString) {
        for (int i = 0; i < listaString.size(); i++) {
            System.out.println(listaString.get(i));
        }
    }

    public static void iterarColecciones(List<String> listaString) {
        for (String s : listaString) {
            System.out.println(s);
        }
    }

    public static void borrarTodos(List<String> lista, String nombre) {
        while (lista.contains(nombre)) {
            lista.remove(nombre);
        }
    }


}
