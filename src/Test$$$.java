public class Test$$$ {
    public static void main(String[] args) {

        Rat rat = new Rat("fields rat", 1);
        Rat mouse = new Rat("fly mouse", 2);
        rat.toString(rat.getKind(), rat.getId());
        mouse.toString(mouse.getKind(), mouse.getId());
        rat.eat();
        mouse.eat();

        Rat bird = new Rat("Calibry", 3){
            public void eat(){
                System.out.println("Calibry is eating");
            }
        };
        bird.eat();
        bird.eat();
        rat.eat();


    }
}
class Rat {
    private String kind;
    private int id;

    public Rat(String kind, int id){
        this.kind = kind;
        this.id = id;
    }
    public Rat(){

    }
    public void eat(){
        System.out.println("Rat is eating");
    }
    public String toString(String kind, int id){
        System.out.println(kind+" "+id);
               return kind+""+id;
    }

    public String getKind() {
        return kind;
    }

    public int getId() {
        return id;
    }
}
class Mouse extends Rat {

}