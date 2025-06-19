public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        market.register(new MobileApp());
        market.register(new WebApp());

        market.updatePrice("AAPL", 192.45);
        market.updatePrice("GOOGL", 2732.00);
    }
}
