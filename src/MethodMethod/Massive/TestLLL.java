package MethodMethod.Massive;

import java.util.Arrays;

public class TestLLL {
    public static void main(String[] args) {
        int[] sortInt = {9,4,8,6,11,4,57,8,77,19,62};
        System.out.println(Arrays.toString(sortInt));
        System.out.println(choiceSort(sortInt));

    }
    public static int choiceSort(int[] sortInt){
        int min = 0;
        for (int i = 0; i < sortInt.length-1; i++){
            min = i;
            for (int j = i; j < sortInt.length; j++){
                if (sortInt[min] > sortInt[j]){
                    min = j;
                }
            }
            int temp = sortInt[i];
            sortInt[i] =sortInt[min];
            sortInt[min] = temp;
        }
        System.out.println(Arrays.toString(sortInt));
        return min;
    }
}
