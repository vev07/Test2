package Classes.Animal;

public class Bird extends Animal implements Info{
    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }@Override
    public void eat(){
        System.out.println("Bird is eating");
    }

}