package Lambdas_.lambdaComplete;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.lang.System.out;

public class TestPredicate {

    public static void main(String[] args) {

        Person pessoa = new Person();
        List<Person> pessoas = pessoa.popular();
        List<Person> pessoas25 = new ArrayList<>();

        Predicate<Person> predicate = (s) -> {
            return s.getAge() > 25;
        };

        Consumer<Person> personAbove25Consumer = (s)-> {
            if (predicate.test(s)) { pessoas25.add(s); out.println(s);}
        };

        pessoas.forEach(personAbove25Consumer);
    }
}
