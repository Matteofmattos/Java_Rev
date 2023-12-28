package Generics.inicio;

import java.util.ArrayList;
import java.util.List;

public class DemoBasic {

    public static void main(String[] args) {
        List<String> lista0 = new ArrayList<>(List.of("Matheus","Felipe"));

       boolean resp =  adicionar(lista0, 557L);

        System.out.println(lista0);

        /*
        for (String value: lista0){
            System.out.println(value);
        }**/

    }

    public static boolean adicionar(List lista,Long l){
        return lista.add(l);   // O código compila, pois o java não sabe em tempo de compilação que a lista é do tipo de String.
    }

    // Isso se deve ao fato das versões anteriores do Java. Ele enxerga apenas como um List = arrayList();
}
