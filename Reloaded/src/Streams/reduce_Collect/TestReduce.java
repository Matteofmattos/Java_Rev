package Streams.reduce_Collect;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestReduce {  // O reduce trabalha com valores imutáveis, ou seja corre o risco de ocupar mais memória.

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,5,2,6,2,6,2,12,5,2,45);

        //As funções de associação abaixo passadas no reduce devem ser associativas!

        System.out.println("-------** Soma básica **--------------");
        numbers.stream().reduce(Integer::sum).ifPresent(System.out::println); // Método de referência.

        System.out.println("\n-------** Multiplicação básica **--------------");
        numbers.stream().reduce((x,y)-> x*y).ifPresent(System.out::println);
        Optional<Integer> result = numbers.stream().reduce((x, y)-> x*y);
        System.out.println("Multiplicação resgatando o optional: "+result.get());

        System.out.println("\n-------** Concatenação **--------------");
        String phrase = "Inscreva-se no canal e até mais!";
        String[] words = phrase.split(" ");
        List<String> phrase1 = Arrays.asList(words);
        phrase1.stream().reduce((x,y) -> x.concat(" "+y)).ifPresent(System.out::println);

        String reduce = numbers.stream().reduce(" ", (x, y) -> x.toString().concat(y.toString()),
                (x, y) -> x.concat(y));

        //O primeiro parâmetro é a identidade de inicio, o segundo é a função de acumulação, o terceiro é a combinação dos pequenos grupos ( Threads );

        System.out.println("Strings:"+reduce); // Aloquei uma transformação do map no reduce;

    }
}
