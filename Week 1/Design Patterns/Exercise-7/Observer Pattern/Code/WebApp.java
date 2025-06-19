public class WebApp implements Observer {
    @Override
    public void update(String stock, double price) {
        System.out.println("[WebApp] " + stock + " updated to $" + price);
    }
}
