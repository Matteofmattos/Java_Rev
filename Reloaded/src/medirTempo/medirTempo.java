package medirTempo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class medirTempo {

   static  List<String> arrayList;
   static  List<String> listalinked;

    public static void main(String[] args) {
        long resultadoLinked = medirLinkedList();  // Muito mais lento;
        long resultadoArrayist = medirHashList();




        System.out.println("Resultado do LinkedList: "+resultadoLinked+"\n");
        System.out.println("Resultado do HashList: "+ resultadoArrayist);



    }

    private static long medirLinkedList() {
        listalinked = new LinkedList<>();

        long inicio = System.currentTimeMillis();

        long tamanho = 10000L;
        String value = "";

        for(long i=0;i<tamanho;i++){
            value+=String.valueOf(i);
            listalinked.add(value);
        }

        long fim = System.currentTimeMillis();

        long dois = System.currentTimeMillis();
        String s = listalinked.get(listalinked.size()-3);
        long tres = System.currentTimeMillis();

        long diferenca = tres-dois;

        System.out.println("Tempo do get LinkedList: "+ diferenca+"\n");

        return (fim-inicio);
    }

    private static long medirHashList() {

        arrayList = new ArrayList<>();

        long inicio = System.currentTimeMillis();
        long tamanho = 10000L;
        String value = "";

        for(long i=0;i<tamanho;i++){
            value+=String.valueOf(i);
            arrayList.add(value);
        }

        long fim = System.currentTimeMillis();

        long zero = System.currentTimeMillis();
        String s = arrayList.get(arrayList.size()-3);
        long um = System.currentTimeMillis();

        long diferenca = zero-um;

        System.out.println("Tempo do get arrayList: "+ diferenca+"\n");

        return (fim-inicio);
    }
}

