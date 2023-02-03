package Methods;

public class  If {
    public static void main(String[] args) {
        int x = 6;
        if(x <= 5){
            System.out.println("It's true");
        }
        else if (x>5 && x<10) {
            System.out.println("Number more than 5, but lesser 10");
        }
        else {
            System.out.println("Number more than 10");
        }
    }
}
