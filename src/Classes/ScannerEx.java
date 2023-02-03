package Classes;
import java.util.Scanner;


public class ScannerEx {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String z = scanner.nextLine();
        String r =scanner.nextLine();  // если поставить сканнер стринга в конце он его пропускает, почему?
        int x = scanner.nextInt();
        int c =scanner.nextInt();
        double y = scanner.nextDouble();

        System.out.println(x+" "+y+" "+z+" "+r+" "+c);

    }
}
