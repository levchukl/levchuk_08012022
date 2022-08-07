package PracticalTask2;

class Student extends Person{
    final String TYPE_PERSON;

    public Student(String name, String TYPE_PERSON) {
        super(name);
        this.TYPE_PERSON = TYPE_PERSON;
    }

    @Override
    void print() {
        System.out.println("I am a student");
    }
}
