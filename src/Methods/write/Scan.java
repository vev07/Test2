package Methods.write;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\Test2\\src\\Methods\\write\\TestWrite");
        Scanner scanner1 = new Scanner(file);

       while (scanner1.hasNextLine()){
           System.out.println(scanner1.nextLine());
       }


    }
}
