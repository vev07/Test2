package Methods;

public class Recursiy {
    public static void main(String[] args) {

        System.out.println(fac(4));
        /*counter(3);

    }
    private static void counter(int n){
        if(n == 0)
            return;
        System.out.println(n);

        counter(n-1);*/
    }
    private static int fac (int f){
        if (f == 1)
            return 1;
        return f*fac(f-1);

    }

}
