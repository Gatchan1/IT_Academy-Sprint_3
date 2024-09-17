package tasca2.n3.models;

public class Shoe {
    private String brand;
    private String model;
    private double price;
    private int stock;

    public Shoe(String brand, String model, double price, int stock) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.stock = stock;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void sellOne() {
        this.stock--;
    }

    @Override
    public String toString() {
        return "\n    Shoe{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                "}";
    }
}
