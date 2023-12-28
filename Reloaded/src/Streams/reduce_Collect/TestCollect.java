package Streams.reduce_Collect;

import java.util.*;
import java.util.stream.Collectors;

public class TestCollect {   // O collect se aplica a objetos mutáveis!

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,5,2,6,2,6,2,12,5,2,45);

        //collect = numbers.stream().collect(//supplier - acumulator - combiner//);
        List<Integer> collect = numbers.stream().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        List<Integer> collect1 = numbers.stream()
                        .collect(()->new ArrayList<>(),(l,n1)->l.add(n1),(l1,l2)->l1.addAll(l2));

        System.out.println(collect);
        System.out.println(numbers);
        System.out.println(collect1);

        System.out.println("\n-------------*** Collectors prontos ***---------------\n");
        List<String> collect2 = numbers.stream()
                .filter((s)->s%2==0)
                .sorted()
                .distinct()
                .map(Object::toString)
                .collect(Collectors.toList());
        System.out.println(collect2);

        String collect3 = numbers.stream()
                .map(Object::toString)
                .distinct().collect(Collectors.joining());
        System.out.println(collect3);

        Double collect4 = numbers.stream()
                .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(collect4);

        Long collect5 = numbers.stream().collect(Collectors.counting());
        System.out.println(collect5);

        numbers.stream()
                .collect(Collectors.maxBy(Comparator.naturalOrder()))
                .ifPresent(System.out::println);

        numbers.stream()
                .collect(Collectors.minBy(Comparator.naturalOrder()))
                .ifPresent(System.out::println);

        Map<Integer, List<Integer>> collect6 = numbers.stream()
                .distinct().collect(Collectors.groupingBy((n) -> n % 2));
        System.out.println(collect6);

    }
}
