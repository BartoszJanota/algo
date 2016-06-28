/**
 * Created by bartoszjanota-prv on 05/03/16.
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(nthFibonacciNum(10));
        System.out.println(nthFiboIterative(10));
    }



    static int nthFibonacciNum(int n){
        if(n <= 0) return 0;
        if(n == 1) return 1;
        return nthFibonacciNum(n - 1) + nthFibonacciNum(n - 2);
    }

    static int nthFiboIterative(int n){
        int a1 = 1;
        int a2 = 1;
        for(int i = 0; i < n - 2; ++i){
            a2 = a2 + a1;
            a1 = a2 - a1;
        }
        return a2;
    }

}
