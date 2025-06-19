public class PayPalAdapter implements PaymentProcessor {
    private PayPal paypal;

    public PayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void pay(int amount) {
        paypal.sendPayment((double) amount); // PayPal accepts double
    }
}
