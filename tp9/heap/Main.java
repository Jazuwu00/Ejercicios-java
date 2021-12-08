package tp9.heap;

public class Main {

    public static void main(String[] args) {
        //Tres variables con tres objetos distintos
        Objeto p = new Objeto("iris");
        Objeto p2 = new Objeto("gisela");
        Objeto p3 = new Objeto("irna");
        //Tres variables que apuntan al mismo Objeto
        Objeto pp = p;
        Objeto q = p;
        Objeto s = p;
        //Una variable que tiene tres objetos distintos sucesivos
        Objeto tessucesivo = p2;
        tessucesivo = p;
        tessucesivo = p3;
        //Un Objeto que luego sera colectado por el recolector de basura (garbage collector - GC)
        Objeto basura;
        //1000 objetos que no serán colectados por el GC
        Objeto mil = new Objeto();
        // mil.CicloMil();
        //Luego eliminar la referencia a estos 1000 objetos. Llamar al  GC manualmente.
        // mil.borrar();
        //Un código sin fin (while true) que se detenga por un error de memoria insuficiente (OutOfMemoryError)
        mil.OutOfMemoryError();
    }

}
