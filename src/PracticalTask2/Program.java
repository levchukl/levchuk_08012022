package PracticalTask2;

public class Program {
    public static void main(String[] args) {
        Person[] peoples= new Person[3];
        peoples[0]=new Teacher("Mark", "teacher");
        peoples[1]=new Cleaner("Ivan", "cleaner");
        peoples[2]=new Student("Max", "student");
        for (Person a:peoples){
            a.print();
        }

        for(Person salary:peoples){
            System.out.println(salary);
        }


    }

}
