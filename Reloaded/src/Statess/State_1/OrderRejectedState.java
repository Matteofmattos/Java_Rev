package Statess.State_1;

public class OrderRejectedState implements ShoppingOrderState{

    private final String statusName = "Order rejected...";

    private ShoppingOrder order;
    @Override
    public String getStatus() {
        return this.statusName;
    }

    @Override
    public void approvePayment(ShoppingOrder order) {
        order.setState(new OrderAcceptedState());
        System.out.println("Alterando para confirmado...\n");
    }

    @Override
    public void rejectPayment(ShoppingOrder order) {
        System.out.println("O pedido já se encontra rejeitado. \n");
    }

    @Override
    public void waitPayment(ShoppingOrder order) {
        order.setState(new OrderPendingState());
        System.out.println("Alterando para pendente...\n");
    }

    @Override
    public void shipOrder() {
        System.out.println("Aguardando mudança da forma de pagamento. \n");
    }
}
