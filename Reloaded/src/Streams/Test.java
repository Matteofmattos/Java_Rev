package Streams;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        List<Person> pessoas = new Person().popular();
        System.out.println(pessoas);

        Stream<Person> stream = pessoas.stream().filter(person -> person.getNacionality().equals("Brasileiro."));

        System.out.println(stream);

        Stream<Integer> streamAges = stream.map(Person::getAge);
        System.out.println(streamAges);

        IntStream streamAgesInt = pessoas.stream().mapToInt(Person::getAge);

        Stream<Person> streamOrded = pessoas.stream().sorted(Comparator.comparing(Person::getAge));

        pessoas.stream().
                sorted(Comparator.comparingInt(Person::getAge)).forEach(System.out::println);

        Stream<Person> streamDistinct = pessoas.stream().distinct();
        System.out.println(streamDistinct);


    }
}
