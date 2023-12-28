package Statess.State_1;

public class OrderPendingState implements ShoppingOrderState{

    private final String statusName = "Order pending...";

    private static ShoppingOrder order;

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
        order.setState(new OrderRejectedState());
        System.out.println("Alterando para rejected...\n");
    }

    @Override
    public void waitPayment(ShoppingOrder order) {
        System.out.println("O pedido já se encontra pendente. \n");
    }

    @Override
    public void shipOrder() {
        System.out.println("Aguardando pagamento. \n");
    }


}
