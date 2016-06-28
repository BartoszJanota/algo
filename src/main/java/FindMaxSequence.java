import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bartoszjanota-prv on 07/03/16.
 */
public class FindMaxSequence {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(-3);
        list.add(4);
        list.add(-2);
        list.add(4);
        list.add(-1);
        System.out.println(findTheLargestSum(list));
    }

    static int findTheLargestSum(List<Integer> list){
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for (int i : list){
            if (curr + i < i){
                curr = i;
            } else {
                curr += i;
            }
            if (curr > max) max = curr;
        }
        return max;
    }
}
