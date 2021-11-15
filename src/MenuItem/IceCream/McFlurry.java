package MenuItem.IceCream;

import MenuItem.Orderable;

abstract class McFlurry implements Orderable {
    private double price;

    public McFlurry(double price) {
        this.price = price;
    }
}
