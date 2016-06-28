/**
 * Created by bartoszjanota-prv on 07/03/16.
 */
public class findMax {
    public static void main(String[] args) {
        System.out.println(findMax(7, 3));
    }

    static int findMax(int a, int b){
        int p = (a - b) & 1 << 32;
        return a - p*(a -b);
    }
}
