package Methods.write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\Test2\\src\\Methods\\write\\TestWrite");
        PrintWriter printWriter = new PrintWriter(file);
        System.out.println("Something enter");
        String x = scanner.nextLine();
        printWriter.println(x);

        System.out.println("Something enter");
        String y = scanner.nextLine();
        printWriter.println(y);

        printWriter.close();





    }
}
