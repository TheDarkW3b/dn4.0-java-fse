public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier();
        Notifier smsDecorator = new SMSNotifierDecorator(baseNotifier);

        smsDecorator.send("Your OTP is 4567");
    }
}
