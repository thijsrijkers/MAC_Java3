package People;

public class Customer {
    private double weight;
    private double wallet;

    public Customer(double weight, double wallet) {
        this.weight = weight;
        this.wallet = wallet;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
