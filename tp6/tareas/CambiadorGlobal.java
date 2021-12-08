package tp6.tareas;

public class CambiadorGlobal extends Proceso implements Tarea {
    public int variableglobal = 500;
    private int variablenueva;

    public CambiadorGlobal(String nombre, int variablenueva) {
        super(nombre);
        this.nombre = nombre;
        this.variablenueva = variablenueva;
    }


    public void ejecutar() {
        modificar();
    }

    public String getNombre() {
        return nombre;
    }

    public void modificar() {
        setVariableglobal(variablenueva);
        System.out.println("La variable local se ha modficado  a : " + getVariableglobal());
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVariableglobal() {
        return variableglobal;
    }

    public void setVariableglobal(int variableglobal) {
        this.variableglobal = variableglobal;
    }

    public int getVariablenueva() {
        return variablenueva;
    }

    public void setVariablenueva(int variablenueva) {
        this.variablenueva = variablenueva;
    }
}
