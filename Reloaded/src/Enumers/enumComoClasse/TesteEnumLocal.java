package Enumers.enumComoClasse;

public class TesteEnumLocal {

    public static void main(String[] args) {

        EnumLocal enumLocal = new EnumLocal("Matheus");

        System.out.println((enumLocal.getNome()));

        EnumLocal.Genero genero = EnumLocal.Genero.Masculino;

        System.out.println(genero);
        System.out.println(genero.getValor());
    }
}
