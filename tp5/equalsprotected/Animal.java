package tp5.equalsprotected;

public class Animal {
    protected String especie;
    protected int peso;
    private static int cantidadLlamados;

    public Animal(String especie, int peso) {
        this.especie = especie;
        this.peso = peso;
    }

    public void alimentar(int peso){
        cantidadLlamados++;
     this.peso+= peso;
}

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public static int getCantidadLlamados() {
        return cantidadLlamados;
    }

    public static void setCantidadLlamados(int cantidadLlamados) {
        Animal.cantidadLlamados = cantidadLlamados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return this.peso == animal.peso && this.especie == animal.especie;
    }


}
