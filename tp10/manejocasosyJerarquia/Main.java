package tp10.manejocasosyJerarquia;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        /*List<Integer> positivos = new ArrayList<>();
        positivos.add(2);
        positivos.add(9);
        positivos.add(1);
        int resultado = listaPositiva(positivos);
        System.out.println(resultado);*/

        //Manejo de casos inesperados y Jerarquía de excepciones
        try {
            List<Persona> listap = new ArrayList<>();
            Persona s = CasosInesperados.funcionPersona(12, 43, "laura");
            Persona ss = CasosInesperados.funcionPersona(16, 18, "ana");
            Persona sss = CasosInesperados.funcionPersona(16, 21, "lila");
            // Persona menor = CasosInesperados.funcionPersona(16, 12, "la");
            CasosInesperados.agregarpersona(s, listap);
            CasosInesperados.agregarpersona(ss, listap);
            CasosInesperados.agregarpersona(sss, listap);
            //CasosInesperados.agregarpersona(menor, listap); exception Persona menor
            // CasosInesperados.agregarpersona(ss, listap); exception Persona ya existe
            CasosInesperados.ImprimirLista(listap);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }


}
