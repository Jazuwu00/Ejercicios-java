package tp7.colabanco;

public class Main {

    public static void main(String[] args) {
        ColaDelBanco m = new ColaDelBanco();
        m.agregar(new Persona("laura", 12, 123));
        m.agregar(new Persona("maria", 14, 323));
        m.agregar(new Persona("jimena", 23, 123));
        m.agregar(new Persona("gisel", 1, 124));
        m.agregar(new Persona("jazmin", 13, 124));
        m.agregar(new Persona("ale", 65, 5455));
        m.Imprimir();
        System.out.println("Ya se esta atendiendo");
        m.atender();
        m.Imprimir();

    }
}