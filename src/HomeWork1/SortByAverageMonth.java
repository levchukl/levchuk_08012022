package HomeWork1;

import java.util.Comparator;

public class SortByAverageMonth implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        double salary1 = o1.getSalary();
        double salary2 = o2.getSalary();
        if (salary1>salary2){
            return -1;
        } else if (salary1<salary2){
            return 1;
        } else {
            return 0;
        }
    }
}
