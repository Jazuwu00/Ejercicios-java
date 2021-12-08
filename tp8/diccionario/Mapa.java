package tp8.diccionario;

import java.util.*;

public class Mapa {
    public static Set<String> oracion(String oracion) {
        String[] separado = oracion.split(" ");

        return new HashSet<>(Arrays.asList(separado));
    }

    public static void diccionario(Map<String, String> dic, Set<String> lis) {
        for (String s : lis) {
            if (dic.containsKey(s)) {
                System.out.println("La definicion de " + s + " es: " + dic.get(s));
            }
        }
    }
}
