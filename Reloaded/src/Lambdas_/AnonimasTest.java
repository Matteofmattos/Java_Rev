package Lambdas_;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class AnonimasTest {
    public static void main(String[] args) {
        MyEventConsumer myEventConsumer = new MyEventConsumer() {
            @Override
            public void consumer(Object value) {
                System.out.println("Valor: "+value);
            }
        };

        myEventConsumer.consumer("Teste anônima. ");

        MyEventConsumer myEventConsumerLambda = (Object value)-> System.out.println("Olá! "+value);

        myEventConsumerLambda.consumer("Teste Lambda. ");

        System.out.println(myEventConsumerLambda.calcula(2)); // Método default;

        System.out.println("----*** utilizando uma função local ***-----\n");

        receberInterface((Object value)-> System.out.println("Olá!"+value),"Mateus Felipe");


        System.out.println("----------** utilizando listas **----------------\n");

        List<Integer> lista = Arrays.asList(2,4,1,5,6,3,7,12,20,35,70);
        System.out.println("\nMultiplicando todos os elementos por 5...");
        realizeOperation(lista,(n)->n*5);

        System.out.println("\nSomando a todos o valor 3...");
        realizeOperation(lista,(n)->n+3);

        System.out.println("\nElevando todos os valores ao quadrado...");
        realizeOperation(lista, new IntFunction<Integer>() {
            @Override
            public Integer apply(int value) {
                return (int) Math.pow(value,2);
            }
        });

        System.out.println("\n Captura os multiplos de 5...");
        verificador(lista, (n)-> ( n % 5) == 0);
    }

    private static void verificador(List<Integer> lista2, Predicate<Integer> predicate) {
        lista2.forEach(n -> {
            if (predicate.test(n)){
                System.out.printf("%d %s",n," ");
            }
        });

    }

    private static void receberInterface(MyEventConsumer lambda,Object v1) {
        lambda.consumer(v1);
    }

    private static void realizeOperation(List<Integer> list1, IntFunction<Integer> function){
        list1.forEach((n) -> {
            n = function.apply(n);
            System.out.printf("%d %s",n," ");
        });
    }


}