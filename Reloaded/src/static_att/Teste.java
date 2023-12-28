package static_att;

public class Teste {

    public static void main(String[] args) {

        Cor cor1 = new Cor("Azul");
        Cor cor2 = new Cor("Vermelho");
        Cor cor3 = new Cor("Preto");


        System.out.println("Objeto cor1: "+cor1.getCor());
        System.out.println("Objeto cor2: "+cor2.getCor());
        System.out.println("Objeto cor3: "+cor3.getCor());

        cor3.trocaCor("Lilás");

        System.out.println("Objeto cor1: "+cor1.getCor());
        System.out.println("Objeto cor2: "+cor2.getCor());
        System.out.println("Objeto cor3: "+cor3.getCor());

    }



}
