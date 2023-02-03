package Classes;

public class Equals {
    public static void main(String[] args) {
        Animalss animal1 = new Animalss(1);
        Animalss animal2 = new Animalss(1);
        System.out.println(animal1.equals(animal2));

    }
}
class Animalss {
    private int id;

    public Animalss(int id){
        this.id = id;
    }
    public boolean equals(Object obj){
        Animalss otherAnimal = (Animalss) obj;

        return this.id == otherAnimal.id;
    }
}