package tp11.caracteres;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Carácteres {

    public static void EscribirFw() throws IOException {
        FileWriter fileWriter = new FileWriter("hola.txt", false);
        fileWriter.write(72);
        fileWriter.write(111);
        fileWriter.write(108);
        fileWriter.write(97);
        fileWriter.write(32);
        fileWriter.write(109);
        fileWriter.write(117);
        fileWriter.write(110);
        fileWriter.write(100);
        fileWriter.write(111);
        fileWriter.flush();
        fileWriter.close();
    }

    public static void leerFW() throws IOException {
        FileReader filein = new FileReader("hola.txt");
        try {
            while (true) {
                int b = filein.read();
                char c =(char) b;
                if (b == -1) break;
                StringBuilder texto = new StringBuilder();
                texto.append(c);
                System.out.println(texto);
            }
        } finally {

            filein.close();
        }
    }

}
