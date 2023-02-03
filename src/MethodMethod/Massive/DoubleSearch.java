package MethodMethod.Massive;

import java.util.Arrays;

public class DoubleSearch {
    public static void main(String[] args) {
        int[] DD = {-15,-8,4,22,63,100,117,156,222};
        int kay = 42;
        System.out.println(binarySearch(DD,kay));

    }public static int binarySearch(int[] DD, int kay){
        int low = 0;
        int high = DD.length-1;

        while (low <= high){
            int middle = low + (high - low) / 2;
            if (kay < DD[middle]){
                high = middle - 1;
            } else if (kay > DD[middle]) {
                low = middle + 1;

            }else {
                return middle;
            }
        }
        return -1;
    }
}
