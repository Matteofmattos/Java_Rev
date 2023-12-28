package Statess.State_1;

public interface ShoppingOrderState {
    String getStatus();
    void approvePayment(ShoppingOrder order);
    void rejectPayment(ShoppingOrder order);
    void waitPayment(ShoppingOrder order);
    void shipOrder();
}
