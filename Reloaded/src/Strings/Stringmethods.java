package Strings;


public class Stringmethods {

    static String nome = "    Luffy Zaua      ";

    public static void main(String[] args) {


        System.out.println(nome.length());
        System.out.println(nome.charAt(4));
        System.out.println(nome.replace(" ","-"));
        String[] words = nome.split(" ");
        String[] letras = nome.split("");

        System.out.println(words[0]);

        for (String word: words) System.out.println(word);
        for (String letra: letras) System.out.println(letra);

        System.out.println(nome);
        System.out.println(nome.trim());


        char[] caracteres = {'m','a','t','h','e','u','s'};
        String nome = new String(caracteres,0,caracteres.length);
        System.out.println(nome);
        System.out.println("\n");


        String ola1 = "Olá";
        String ola2 = "OLÁ";
        String ola3 = "Olá";
        String ola4 = new String(ola1);


        System.out.println("ola1 e ola2 são iguais?  "+ ola1.equalsIgnoreCase(ola2));
        System.out.println("ola1 e ola3 são iguais? "+ (ola1==ola3));  //Piscina de strings
        System.out.println("ola1 e ola4 são iguais ? "+ (ola1==ola4)); // Referência diferente
        System.out.println("ola1 e ola4 são iguais ? "+ (ola1.equals(ola4))); //Verifica o valor em si

        String banana = "banana";
        String ana = "Ana";
        String ban = "Ban";
        String ban2 = "Ban";

        System.out.println(banana.regionMatches(1,ana,0,ana.length()));

        System.out.println(banana.regionMatches(true,1,ana,0,ana.length()));

        System.out.println(banana.startsWith(ban)); // No ignore case...
        System.out.println(banana.endsWith(ana));// No ignore case...


        System.out.println(ana.compareTo(ban));
        System.out.println(ban2.compareTo(ban));

        System.out.println(banana.indexOf("n")); // primeira vez que aparece na string
        System.out.println(banana.lastIndexOf("n")); // última vez que aparece na string
        System.out.println(banana.contains("ana"));

        System.out.println(banana.substring(1,4));
        System.out.println(ban.concat(ana.toLowerCase()));

        String var = " i s p a ç o";

        String new_var = var.replace('i','e');
        System.out.println(new_var);
        System.out.println(new_var.replaceAll(" ",""));

        String alfabeto = String.join(",","A","B","C","D");
        System.out.println(alfabeto);

        String arquivo = "1;M;Antônio;30;4500";
        String[] dados = arquivo.split(";");

        for (String dado : dados){
            System.out.printf(dado+" ");
        }



    }
}
