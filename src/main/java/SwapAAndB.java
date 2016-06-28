/**
 * Created by bartoszjanota-prv on 07/03/16.
 */
public class SwapAAndB {
    public static void main(String[] args) {
        swap(3, 7);
        swapArit(7,3);
    }

    static void swap(int a, int b){
        print(a,b);
        a = a^b;
        b = a^b;
        a = a^b;
        print(a,b);
    }

    private static void print(int a, int b) {
        System.out.println("a: " + a + " b: " + b);
    }

    static void swapArit(int a, int b){
        print(a,b);
        a = a + b;
        b = a - b;
        a = a - b;
        print(a,b);
    }
}
