package formats;

public class StringsFormat {

    public static void main(String[] args) {

        System.out.printf("%s\n",toString("Matheus",'M',21,4500.833f));

        System.out.printf("%20S","hello,World!\n");
        System.out.printf("%C %n",'f');
        System.out.printf("Idade %d %n",21);
        System.out.printf("Salário R$ %.2f %n",4500.352743);
        System.out.printf("%015d %n",21);
        System.out.printf("Salário R$ %10.2f %n",4500.352743);
        System.out.println("\n");

        TesteCompleto();

    }


    public static String toString(String nome,char sexo,int idade,float salario){

        String result;

        result = String.format("Nome: %s\n",nome)+
                String.format("Sexo: %c\n",sexo)+
                String.format("Idade: %d\n",idade)+
                String.format("Salário: R$ %.2f\n",salario);

        return result;

    }

    public static void TesteCompleto(){

        float[] precos = {220,454,756,1000,75};

        for ( int i=0;(i<precos.length);i++){
            System.out.printf(" %s:  %03d - Valor R$ %8.2f %n","Item",
                    i+1,precos[i]);

        }
    }
}
