package HomeWork1;

import java.util.Comparator;

public class ContractEmployee extends Employee {
    private String federalTaxIdmember;


    public ContractEmployee(String employeeId, double salary, String federalTaxIdmember) {
        super(employeeId);
        super.setSalary(salary);
        this.federalTaxIdmember = federalTaxIdmember;
    }


    @Override
    public String toString() {
        return String.format("EmployeeID %s,  FederalTaxIdmember: %s, Salary: %.2f", getEmployeeId(), federalTaxIdmember, getSalary());
    }


}

