public class TestArray {
    public static void main(String[] args) {
        int[] numbersArray = new int[5];
        for (int i = 0; i<numbersArray.length; i++){

            numbersArray[i] =i;
        }

        for (int u : numbersArray)
            System.out.println(numbersArray[u]);

    }
}

