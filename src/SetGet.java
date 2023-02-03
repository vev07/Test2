public class SetGet {
    public static void main(String[] args) {

        HumanSuper humanSuper1 = new HumanSuper();
        HumanSuper humanSuper2 = new HumanSuper();
        humanSuper1.setName("Lusy");
        humanSuper1.setAge(19);
        humanSuper2.setName("");
        humanSuper2.setAge(8);




        humanSuper1.print();
        humanSuper2.print();



    }
static class HumanSuper {
    private String name;
    private int age;



    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("You enter name is empty");
        } else {
           name = userName;
        }
    }
    public String getName(){
        return name;

    }
    public void setAge(int userAge){
      if (userAge<10){
          System.out.println("You are young");
      }else {
          age = userAge;
      }
    }
    public int getAge(){
        return age;
    }
    public void print(){
      for (int i =0; i<3; i++){
        System.out.println("Your name is "+getName()+". You are "+getAge());
    }
    }
    /*public HumanSuper(String userName, int userAge) {
        this.name = userName;
        this.age = userAge;
    }*/
}
}


