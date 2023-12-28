package Generics.completo;

import java.util.ArrayList;
import java.util.List;

public class Teste2 {
    public static void main(String[] args) {

        List<Cachorro> cachorros = new ArrayList<>(List.of(new Cachorro("Husky siberiano","Marco"),new Cachorro("Boder Collie","Tulio")));

        consultar(cachorros);

        List<Gato> gatos = new ArrayList<>(List.of(new Gato("Miatzu","Marcello"),new Gato("Maine Coon","Tigre")));

        List<Animal> animais = new ArrayList<>(List.of(new Cachorro("Husky siberiano", "Marco"),
                new Gato("Maine Coon", "Ceaser")));

        consultar(gatos);

        adiciona(cachorros);

        consultaAdiciona(animais);
    }

    private static void consultar(List<? extends Animal> animais) {  // Não permitirá inserção de elementos.
        System.out.println("----------------------------------\n");
        System.out.println("Utilizando o método consultar...");
        for (Animal animal: animais){
            animal.consulta();
        }
        System.out.println("----------------------------------\n");
    }

    private static void adiciona(List<? super Cachorro> cachorrosList) {  // Não permitirá inserção de elementos.
        System.out.println("----------------------------------\n");
        System.out.println("Utilizando o método adiciona (apenas cachorros)...");
        cachorrosList.add(new Cachorro("Shitzu","Nina"));
        System.out.println("----------------------------------\n");
    }

    private static void consultaAdiciona(List<Animal> animais){
        System.out.println("----------------------------------\n");
        System.out.println("Utilizando o método geral...");

        animais.add(new Cachorro("Shitzu","Nina"));
        animais.add(new Gato("Tirix","Sebastian"));

        for (Animal animal: animais){
            animal.consulta();
        }

        System.out.println("----------------------------------\n");
    }

}


