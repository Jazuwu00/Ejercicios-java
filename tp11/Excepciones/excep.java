package tp11.Excepciones;

import java.io.*;
import java.util.Scanner;

public class excep {
    public static void leerArchivo() {
        try {
            FileReader filein = new FileReader("uwu.txt");
            Scanner filescanner = new Scanner(filein);
            while (filescanner.hasNext()) {
                String linea = filescanner.nextLine();
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

    public static void escribirclose() {
        try {
            FileWriter leer = new FileWriter("Boo.txt", false);
            leer.write("Hola");
            leer.close();
            leer.write("buenas tardes");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
