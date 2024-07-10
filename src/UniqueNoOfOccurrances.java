import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNoOfOccurrances {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        Set<Integer> set = new HashSet<>();
        for(int i : map.values()){
            set.add(i);
        }

        if(map.size()==set.size()){
            return true;
        }
        return false;
    }
}
