package PracticalTask2;

abstract class Staff extends Person {

    public Staff(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("I am a staff");
    }
    abstract void salary();

}
