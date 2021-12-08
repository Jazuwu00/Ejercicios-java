package tp7.abstractos;

public class Main {

    public static void main(String[] args) {
        Clase2 lista = new Clase2();
        Objetodeclase2 uno = new Objetodeclase2("uwu");
        Objetodeclase2 otro = new Objetodeclase2("uwu");
        lista.agregar(uno);
        lista.agregar(new Objetodeclase2("uwu"));
        lista.Imprimir();
        System.out.println(lista.pertenece(uno));
        System.out.println(lista.pertenece(otro));
        System.out.println("Lista de Integer");
        Clase1 uwu = new Clase1();
        Integer wu = 2;
        Integer nopar = 3;
        Float fl = 2f;
        uwu.agregar(wu);
        uwu.agregar(fl);
        uwu.agregar(nopar);
        uwu.Imprimir();
        System.out.println(uwu.pertenece(nopar));
        System.out.println(uwu.pertenece(wu));
        System.out.println(uwu.pertenece(fl));


    }
}