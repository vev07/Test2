package Classes;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {


        List array = new java.util.ArrayList();
        SuperList fimely = new SuperList();
        array.add(" Misha");
        array.add("Lesha");
        array.add("Serge");
        array.add(fimely);

        String array2 = (String) array.get(3);
        System.out.println(array2);

        ////////////////////////////////// с дженериками, актуальное решение

        List<String> array3 = new java.util.ArrayList<>();
        array3.add("Liza");
        array3.add("Marusy");
        array3.add("Tany");

        String array4 = array3.get(2);
        System.out.println(array4);
    }
}
class SuperList{

}