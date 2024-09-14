package tasca2.n2.observerpattern;

public class StockAgency {           // observer
    private StockBroker observable;

    public StockAgency(StockBroker stockBroker) {
         observable = stockBroker;
         observable.addObserver(this);
    }

    public void refresh(double oldValue) {
          if (oldValue > observable.getStockPrice()) {
              System.out.println("Agency says: I see, the stocks are going down from "
                      + oldValue + " to " + observable.getStockPrice() + ". Time to sell!");
          } else {
              System.out.println("Agency says: I see, the stocks are going up from "
                      + oldValue + " to " + observable.getStockPrice() + ". Time to buy!");
          }
    }
}
