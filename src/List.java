import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class List {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("SSS.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println( "Yevhen");
        printWriter.println();
        printWriter.close();
    }
}
