public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.pay(300);

        context.setPaymentStrategy(new PayPalPayment("ramit@cognizant.com"));
        context.pay(150);
    }
}
