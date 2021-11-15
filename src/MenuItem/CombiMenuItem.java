package MenuItem;

import java.util.ArrayList;

public class CombiMenuItem implements Orderable {
    private Double price;
    private ArrayList<Consumable> consumables;

    public CombiMenuItem(Double price, ArrayList<Consumable> consumables) {
        this.price = price;
        this.consumables = consumables;
    }

    public Double getPrice() {
        return price;
    }

    public ArrayList<Consumable> getConsumables() {
        return consumables;
    }
}
