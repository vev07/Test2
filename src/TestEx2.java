public class TestEx2 {

             private String name;
             private int age;
             private static int countPeople;

    public TestEx2(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }
            public String setName(String name) {
                this.name = name;
                return name;
            }

            public int setAge(int age) {
                this.age = age;
                return age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            public void print() {
                System.out.println("My name is " + name + ". My is " + age+ " years.");
            }
            public void printCountPeople(){
                System.out.println("Number all people are "+countPeople);
            }





}