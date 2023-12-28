package Lambdas_;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

public class TestLambdas {
    public static void main(String[] args) {

        System.out.println("------*** IntBinaryOperator ***--------\n");

        IntBinaryOperator intBinaryOperator = Integer::sum; //Refrência de método static;

        System.out.println(intBinaryOperator.applyAsInt(2,1));

        System.out.println("------*** BiFunction ***--------\n");

        BiFunction<Integer,Integer,Integer> biFunction = (Integer a, Integer b)->{
            return a -b;
        };

        System.out.println(biFunction.apply(12,5));

        Runnable hello_world = () -> System.out.println("hello world!");
        hello_world.run();

        Consumer<String> stringConsumer = System.out::println; //Refrência de método static;

        stringConsumer.accept("valor passado.");

        Supplier<Integer> integerSupplier = () -> 42;

        System.out.println(integerSupplier.get());

        System.out.println("-----------*** Simplificando uma thread ***------------\n");

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando r...");
            }
        };

        new Thread(r).start();

        Runnable rLambda = () -> System.out.println("Executando rLambda..."); // Implementatção local.
        new Thread(rLambda).start();

        // ou...

        new Thread(() -> System.out.println("Executando rLambda simplificado...")).start();

    }
}
