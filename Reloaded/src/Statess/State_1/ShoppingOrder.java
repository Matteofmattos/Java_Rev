package Statess.State_1;

public class ShoppingOrder {
    private ShoppingOrderState state = new OrderPendingState();

    public void setState(ShoppingOrderState state) {
        this.state = state;
    }

    public String GetStatus(){
        return this.state.getStatus();
    }

    public void approvePaymentOrder(){
        this.state.approvePayment(this);
    }

    public void rejectPaymentOrder(){
        this.state.rejectPayment(this);
    }

    public void waitPaymentOrder(){
        this.state.waitPayment(this);
    }

    public void shipOrderShopping(){
        this.state.shipOrder();
    }

}