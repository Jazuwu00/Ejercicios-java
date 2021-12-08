package tp7.listaString;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();
        lista.add("jorge");
        lista.add("jaz");
        lista.add("jose");
        lista.add("jose");
        lista.add("nina");
        lista.add("nisman");
        lista.add("nina");
        lista.add("nina");
        lista.set(4, "uwu");
        lista.remove(0);
        lista.remove("jose");
        System.out.println(lista.contains("jose"));
        ListadeStrings.borrarTodos(lista, "nina");
        ListadeStrings.iterarclasico(lista);

    }
}