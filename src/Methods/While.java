package Methods;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        while (value < 10){
            System.out.println("Value lesser than "+value);
            value =value+1;
        }
    }
}

