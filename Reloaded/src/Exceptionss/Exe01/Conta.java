package Exceptionss.Exe01;
public class Conta  {
    public static void sacar(Double value) throws LimiteSaqueException{
        if (value>400){
            throw new LimiteSaqueException("O valor é superior ao permitido.");
        } else {
            System.out.println("Saque realizado com sucesso");
        }
    }
}
