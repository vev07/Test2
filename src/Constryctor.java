public class Constryctor {
    public static void main(String[] args) {
        Human human = new Human("Misha", 33,187.3);
        Human human1 = new Human("Lena", 28, 177.3);
        human.getHuman(human.getName(), human.getAge(), human.getTall());
        human1.getHuman(human1.getName(), human1.getAge(), human1.getTall() );


    }
}
class Human{
    private String name;
    private int age;
    private double tall;

    public Human(String name, int age,double tall){
        this.name =name;
        this.age = age;
        this.tall = tall;
    }
    public String getName(){
        return name;
        }
        public int getAge(){
        return age;
        }
        public double getTall(){
        return tall;
        }
    public void getHuman(String name, int age, double tall){
        System.out.println("I'm "+name+", I'm "+age+", My tall is "+tall);

    }

}