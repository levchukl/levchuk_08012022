package HomeWork1;

public class Employee implements Payment {

    private String employeeId;
    private double salary;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public Object calculatePay(){

        return null;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}

