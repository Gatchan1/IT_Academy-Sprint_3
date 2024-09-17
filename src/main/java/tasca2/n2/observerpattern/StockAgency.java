package tasca2.n2.observerpattern;

public class StockAgency implements StockAgencyObserver {
    private StockBroker observable;
    private double oldValue;

    public StockAgency(StockBroker stockBroker) {
         observable = stockBroker;
         observable.addObserver(this);
        oldValue = observable.getStockPrice();
    }

    @Override
    public void refresh(double newValue) {
          if (oldValue > newValue) {
              System.out.println("An agency says: \"I see, the stocks are going down from "
                      + oldValue + " to " + newValue + ". Time to sell!\"");
          } else if (oldValue < newValue) {
              System.out.println("An agency says: \"I see, the stocks are going up from "
                      + oldValue + " to " + newValue + ". Time to buy!\"");
          } else {
              System.out.println("An agency says: \"I've been notified that the stock " +
                      "value is the same.\"");
          }
          oldValue = newValue;
    }
}
