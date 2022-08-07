package PracticalTask2;

public class Teacher extends Staff{
    final String TYPE_PERSON;

    public Teacher(String name, String TYPE_PERSON) {
        super(name);
        this.TYPE_PERSON = TYPE_PERSON;
    }

    @Override
     void salary() {
        System.out.println("Teacher salary");
    }
}
