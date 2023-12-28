package Generics.completo;


import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        //Cachorro[] cachorros = {new Cachorro("Husky siberiano","Marco"),new Cachorro("Boder Collie","Tulio")};

        //consultarAnimaisArray(cachorros);

        Animal[] animais = {new Cachorro("Boder Collie","Billie"),new Gato("Sphinx","Draco")};

        consultarAnimaisArray(animais);  // O polimorfismo se aplica diretamente aos arrays, pois a jvm sabe exatamente o tipo de array em tempo de execução.

        List<Animal> cachorros = new ArrayList<>(List.of(new Cachorro("Husky siberiano", "Marco"),
                new Cachorro("Boder Collie", "Tulio")));

        consultarAnimaisList(cachorros);




    }

    public static void consultarAnimaisArray(Animal[] animais){  // o array é de cachorro, que é um animal...

        for (Animal animal: animais){
            animal.consulta();
        }

        animais[1] = new Gato("Vira-Lata","Miguel"); // Erro, pois Cachorro[] - Não seria erro se Animal[]
        animais[1].consulta();  // O arrayList permitiria adicionar elementos.
    }

    public static void consultarAnimaisList(List<Animal> animais){ // A list é de cachorro, mas deveria ser Também de animal, a jvm não sabe qual é qual e por isso informa erro.

        for (Animal animal: animais){    // Espere o erro, pois nas collections, a jvm não sabe exatamente qual o tipo da lista, então os tipos devem ser o mesmos, para executar em tempo de execução.
            animal.consulta();
        }

        animais.add(new Gato("Vira-lata","Alfred"));
        animais.get(2).consulta();

    }

}
