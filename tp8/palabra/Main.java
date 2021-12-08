package tp8.palabra;

public class Main {

    public static void main(String[] args) {
        String oracion = "Hola buenas tardes me llamo jazmin buenas tardes";
        System.out.println("");
        System.out.println(Palabras.palabras(oracion));
        System.out.println("");
        System.out.println(Palabras.palabrasOrdenadas(oracion));
        System.out.println("");
        System.out.println(Palabras.palabrasxNum(oracion));


    }
}