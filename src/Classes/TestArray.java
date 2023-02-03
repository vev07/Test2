package Classes;
import java.util.ArrayList;

public class TestArray {
    public static void main(String[] args) {
    ArrayList<Integer>  numberList111 = new ArrayList<>();
    for (int i = 0; i<10; i++){
        numberList111.add(i);
    }
    for (int i = 0; i<numberList111.size(); i++){
        System.out.println(numberList111.get(i));
    }
    numberList111.remove(5);
        System.out.println(numberList111);

    }

}
