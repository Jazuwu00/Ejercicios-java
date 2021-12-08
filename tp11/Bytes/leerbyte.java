package tp11.Bytes;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class leerbyte {
    public static void escribirbye() throws IOException {
        FileOutputStream leer = new FileOutputStream("SI.txt", false);
        String texto = "Hola profe que tal";
        byte[] texByte = texto.getBytes(StandardCharsets.UTF_8);
        leer.write(texByte);
        leer.flush();
        leer.close();
    }
    public static void envuelto() throws IOException {
        FileOutputStream l = new FileOutputStream("x.txt", false);
        DataOutputStream en = new DataOutputStream(l);
        en.writeInt(1);
        en.writeBoolean(false);
        en.writeFloat(3f);
        en.flush();
        en.close();
    }

    public static void leerBY() throws IOException {
        FileInputStream l = new FileInputStream("x.txt");
        DataInputStream le = new DataInputStream(l);
        int uno = le.readInt();
        boolean dos = le.readBoolean();
        float tres = le.readFloat();
        System.out.println(uno+"\n"+dos+"\n"+tres);
        le.close();


    }
}
