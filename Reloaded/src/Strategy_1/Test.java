package Strategy_1;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {

        BigDecimal value = new BigDecimal("100");
        Compra compra = new Compra(value);

        compra.processarCompra(new CreditCardPayment());
        compra.processarCompra(new DebitCardPayment());
    }
}
