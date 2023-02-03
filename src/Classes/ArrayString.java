package Classes;

public class ArrayString {
    public static void main(String[] args) {

        String[] arrayString = new String[3];
        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);
        arrayString[0] = "Hi";
        arrayString[1] = "Hello";
        arrayString[2] = "Bay";
        for (int i = 0; i<arrayString.length; i++){
            System.out.println(arrayString[i]);
        }
        System.out.println("-------------------------");
        for (String s:arrayString){
            System.out.println(s);
        }
        System.out.println("-------------------------");
        int[] number = {1,3,5,9,12};
        int sum = 0;
        for (int x:number){
            sum = sum+x;
            System.out.println(x);
            System.out.println(sum);

        }

    }
}
