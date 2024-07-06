import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int max = 0;
        int val = 0;
        for(int keys: map.keySet()){
            if(map.get(keys)>max){
                max = map.get(keys);
                val = keys;
            }
        }
        return val;
    }
}
