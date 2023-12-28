package Lambdas_.lambdaComplete;

import java.util.List;
import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {
        Function<String,Integer> stringSize = String::length; // Método de referência;

        System.out.println(stringSize.apply("Matheus"));

        Person pessoa = new Person();
        List<Person> pessoas = pessoa.popular();

        Function<Person,Integer> function = Person::getAge;
        for ( Person person: pessoas) {
            System.out.println(function.apply(person));
        }
    }
}
