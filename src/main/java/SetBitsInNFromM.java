/**
 * Created by bartoszjanota-prv on 03/03/16.
 */
public class SetBitsInNFromM {
    public static void main(String[] args) {
        int N = 1024;
        int M = 21;
        //N = setBitsFromMInN(N, M, 2, 6);
        N = updateBits(N, M, 2, 6);
        print(N);

    }

    static int setBitsFromMInN(int N, int M, int i, int j){
        print(N);
        print(M);
        int mask = 1;
        for (int it = i; it < j; ++it){
            mask <<= 1;
            mask += 1;
        }
        mask <<= i;
        mask = ~mask;
        print(mask);
        N &= mask;
        print(N);
        M = M << i;
        N = N | M;
        return N;
    }

    private static void print(int N) {
        System.out.println(Integer.toBinaryString(N));
    }


    public static int updateBits(int n, int m, int i, int j) {
         int max=~0;/*All1’s*/

         // 1’s through position
         int left=max-((1<< j) - 1);

        print(left);

         // 1’s after position i
         int right=((1<<i)-1);

        print(right);

         // 1’s, with 0s between
         int mask = left | right;

         // Clear i through j, then put m in there
        return (n & mask) | (m << i);
         }
}
