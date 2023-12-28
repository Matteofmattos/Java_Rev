package operadorTernario;

public class Teste {

    // boolean variavel = (expressão) ? Valor se for verdadeiro : valor se for falso

    public static void main(String[] args) {
        String b;

        b = (6>=9) ? "Verdadeiro": "falso";

        System.out.println("Resposta: "+b);

        int a = 15;

        String resp = (a>15) ? "Atrasado." : (a==15) ? "No horário" : "Adiantado";

        System.out.println("SITUAÇÃO: "+resp);

        int resultado = (2 > 1) ? 1 : ((2 == 1) ? 0 : -1);
        System.out.println(resultado);
    }
}
