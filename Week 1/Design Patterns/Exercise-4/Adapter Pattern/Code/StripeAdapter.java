public class StripeAdapter implements PaymentProcessor {
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void pay(int amount) {
        stripe.makeStripePayment(amount * 100); // convert to cents
    }
}
