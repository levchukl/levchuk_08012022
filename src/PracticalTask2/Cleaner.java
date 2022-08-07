package PracticalTask2;

public class Cleaner extends Staff{
    final String TYPE_PERSON;

    public Cleaner(String name, String TYPE_PERSON) {
        super(name);
        this.TYPE_PERSON = TYPE_PERSON;
    }

    @Override
  void salary() {
        System.out.println("Cleaner salary");
    }
}
