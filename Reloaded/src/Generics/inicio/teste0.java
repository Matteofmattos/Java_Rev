package Generics.inicio;

public class teste0 {

    public static void main(String[] args) {

        Generica<Integer> instancia0 = new Generica<>(5);

        System.out.println(instancia0.getValue());

        instancia0.print(19);

    }
}
