package tp4.pregunta;

public class Pregunta {

    //Cuál es la diferencia entre sobrecargar (overload) y sobreescribir (override) ?
    //sobreescribir:es redefinir un metodo en alguna clase hija ej: se crea un metodo
    //sobrecargar: Son métodos en una clase que pueden tener el mismo nombre.
    // Estos métodos deben contar con diferentes argumentos.

    //ej:sobrecargar

    public void metodo(String n) {
        System.out.println("");
    }

    public void metodo() {
        System.out.println("");
    }

    //ej: sobreescribir
    public void sobreescribir() {
        System.out.println("sobreescritura");
    }
}
