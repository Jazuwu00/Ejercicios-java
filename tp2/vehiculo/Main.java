package tp2.vehiculo;

public class Main {

    public static void main(String[] args) {
        Auto a = new Auto("to", 4, "Volkswagen", 4, "diesel", "automatica");
        System.out.println(a.toString());
        Moto b = new Moto("aa", 2, "keller crono", "107mm", "2.50 x 17", "monocilindrico");
        System.out.println(b.toString());
    }
}
