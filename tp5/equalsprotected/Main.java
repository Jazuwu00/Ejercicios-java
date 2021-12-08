package tp5.equalsprotected;

public class Main {

    public static void main(String[] args) {
        Animal a = new Animal("Gato", 2);
        Animal p = new Animal("Gato", 2);
        System.out.println(a.equals(p));
        p.alimentar(2);
        System.out.println("peso actual del Animal p: " + p.getPeso());
        System.out.println(a.equals(p));

    }
}
