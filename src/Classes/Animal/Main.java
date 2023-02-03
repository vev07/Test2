
package Classes.Animal;
import Classes.ClassesOrObjects.*;
import Classes.Serializable2.Person;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Bird bird = new Bird();

        bird.eat();
        bird.sleep();


        dog.sleep();
        dog.eat();
        dog.bark();

        dog.showInfo();
        bird.showInfo();
        Person person6 = new Person(2023,"Grisha");
        System.out.println(person6.toString());
      




    }


}


