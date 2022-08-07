package HomeWork1;

public class SalariedEmployee extends Employee {
    private double hourlyPaid;
    private double numberHours;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, double hourlyPaid, double numberHours, String socialSecurityNumber) {
        super(employeeId);
        this.hourlyPaid = hourlyPaid;
        this.numberHours = numberHours;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString(){
        return String.format("EmployeeID %s, HourlyPaid %.0f, NumberHours: %.0f, SocialSecurityNumber: %s, Salary: %.2f", getEmployeeId(), hourlyPaid, numberHours, socialSecurityNumber,calculatePay());
    }
    @Override
    public Object calculatePay(){
        super.setSalary(this.hourlyPaid*this.numberHours);
        return getSalary();
    }



}
