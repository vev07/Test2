package Methods;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        System.out.println("Enter How are you old.");

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        switch (age){
            case 0 :
                System.out.println("you are born");
                break;
            case 7:
                System.out.println("you went to school");
                break;
            case 18 :
                System.out.println("you finished a school");
                break;
            default:
                System.out.println("I don't know what with you");
        }

    }
}
