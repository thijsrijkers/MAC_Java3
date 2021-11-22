package MenuItem;

public abstract class Consumable implements Orderable{
    private double price;

    public Consumable(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
