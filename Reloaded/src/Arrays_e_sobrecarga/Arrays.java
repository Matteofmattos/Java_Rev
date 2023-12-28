package Arrays_e_sobrecarga;

public class Arrays {

    static byte[] idades = new byte[5];
    static boolean[] booleanos = new boolean[1];
    static char[] chars= new char[2];

    public static void main(String[] args) {

        int resultado_inteiro = somar(5,2,8,1,9);
        System.out.println(resultado_inteiro);

        double resultado_double = somar(5.4,2.1,8.0,1.9,9.5);
        System.out.println(resultado_double);

        


    }


    public static int somar(int... numeros) {

        int resposta = 0;

        for (int n: numeros ) resposta += n;

        return resposta;
    }

    public static double somar(double...numeros) {

        double resposta = 0;

        for (double n: numeros ) resposta += n;

        return resposta;
    }
}

