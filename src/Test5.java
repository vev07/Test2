import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test5 {


   

    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        File file = new File("C:"+separator+"Users"+separator+"Admin"+separator+"Desktop"+separator+"Test123.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());


        File file2 =new File("C:\\Users\\Admin\\Desktop\\Test987.txt");
        Scanner scanner2 = new Scanner(file2);
        String line = scanner2.nextLine();
        String[] words = line.split(" ");

        System.out.println(Arrays.toString(words));

        File file3 =new File("C:\\Users\\Admin\\Desktop\\Test456.txt");
        Scanner scanner3 = new Scanner(file3);
        String line2 = scanner3.nextLine();
        String[] words2 = line2.split("\\.");

        System.out.println(Arrays.toString(words2));


        }
        scanner.close();

    }



}
