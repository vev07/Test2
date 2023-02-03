package Classes.Animal;

public abstract class Animal implements Info{
    public void sleep (){
        System.out.println("animal is sleeping");
    }
    public void eat(){
        System.out.println("animal is eating");
    }

    public void showInfo(){
        System.out.println("I'm animal");

    }

}

