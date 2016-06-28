import java.util.Arrays;

/**
 * Created by bartoszjanota-prv on 07/03/16.
 */
public class AllPairsThatSumUpToN {
    public static void main(String[] args) {
        int [] list = {5, 2, 4, 4, 3, 6, 2, 8, 9 ,10 , 4, 8, 13};
        findPairs(list, 16);
        findPairs(list, 8);
    }

    static void findPairs(int [] list, int num){
        Arrays.sort(list);
        int l = 0;
        int r = list.length - 1;
        while(l < r){
            if (list[l] + list[r] == num){
                System.out.println(list[l] + " + " + list[r]);
                l++;
            } else if (list[l] + list[r] > num){
                r--;
            } else l++;
        }
    }
}
