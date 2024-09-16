package tasca2.n2;

import tasca2.n2.observerpattern.StockAgency;
import tasca2.n2.observerpattern.StockBroker;

public class Main {
    public static void main(String[] args) {
        StockBroker broker = new StockBroker(5.4);
        StockAgency agency = new StockAgency(broker);
        StockAgency agency2 = new StockAgency(broker);

        broker.setStockPrice(6);
        broker.setStockPrice(2);
        broker.setStockPrice(2);
    }
}
