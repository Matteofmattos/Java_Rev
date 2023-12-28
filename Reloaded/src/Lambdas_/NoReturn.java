package Lambdas_;

import static java.lang.System.out;

public class NoReturn {

    public static void main(String[] args) {
        MyEventConsumer myEventConsumer = (s) -> {
            out.printf("%s", s);
        };

        MyEventConsumer myEventConsumer1 = out::println;

        myEventConsumer.consumer("Matheus ");

        myEventConsumer1.consumer("Felipe");

        MyFcuntionReturn<Integer> myFcuntionReturn = (s) -> {
            out.println("Tranformando em String...");
            return String.valueOf(s + 1);

        };

        out.printf("%s ",myFcuntionReturn.consumer(2));

    }
}
