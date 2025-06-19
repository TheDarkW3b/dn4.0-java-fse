public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(int amount) {
        if (strategy == null) {
            System.out.println("No payment strategy set!");
            return;
        }
        strategy.pay(amount);
    }
}
