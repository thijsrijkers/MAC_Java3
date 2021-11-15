package MenuItem.Drinks;

import MenuItem.Consumable;

abstract class Drink extends Consumable {
    private Double price;

    public Drink(Double price) {
        this.price = price;
    }
}
