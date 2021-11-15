package Location;

import People.Employee;

public class Register {
    private Employee employee;

    public Register(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
