package PracticalTasks1;

public class Dog implements Animal{
    public void feed(){
        System.out.println("meat");
    }
    public void voice(){
        System.out.println("Gav");
    }
    @Override
    public String toString() {
        return "Dog";
    }
}
