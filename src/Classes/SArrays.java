package Classes;

public class SArrays {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i*10;

        }
        for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("---------------------------");
        int[] numbers1 = {1,55,555,6666};
        for (int i =0; i<numbers1.length; i++){
            System.out.println(numbers1[i]);
        }
        System.out.println("------------------------");
        String[] arraas = {"divjbdif", "jcnvn","rew"};
        for (int i =0; i<arraas.length; i++){
            System.out.println(arraas[i]);
        }
        System.out.println("-------------------------------");
        double[] arrayDouble = {157.25,48.3,4896.44,49666.1};
        for (int i = 0; i<arrayDouble.length; i++){
            System.out.println(arrayDouble[i]);
        }
    }

}
