package Wrappers;

// Nas classes wrappers, a quantidade de bits dos primitivos não se aplica, um int deve
//somente ser declarado em uma classe int,o mesmo vale para os demais.

public class wrappers {

    Integer value_Integer = 2;  //autoboxing

    int value_int = value_Integer;  // unboxing

    long value_long = value_Integer.longValue();  // faz apenas um casting

    Integer value_Integer2 = Integer.parseInt("2");
    Float value_Float = Float.parseFloat("2");  // Não se aplica ao character

    static boolean booleano1 = Boolean.parseBoolean("true");
    static boolean booleano2 = Boolean.parseBoolean("sas"); // retorna simplesmente false.


    public static void main(String[] args) {

        System.out.println(booleano1);
        System.out.println(booleano2);


        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('D'));


    }


}
