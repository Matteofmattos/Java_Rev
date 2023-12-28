package Vargs;


public class TesteVarargas {

    public static void main(String[] args) {
        int[] vetor1 = {3, 3, 3, 3, 3, 3, 3, 3};

        System.out.println(somarArgs(2,5,5,3,8,1,54,7));
        System.out.println(somarArgs(vetor1));


        somatorioRags("Matheus","Felipe",1,5,3,6,3,6,7,88);
    }

    public static int somarArgs(int...values) {
        int soma = 0;
        for (int value: values) soma += value;
        return soma;
    }

    public static void somatorioRags(String a,String b,int...values) {
        int soma = 0;
        for (int value: values) soma += value;
        System.out.println(a + " " +b + " - Soma: "+soma);

    }
}
