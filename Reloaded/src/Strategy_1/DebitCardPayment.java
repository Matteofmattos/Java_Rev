package Strategy_1;

public class DebitCardPayment implements strategyPayment {

    @Override
    public void pay(pagavel compraType) {
        System.out.println("pagou "+compraType.getValue()+"no débito.");
        //getValue ( advindo da interface pagável ) é o único método que esta concreteStrategy tem acesso da classe compra.
    }
}
