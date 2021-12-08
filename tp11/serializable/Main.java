package tp11.serializable;

import tp4.ABC.A;
import tp4.ABC.B;
import tp4.ABC.C;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<A> Abc = new ArrayList<>();
        Abc.add(new B(3));
        Abc.add(new C(3));
        Abc.add(new A(2));
        Abc.add(new B(1));
        try {
            //serializador
            ObjectOutputStream flujoObjetos= new ObjectOutputStream(new FileOutputStream(new File("fichero.bin")));
            flujoObjetos.writeObject(Abc);
            flujoObjetos.close();
            //leer deserializador
            File fichero = new File("fichero.bin");
            FileInputStream flujoFichero = new FileInputStream(fichero);
            ObjectInputStream deserializador = new ObjectInputStream(flujoFichero);
            List<A> devuelto = (List<A>) deserializador.readObject();
            deserializador.close();	//Finalmente se cierran los flujos de entrada
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
