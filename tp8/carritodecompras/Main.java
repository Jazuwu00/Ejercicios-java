package tp8.carritodecompras;

import tp8.comparator.CarritosC;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ordenado por id");
        Carritodecompras s = new Carritodecompras();
        s.agregarProducto(new Producto("leche", 353), 3);
        s.agregarProducto(new Producto("agua", 345), 5);
        s.agregarProducto(new Producto("Arroz", 3435), 6);
        s.agregarProducto(new Producto("queso", 43245), 8);
        s.Impimir();
        System.out.println("Ordenado por nombre");
        CarritosC b = new CarritosC();
        b.agregarProducto(new Producto("leche", 353), 3);
        b.agregarProducto(new Producto("agua", 345), 5);
        b.agregarProducto(new Producto("Arroz", 3435), 6);
        b.agregarProducto(new Producto("queso", 43245), 8);
        b.Impimir();

    }

}
