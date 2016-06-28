import java.util.ArrayList;
import java.util.List;

/**
 * Created by bartoszjanota-prv on 01/03/16.
 */
public class Hanoi {
    public static void main(String[] args) {
        List<Integer> src = new ArrayList<>();
        for (int i = 30; i >= 1; --i){
            src.add(i);
        }

        List<Integer> by = new ArrayList<>();
        List<Integer> dest = new ArrayList<>();
        System.out.println(src);
        System.out.println(dest);
        System.out.println(by);

        makeHanoi(src.size(), src, dest, by);

        System.out.println(src);
        System.out.println(dest);
        System.out.println(by);

    }

    static void makeHanoi(int size, List<Integer> src, List<Integer> dest, List<Integer> by){
        if(size == 0){
            //System.out.println("We are done");
        } else if (size == 1) {
            dest.add(src.remove(src.size()-1));
            makeHanoi(size - 1, src, dest, by);
        } else {
            makeHanoi(size - 1, src, by, dest);
            dest.add(src.remove(src.size()-1));
            makeHanoi(size - 1, by, dest, src);
        }
    }

}
