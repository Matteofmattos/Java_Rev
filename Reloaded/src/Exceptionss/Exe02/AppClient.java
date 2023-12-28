package Exceptionss.Exe02;

import javax.swing.*;

public class AppClient {

    public static void main(String[] args) {
        String cpf = JOptionPane.showInputDialog(null,
                "Digite o cpf do cliente","Menu inicial",JOptionPane.INFORMATION_MESSAGE);

        try {
            ClienteService.ConsultarCliente(cpf);
        } catch (ClienteNotFoundException2Service e) {
            e.printStackTrace(); // Toda a rastreabilidade do erro.
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
