package MethodMethod.Massive;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] digits = {3,5,7,9,9,1};
        System.out.println(maxNumber(digits));

    }public static String maxNumber( int[] digits){
        Arrays.sort(digits);
        String result ="";
        for (int i = digits.length-1; i >= 0; i--)
            result += digits[i];
        return result;
    }
}

