package Exceptionss.Exe02;

public class ClienteService {

    public static void ConsultarCliente(String cpf) throws ClienteNotFoundException2Service {
        try {
            ClientDao.Localizar(cpf);
        } catch (CustomerNotFoundException e) {
            throw new ClienteNotFoundException2Service(e.getMessage(),e);
        }
    }

}
