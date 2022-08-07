package PracticalTasks1;

class Cat implements Animal{
    public void feed(){
        System.out.println("fish");
    }
    public void voice(){
        System.out.println("May");
    }
    @Override
    public String toString() {
        return "Cat";
    }
}
