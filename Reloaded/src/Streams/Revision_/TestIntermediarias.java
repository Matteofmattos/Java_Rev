package Streams.Revision_;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.pow;

public class TestIntermediarias {
    //Utilizando Streams do Java 8, raramente será necessário que você faça um loop explícito novamente, como for, while ou do...while.
    //A API de streams utiliza loops implícitos,é um fluxo de dados implícito.

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,4,2,6,2,6,3,5);

        for (Integer integer : lista){
            System.out.printf("%d ",integer);
        }

        System.out.println();
        lista.stream().skip(4).forEach(s -> System.out.printf("%d ",s));
        System.out.println();
        lista.stream().limit(2).forEach(s -> System.out.printf("%d ",s));
        System.out.println();
        lista.stream().distinct().forEach(s -> System.out.printf("%d ",s)); //Requer hashCode e equals;
        System.out.println();
        lista.stream().distinct().filter(s-> s>5).forEach(x -> System.out.printf("%d ",x));
        System.out.println();
        lista.stream().map(e ->((int) pow(e, 2))).forEach(s -> System.out.printf("%d ",s));
        System.out.println();
        lista.stream().sorted().forEach(z -> System.out.printf("%d ",z));
        System.out.println();
        lista.stream().reduce(Integer::sum).ifPresent(System.out::println);
        lista.stream().reduce((x,y)->x*y).ifPresent(System.out::println);
        lista.stream().reduce(Integer::max).ifPresent(System.out::println);
    }
}
