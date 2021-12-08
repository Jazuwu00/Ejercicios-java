package tp8.diccionario;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String s = "nuestro arbol cayo y murio";
        Set<String> oracion = Mapa.oracion(s);
        Map<String,String> diccionario = new HashMap<>();
        diccionario.put("nuestro", "Pronombre con el que la Persona que habla o escribe se refiere a sí misma más otra u otras personas");
        diccionario.put("arbol","Planta de tronco leñoso, grueso y elevado que se ramifica a cierta altura del suelo formando la copa.");
        diccionario.put("cayo","Moverse [algo o alguien] desde arriba hacia abajo por la acción de su propio peso.");
        diccionario.put("y","Vigésima sexta letra del alfabeto español");
        diccionario.put("murio","Dejar de vivir o perder la vida una Persona ");
        diccionario.put("nada","Ninguna cosa.");
        Mapa.diccionario(diccionario,oracion);
    }

    }
