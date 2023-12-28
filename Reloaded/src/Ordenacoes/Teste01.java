package Ordenacoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Teste01 {

    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(List.of("Jujutsu Kaisen", "Fairy Tail", "Bleach", "Attack on Titan",
                "Pokemon"));

        List<Double> valores = new ArrayList<>(List.of(22.1,44.9,35d,253.5,12.4));
        Collections.sort(mangas);
        Collections.sort(valores);

        for (String manga: mangas){
            System.out.println(manga);
        }

        for (Double valor: valores){
            System.out.println(valor);
        }

        System.out.println("--------*** Comparando classes ***--------------\n");
        //Manga manga = new Manga(null,"Bersek",44.3);
        //System.out.println(manga.toString());

        List<Manga> mangasList = new ArrayList<>();
        mangasList.add(new Manga(36231,"Bersek",14.5));
        mangasList.add(new Manga(67353,"Attack On Titan",22.49));
        mangasList.add(new Manga(63522,"Dragon Ball Z",11.5));
        mangasList.add(new Manga(13432,"Pokemon GO",19.9));
        mangasList.add(new Manga(97456,"Jujutsu Kaisen zero",24.5));

        System.out.println("Comparando pelo nome. (Comparable )");
        Collections.sort(mangasList);
        for (Manga manga : mangasList) System.out.println(manga);


        //  comparator sobrescreve o comparable.
        System.out.println("Comparando pelo preço. (Comparator )");
        mangasList.sort(new MangaByComparator());
        for (Manga manga : mangasList) System.out.println(manga);
    }
}

class MangaByComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return (o1.getPreco() < o2.getPreco()) ? -1 : ((o1.getPreco() == o2.getPreco()) ? 0 : 1);
    }
}

