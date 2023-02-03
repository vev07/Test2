package Methods;

public class EqualsMethod {
    public static void main(String[] args) {
       Animal dog = new Animal(1,"Dog");
        Animal dog2 = new Animal(1,"Dog");
        System.out.println(dog.equals(dog2));
        System.out.println("-------------------");

        String s1 = "Yevhen";
        String s2 = "Yevhen";
        String s3 = "Voropaiev";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));



    }

    static class Animal {
        private int id;
        private String kind;

        public Animal(int id, String kind) {
            this.id = id;
            this.kind = kind;
        }public boolean equals(Object obj){
            Animal otherAnimal = (Animal) obj;
            return this.id == id && this.kind == kind;
        }
    }
}

