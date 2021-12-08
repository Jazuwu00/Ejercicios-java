package tp8.palabra;

import java.util.*;

public class Palabras {

    public static Set<String> palabras(String oracion) {
        String[] separado = oracion.split(" ");
        return new HashSet<>(Arrays.asList(separado));
    }

    public static Set<String> palabrasOrdenadas(String oracion) {
        String[] separado = oracion.split(" ");
        return new TreeSet<>(Arrays.asList(separado));
    }

    public static Map<String, Integer> palabrasxNum(String oracion) {
        String[] separado = oracion.split(" ");
        Map<String, Integer> SI = new TreeMap<>();
        for (String s : separado) {
            SI.put(s, SI.getOrDefault(s, 0) + 1);
        }
        return SI;
    }


}
