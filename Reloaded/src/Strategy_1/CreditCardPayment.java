package Strategy_1;

public class CreditCardPayment implements strategyPayment {

    @Override
    public void pay(pagavel paymentType) {
        System.out.println("Pagou "+paymentType.getValue()+"no crédito");
    } //getValue ( advindo da interface pagável ) é o único método que esta concreteStrategy tem acesso da classe compra.
}
