package tp9.heap;

public class Objeto {
    private String nombre;
    private int i;
    private Objeto perropareja;

    public Objeto(String nombre) {
        this.nombre = nombre;
    }

    public Objeto() {
    }

    public Objeto(int i) {
        this.i = i;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Objeto getPerropareja() {
        return perropareja;
    }

    public void setPerropareja(Objeto perropareja) {
        this.perropareja = perropareja;
    }

    public Objeto CicloMil() {
        Objeto perro = new Objeto();
        int num = 1;
        while (num < 1000) {
            Objeto pareja = new Objeto();
            perro.setPerropareja(pareja);
            num++;
        }
        return perro;
    }

    public void borrar() {
        Objeto perro = new Objeto();
        int num = 1;
        while (num < 1000) {
            perro = new Objeto();
            num++;
            System.gc();
        }
    }

    public void OutOfMemoryError() {
        int j = 1;
        try {
            while (true) {
                Objeto[] array = new Objeto[1000 * 1000 * 1000];
                array[j] = new Objeto();
                j++;

            }
        } catch (OutOfMemoryError e) {
            System.out.println("error: " + e.getMessage());
        }
    }


}
