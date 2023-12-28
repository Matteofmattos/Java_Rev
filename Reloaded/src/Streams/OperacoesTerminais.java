package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class OperacoesTerminais {

    public static void main(String[] args) {

        System.out.println("----*** ForEach ***-----\n");

        System.out.println("------ ** All names ** --------\n");
        List<Person> pessoas = new Person().popular();
        pessoas.forEach(person -> System.out.println(person.getName()));

        System.out.println("\n------ ** Brasilians ** --------");
        pessoas.stream().filter(person -> person.getNacionality().equals("Brasileiro.")).
                forEach(p-> System.out.println(p.getName()));

        System.out.println("\n------ ** All ages ** --------");
        pessoas.stream().mapToInt(Person::getAge).forEach(System.out::println);

        System.out.println("\n------ ** All ages ordered ** --------");
        pessoas.stream().sorted(Comparator.comparing(Person::getAge)).mapToInt(Person::getAge).
                forEach(System.out::println);

        System.out.println("\n ----- ** Counting Elements starting with 'M' ** ----- ");
        Long counting = pessoas.stream().filter(person -> person.getName().startsWith("M")).count();
        System.out.println(counting);

        System.out.println(" -----** Person older then  18 years **------ \n");
        boolean result = pessoas.stream().allMatch(person -> person.getAge() > 18);
        System.out.println(result);

        System.out.println(" -----** Collection **------ \n");
        List<Person> pessoasM = pessoas.stream().filter(person -> person.getName().startsWith("M"))
                .collect(Collectors.toList());

        pessoasM.forEach(s-> System.out.println(s.getName()+"\n"));

        pessoas.stream().filter(person -> person.getAge()>=30).
                collect(Collectors.toList()).forEach(s-> System.out.println(s.getName()));

        ArrayList<Person> pessoasAbove30 = pessoas.stream().filter(person -> person.getAge()>=30)
                .collect(Collectors.toCollection(ArrayList::new));

        pessoasAbove30.forEach(s-> System.out.println(s.getAge()));

        System.out.println("-----------*** ToMap ***------------------\n");
        Map<String,Integer> pessoasAbove30Map =  pessoas.stream().filter(person -> person.getAge()>=30)
                .collect(Collectors.toMap(Person::getName,Person::getAge));

        pessoasAbove30Map.forEach((s,k)-> System.out.println("Nome: "+s+" - Idade: "+k));

        System.out.println("-----------*** ToMap (Groupby) ***------------------\n");
        Map<String, List<Person>> nationalityGroups =  pessoas.stream()
        .collect(Collectors.groupingBy(Person::getNacionality));

        nationalityGroups.forEach((s,k)-> {
            System.out.printf("Nacionalidade: %s -> %s%n ",s,k);
        });

        System.out.println("\n-----*** Opcionais ***---------");
        Optional<Person> maxAge = pessoas.stream().max(Comparator.comparing(Person::getAge));
        maxAge.ifPresent(System.out::println); // utiliza o toString. Evita nullPointerException;


    }
}
