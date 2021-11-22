package MenuItem;

import java.util.ArrayList;

public class CombiMenuItem implements Orderable {
    private double price;
    private ArrayList<Consumable> consumables;

    public CombiMenuItem(Double price, ArrayList<Consumable> consumables) {
        this.price = price;
        this.consumables = consumables;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Consumable> getConsumables() {
        return consumables;
    }
}
