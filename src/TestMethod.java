public class TestMethod {


    private String name;
    private int age;
    private double tall;


    void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("You enter empty name");
        } else {name = userName;}


    }
    double setTall ( double userTall) {
        if (userTall < 100.0) {
            System.out.println("You enter wrong tall");
        } else {
            tall = userTall;
        }
        return userTall;
    }
    int setAge (int userAge) {
        if (userAge < 10) {
            System.out.println("You enter wrong age");
        } else {
            age = userAge;
        }
        return userAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getTall() {
        return tall;
    }
    public void print(){
        System.out.println("My name "+getName()+". I'm "+getAge()+" years"+". My tall is "+getTall());
    }
}