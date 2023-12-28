package Exceptionss.Exe01;

public class Test01 {

    public static void main(String[] args) {
        try {
            Conta.sacar(450d);
        } catch (NullPointerException e) {
            System.out.println("Erro inesperado: "+e.getMessage());
        } catch (LimiteSaqueException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de runTime: "+e.getMessage());
        } finally {
            System.out.println("Até a próxima!");
        }
    }
}
