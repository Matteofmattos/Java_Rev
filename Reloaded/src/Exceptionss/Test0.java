package Exceptionss;

public class Test0 {

    public static void main(String[] args) {

        String nome = null;

        try {
            String nomeMaiusculo = nome.toUpperCase();
        } catch (NullPointerException e){
            System.out.println(e);
        } finally {
            nome = "Frase aleatória".toUpperCase();
            System.out.println(nome);
        }
    }
}
