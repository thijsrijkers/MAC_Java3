import Exceptions.TooFatException;
import Location.McDonalds;
import Location.Parkinglot;
import Location.Register;
import MenuItem.Burger.BigMac;
import MenuItem.Consumable;
import People.Chef;
import People.Customer;
import People.Employee;

public class main {

    public static void main(String[] args) throws TooFatException {
        Customer robin = new Customer(69.00, 420.00);
        Customer tim = new Customer(115.00, 0.00);

        Parkinglot parkinglot = new Parkinglot(20);
        Employee employee = new Chef();
        Register register = new Register(employee);
        McDonalds macie = new McDonalds(register, parkinglot);

        Consumable bigmac = new BigMac();

        macie.orderConsumable(bigmac, robin);
        macie.orderConsumable(bigmac, tim);
        tim.setWeight(80.00);
        macie.orderConsumable(bigmac, tim);
    }
}
