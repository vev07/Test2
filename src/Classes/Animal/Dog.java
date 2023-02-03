package Classes.Animal;

public class Dog extends Animal implements Info{

    public void eat(){
        System.out.println("Dog is eating");
    }
    public void bark(){
        System.out.println("dog is barking.");
    }
}
