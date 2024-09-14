package tasca2.n2.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class StockBroker {         // observable
    private double stockPrice;
    private List<StockAgency> observers = new ArrayList<StockAgency>();

    public StockBroker(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public void addObserver(StockAgency observer) {
        observers.add(observer);
    }

    public void removeObserver(StockAgency observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers(double oldValue) {
        /* Me habría gustado hacer interfaces, o clases abstractas de Observer & Observable.
        Pero no las hice porque quise enviar este parámetro double en este método...*/
        observers.forEach(stockAgency -> stockAgency.refresh(oldValue));
    }

    public void setStockPrice(double stockPrice) {
        if (this.stockPrice != stockPrice) {
            double oldValue = this.stockPrice;
            this.stockPrice = stockPrice;
            this.notifyAllObservers(oldValue);
        }
    }

    public double getStockPrice() {
        return stockPrice;
    }
}
