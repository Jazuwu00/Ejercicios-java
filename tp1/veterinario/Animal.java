package tp1.veterinario;

public class Animal {
    private String especie;
    private float peso;
    private String nombre;
    private int edad;

    public Animal(String especie, float peso, String nombre, int edad) {
        this.especie = especie;
        this.peso = peso;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void ruido() {
        if (getEspecie().equals("Gato")) {
            System.out.println("miau");
        } else if (getEspecie().equals("Perro")) {
            System.out.println("guau");
        } else {
            System.out.println("El Animal no ladra ni maulla");
        }
    }

    public void describir() {
        System.out.println("Me llamo " + getNombre() + " y soy un " + getEspecie() + "\ntengo " + getEdad() + " anios, peso " + getPeso() + " kilos");
    }

    public void comer(Alimento ali) {
        if (ali.getEspecie().equals(especie)) {
            System.out.println("Mi anterior peso era de " + getPeso() + " kilos");
            this.setPeso(ali.getPeso() + this.getPeso());
            System.out.println("y ahora que comi, peso " + getPeso() + " kilos");
        } else {
            System.out.println("Este Animal no puede comer este tipo de comida");
        }
    }
}