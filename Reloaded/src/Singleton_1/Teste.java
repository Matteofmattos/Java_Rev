package Singleton_1;

public class Teste {

    public static void main(String[] args) {
        //Singleton singleton = new Singleton();  // Não pode acontecer, por isso o construtor deve ser private!
        //System.out.println(singleton);

        System.out.println("Referência instância 1: "+Singleton.getSingleton());
        System.out.println("Referência instância 2: "+Singleton.getSingleton());

    }


}
