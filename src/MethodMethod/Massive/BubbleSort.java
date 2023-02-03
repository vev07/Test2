package MethodMethod.Massive;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] bubble = {15, 14, 47, 16, 2, 3};
        System.out.println(Arrays.toString(bubble));
        //choiceSort(bubble);
        //Arrays.toString(bubble);
        insertSort(bubble);
    }
    public static void choiceSort(int[] bubble) {

        int i;
        int counter = 0;

        do {

            for (i = 0; i < bubble.length - 1; i++) {
                if (bubble[i] > bubble[i + 1]) {

                    int temp = bubble[i];
                    bubble[i] = bubble[i + 1];
                    bubble[i + 1] = temp;
                    counter++;


                }
            }
        }
        while (counter > 0) ;
            System.out.println(Arrays.toString(bubble));




    }
    public static void insertSort(int[] bubble){
        int element;
        int indexToInsert;
        for (int i = 0; i < bubble.length; i++) {
            element = bubble[i];
            indexToInsert = i;

            while (indexToInsert > 0 && bubble[indexToInsert - 1] > element) {

                bubble[indexToInsert] = bubble[indexToInsert-1];
                indexToInsert--;
                bubble[indexToInsert] = element;
            }


        }
        System.out.println(Arrays.toString(bubble));
    }
}
