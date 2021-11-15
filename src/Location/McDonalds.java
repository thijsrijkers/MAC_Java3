package Location;

import People.Employee;
import java.util.ArrayList;

public class McDonalds {
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private Register register;
    private Parkinglot parkinglot;

    public McDonalds(Register register, Parkinglot parkinglot) {
        this.register = register;
        this.parkinglot = parkinglot;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public Parkinglot getParkinglot() {
        return parkinglot;
    }

    public void setParkinglot(Parkinglot parkinglot) {
        this.parkinglot = parkinglot;
    }
}
