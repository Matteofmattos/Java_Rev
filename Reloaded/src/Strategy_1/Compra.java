package Strategy_1;

import java.math.BigDecimal;

// Contexto, responsável por passar os dados. Não depende das classes concretas.
public class Compra implements pagavel{

    BigDecimal valor;
    int id;
    int code;
    String storeAdress;

    public int getId() {
        return id;
    }

    public Compra(BigDecimal value) {
        this.valor=value;
    }

    public void processarCompra(strategyPayment cardPayment) {
        cardPayment.pay(this); // cardPayment é o parâmetro estratégico.
    }

    @Override
    public BigDecimal getValue() {
        return this.valor;
    }
}
