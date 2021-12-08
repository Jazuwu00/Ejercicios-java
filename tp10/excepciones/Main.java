package tp10.excepciones;

public class Main {

    public static void main(String[] args) throws Exception {
        arit();
    }
    public static int error()  {
        int num = 0;
        return  8 / num;

    }

    public static void arit() throws Exception {
        try {
            int resultado = error();
        }
         catch (Exception e) {
             throw new Exception("error de Aritmetica");
            //System.out.println("ha ocurrido un error");
        }
    }
}
