package MenuItem.Burger;

import MenuItem.Consumable;

abstract class Burger extends Consumable {
    private Double price;

    public Burger(Double price) {
        this.price = price;
    }
}
