package Exceptionss.Exe02;

public class ClientDao {
    static boolean iscadastrado=false;
    public static String Localizar(String cpf) throws CustomerNotFoundException{
        if (!iscadastrado){
            throw new CustomerNotFoundException("Cliente não encontrado em DAO.");
        } else {
            return "Cliente encontrado!";
        }
    }
}
