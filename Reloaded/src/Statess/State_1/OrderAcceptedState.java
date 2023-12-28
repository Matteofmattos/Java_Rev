package Statess.State_1;

public class OrderAcceptedState implements ShoppingOrderState{

    private final String statusName = "Order accepted...";

    private ShoppingOrder order;

    @Override
    public String getStatus() {
        return this.statusName;
    }

    @Override
    public void approvePayment(ShoppingOrder order) {
        System.out.println("O pedido já se encontra confirmado. \n");
    }

    @Override
    public void rejectPayment(ShoppingOrder order) {
        order.setState(new OrderRejectedState());
        System.out.println("Alterando para rejected...\n");
    }

    @Override
    public void waitPayment(ShoppingOrder order) {
        order.setState(new OrderPendingState());
        System.out.println("Alterando para pendente...\n");
    }

    @Override
    public void shipOrder() {
        System.out.println("Pedido concluído com sucesso! \n");
    }
}
