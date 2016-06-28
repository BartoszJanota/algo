/**
 * Created by bartoszjanota-prv on 05/03/16.
 */
public class RepresentNCents {
    public static void main(String[] args) {
        System.out.println(representNCents(50,50));
        System.out.println(makeChange(50, 25));
    }

    static int representNCents(int n, int currVal){
        if (n == 0) return 1;
        int ret25 = 0;
        if (currVal >= 25 && n - 25 >= 0) ret25 = representNCents(n - 25, 25);
        int ret10 = 0;
        if (currVal >= 10 && n - 10 >= 0) ret10 = representNCents(n - 10, 10);
        int ret5 = 0;
        if (currVal >= 5 && n - 5 >= 0) ret5 = representNCents(n - 5, 5);
        int ret1 = 0;
        if (currVal >= 1 && n - 1 >= 0) ret1 = representNCents(n - 1, 1);
        return ret25 + ret10 + ret5 + ret1;
    }

    public static int makeChange(int n, int denom) { int next_denom = 0;
        switch (denom) {
            case 25:
                next_denom = 10;
                break;
            case 10:
                next_denom = 5;
                break;
            case 5:
                next_denom = 1;
                break;
            case 1:
                return 1; }
        int ways = 0; for(int i=0;i*denom<=n;i++){
            ways += makeChange(n - i * denom, next_denom); }
        return ways; }
}
