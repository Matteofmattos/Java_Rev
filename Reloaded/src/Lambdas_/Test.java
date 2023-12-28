package Lambdas_;

public class Test {

    public static void main(String[] args) {
        System.out.println("\n---------*** //Refrência de método static ***-------------\n");

        Finder finder = Myclass::doFind;
        System.out.println(finder.find("Matheus","Felipe"));


        System.out.println("-----*** // Refrência de método em construtores ***------\n");
        Factory factory = String::new;
        String t1 = factory.create("olá");

        //ou...

        Factory factory2 = s -> new String(s);
        String t2 = factory2.create("olá");

        System.out.println(t1.equals(t2));
    }
}
