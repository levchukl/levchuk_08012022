package HomeWork1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Employee[] employees = new Employee[6];
        employees[0] = new ContractEmployee("c1", 10000, "1212121212");
        employees[1] = new ContractEmployee("c2", 25000, "1313131313");
        employees[2] = new ContractEmployee("c3", 16500, "1414141414");
        employees[3] = new SalariedEmployee("s1", 500, 30, "1515151515");
        employees[4] = new SalariedEmployee("s2", 400, 50, "1616161616");
        employees[5] = new SalariedEmployee("s3", 600, 20, "1717171717");

        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println("Sort by salary");
        Arrays.sort(employees, new SortByAverageMonth());
        for (Employee emp: employees) {
            System.out.println(emp);
        }
    }
}



