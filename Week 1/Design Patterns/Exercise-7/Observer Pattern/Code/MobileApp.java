public class MobileApp implements Observer {
    @Override
    public void update(String stock, double price) {
        System.out.println("[MobileApp] " + stock + " updated to $" + price);
    }
}
