package Classes;

public class ClassesOrObjects {
    public static void main(String[] args) {
        Person person = new Person("Yevhen", "Voropaiev", 39, 98.5);
        Person person1 = new Person("Iryna", "Voropaieva", 42, 53.1);
        System.out.println(person1.toString());
        System.out.println(person.toString());

        final String CONSTANT = "VEV";


    }
}


class    Person {
   private String name;
    private String secondName;
    private int age;
   private double weight;




    public Person(String name, String secondName, int age, double weight){
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.weight = weight;

    }public String toString(){
        return name+" "+secondName+","+age+", "+weight;
    }

}



