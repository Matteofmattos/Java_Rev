package Final;

public final class ClasseTest {  // classes finais não podem ser herdadas.

    public static final String NOME_IMUTAVEL = "Marcelo";  //Constantes tem caixa alta e _.

    public final void imprimeTexto(){  // O final não permite override desse método. 
        System.out.println(NOME_IMUTAVEL);

    }
}


