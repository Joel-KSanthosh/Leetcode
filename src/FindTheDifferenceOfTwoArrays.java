import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());

        for(int i : nums1){
            hs1.add(i);
        }

        for(int i : nums2){
            hs2.add(i);
        }

        for(int i : hs1){
            if(!hs2.contains(i)){
                res.get(0).add(i);
            }
        }

        for(int i : hs2){
            if(!hs1.contains(i)){
                res.get(1).add(i);
            }
        }

        return res;
    }
}
