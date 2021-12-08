package tp11.PrintSca;

import java.io.*;
import java.util.Scanner;

public class PrintScanner {
    public static void crearyenvolver() throws IOException {
        FileWriter leer =new FileWriter("Buenas.txt",false);
        PrintWriter print =new PrintWriter(leer);
        print.println("Hola");
        print.println("buenas tardes");
        print.flush();
        print.close();
    } public static void LeerS() throws IOException {
        FileReader filein = new FileReader("Buenas.txt");
        Scanner filescanner= new Scanner(filein);
        try{
            while (filescanner.hasNext()) {
                String linea = filescanner.nextLine();
                System.out.println(linea);
            }
        } finally {
            filein.close();
        }
    }

}
