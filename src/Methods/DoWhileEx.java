package Methods;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value;

        do{
            System.out.println("enter 10");
            value =scanner.nextInt();

        }while (value !=10);
    }
}
