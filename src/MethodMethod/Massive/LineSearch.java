package MethodMethod.Massive;

public class LineSearch {
    public static void main(String[] args) {
        int[] A = {15, 6, 8, 10, 41};
        int K = 15;

        System.out.println(linerSearch(A,K));

    }



    public static int linerSearch(int[] A, int K){
            for (int i = 0; i < A.length; i++) {
                if (A[i] == K)
                    return i;




            }

        return -1;
    }
}
