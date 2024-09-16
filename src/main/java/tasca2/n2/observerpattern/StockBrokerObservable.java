package tasca2.n2.observerpattern;

public interface StockBrokerObservable {
    void addObserver(StockAgency observer);
    void removeObserver(StockAgency observer);
    void notifyAllObservers();
}
