import Exceptions.TooFatException;
import Location.McDonalds;
import Location.Parkinglot;
import Location.Register;
import MenuItem.Burger.BigMac;
import MenuItem.Orderable;
import People.Chef;
import People.Customer;
import People.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class McDonaldsTest {
    McDonalds mcDonalds;
    Orderable bigmac;
    Register register;
    Parkinglot parkinglot;
    Employee employee;
    Customer customer;

    @BeforeEach
    void setUp() {
        this.employee = new Chef();
        this.register = new Register(employee);
        this.parkinglot = new Parkinglot(10);
        this.mcDonalds = new McDonalds(register, parkinglot);
        this.bigmac = new BigMac();
        this.customer = new Customer(99.00, 20.00);
    }

    @Test
    @DisplayName("Testing for correct response, customer can buy without a problem")
    void testingPossiblePurchase() throws TooFatException {
        customer.setWeight(99.00);
        assertEquals("Klant heeft eten gekocht", mcDonalds.orderConsumable(bigmac, customer));
    }

    @Test
    @DisplayName("Testing the weight check, if the limit is maxed out")
    void testingIfWeightCheckTriggersException() throws TooFatException {
        customer.setWeight(100.00);
        assertEquals("Klant heeft eten gekocht", mcDonalds.orderConsumable(bigmac, customer));
    }

    @Test
    @DisplayName("Error testing, checking if tooFatException triggers")
    void testingExceptionTrigger() {
        assertThrows(TooFatException.class, () -> {
            customer.setWeight(100.01);
            mcDonalds.orderConsumable(bigmac, customer);
        });
    }

    @Test
    @DisplayName("Testing if customer has enough money")
    void testingAmountMoney() throws TooFatException {
        customer.setWallet(0.00);
        assertEquals("Klant heeft te weinig geld, WEGWEZEN!", mcDonalds.orderConsumable(bigmac, customer));
    }

}
