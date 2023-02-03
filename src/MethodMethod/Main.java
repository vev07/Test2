package MethodMethod;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        person1.setInform("Misha",38,177.3);
        person2.setInform("Lida", 37,172.1);
        person3.setInform("Valik",11,112.8);

        person1.speak(person1.getName(), person1.getAge(), person1.getTall());
        person1.retirement();
        person2.speak(person2.getName(), person2.getAge(), person2.getTall());
        person2.retirement();
        person3.speak(person3.getName(), person3.getAge(), person3.getTall());

        person4.setName("");
        person4.setAge(4);
        person4.setTall(78.9);
        //person4.speak(person4.getName(), person4.getAge(), person4.getTall());
        System.out.println(person1.toString());










    }
}
