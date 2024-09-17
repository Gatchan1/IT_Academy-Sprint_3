package tasca2.n2.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class StockBroker implements StockBrokerObservable {
    private double stockPrice;
    private List<StockAgency> observers = new ArrayList<StockAgency>();

    public StockBroker(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public void setStockPrice(double stockPrice) {
            this.stockPrice = stockPrice;
            this.notifyAllObservers();
    }

    public double getStockPrice() {
        return stockPrice;
    }

    @Override
    public void addObserver(StockAgency observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(StockAgency observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        System.out.println("Notifying observers...");
        observers.forEach(stockAgency -> stockAgency.refresh(stockPrice));
    }
}
