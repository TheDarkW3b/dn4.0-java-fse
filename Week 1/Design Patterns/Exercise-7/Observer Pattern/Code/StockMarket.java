import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private List<Observer> observers = new ArrayList<>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void updatePrice(String stock, double price) {
        System.out.println("Market Update: " + stock + " is now $" + price);
        for (Observer observer : observers) {
            observer.update(stock, price);
        }
    }
}
