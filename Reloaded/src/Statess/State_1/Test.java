package Statess.State_1;

public class Test {
    public static void main(String[] args) {
        ShoppingOrder shopOrder = new ShoppingOrder();

        System.out.println(shopOrder.GetStatus());
        System.out.println("--------------------------");
        shopOrder.approvePaymentOrder(); // aletrou status para confirmado.
        shopOrder.approvePaymentOrder();
        shopOrder.shipOrderShopping();
        System.out.println("--------------------------\n");

        shopOrder.rejectPaymentOrder(); // altera status para rejeitado.
        shopOrder.rejectPaymentOrder();
        shopOrder.shipOrderShopping();
        System.out.println("--------------------------\n");

        shopOrder.waitPaymentOrder(); // altera status para pendente.
        shopOrder.waitPaymentOrder();
        shopOrder.shipOrderShopping();
        System.out.println("--------------------------\n");
    }
}
