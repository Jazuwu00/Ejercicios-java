package tp1.veterinario;

public class Alimento {
    private String especie;
    private String nombre;
    private float peso;

    public Alimento(String especie, String nombre, float peso) {
        this.especie = especie;
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }


}
