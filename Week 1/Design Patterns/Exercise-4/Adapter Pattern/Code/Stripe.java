public class Stripe {
    public void makeStripePayment(int amountInCents) {
        System.out.println("Paid via Stripe: $" + (amountInCents / 100.0));
    }
}
