package Strings;

public class StringsPool {

    public static void main(String[] args) {

        String nome = "Matteo";  //"Matteo" cai no pool de strings.
        String nome2 = "Matteo";

        System.out.println(nome == nome2); // Analisa a referência no pool de Strings.
        System.out.println(nome.equals(nome2));

        nome = nome.concat("Mattos");

        System.out.println(nome == nome2);
        System.out.println(nome.equals(nome2));

        String nome3 = new String("Matteo"); // É criado outro objeto no heap.
        String nome4 = new String("Matteo");


        
        System.out.println(nome4 == nome3);
        System.out.println(nome4 == nome3.intern());

        System.out.println(nome4.intern()==nome3.intern());
        System.out.println(nome4.intern().equals(nome3.intern()));




    }
}
