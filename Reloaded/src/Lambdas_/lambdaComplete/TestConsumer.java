package Lambdas_.lambdaComplete;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        List<Integer> squaredList = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i=0;i<=10;i++){
            values.add(i);}
        System.out.println(values);


        System.out.println("-----------*** CONSUMER ***-------------------\n");

        Consumer<Integer> intConsumerSquared = (s)->{  // Consumer é uma interface funcional.
            squaredList.add(!(s % 2 == 0) ? (int) Math.pow(s, 2) : s);
        };

        values.forEach(intConsumerSquared); // Foreach sempre recebe um consumer;
        System.out.println(squaredList);

        Consumer<Integer> intConsumerPar = (s)->{ if (s%2==0) pares.add(s);};

        values.forEach(intConsumerPar); // Foreach sempre recebe um consumer;
        System.out.println(pares);

        Consumer<Integer> intConsumerImpar = (s)->{ if (s % 2 != 0) impares.add(s);};

        values.forEach(intConsumerImpar); // Foreach sempre recebe um consumer;
        System.out.println(impares);

    }
}
