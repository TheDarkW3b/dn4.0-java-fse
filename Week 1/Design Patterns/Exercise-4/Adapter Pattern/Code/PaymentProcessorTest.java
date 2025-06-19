public class PaymentProcessorTest {
    public static void main(String[] args) {
        PaymentProcessor stripePayment = new StripeAdapter(new Stripe());
        stripePayment.pay(250);

        PaymentProcessor paypalPayment = new PayPalAdapter(new PayPal());
        paypalPayment.pay(500);
    }
}
