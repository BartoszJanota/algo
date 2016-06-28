import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by bartoszjanota-prv on 05/03/16.
 */
public class SubsetsOfSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        //Set subsets = generateSubsets(set);
        //System.out.println(subsets);
        Set<Set<Integer>> output = new HashSet<>();
        subsetOfSets(set, output);
        System.out.println(output);

    }

    private static Set generateSubsets(Set<Integer> set) {
        if (set.iterator().hasNext()) {
            int curr = set.iterator().next();
            set.remove(curr);
            return new HashSet<>(subsetsOfSet(new ArrayList<>(set), curr));
        }
        return null;
    }

    static List<List<Integer>> subsetsOfSet(List<Integer> list, int current) {
        if (list.isEmpty()) {
            List<Integer> firstSet = new ArrayList();
            firstSet.add(current);
            List<List<Integer>> returnSet = new ArrayList();
            returnSet.add(firstSet);
            return returnSet;
        }
        int lastFromSet = list.remove(0);
        List<List<Integer>> currentSets = subsetsOfSet(list, lastFromSet);
        List<List<Integer>> tmpSets = new ArrayList();
        for (List<Integer> l : currentSets) {
            List<Integer> currList = new ArrayList(l);
            currList.add(current);
            tmpSets.add(currList);
        }
        List<Integer> singleElement = new ArrayList<>();
        singleElement.add(current);
        tmpSets.add(singleElement);
        currentSets.addAll(tmpSets);
        return currentSets;

    }

    static void subsetOfSets(Set<Integer> set, Set<Set<Integer>> output){
        if (set.isEmpty()){
            output.add(new HashSet<>());
        } else {
            int curr = set.iterator().next();
            set.remove(curr);
            subsetOfSets(set, output);
            Set<Set<Integer>> currOutput = new HashSet<>();
            for (Set<Integer> s: output){
                Set<Integer> sCopy = new HashSet<>(s);
                sCopy.add(curr);
                currOutput.add(sCopy);
            }
            output.addAll(currOutput);
        }
    }
}
