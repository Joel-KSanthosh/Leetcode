import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.lang.Math;

public class MaxNumberOfKPairSum {

    //Using HashMap
    public int maxOperationsUsingHashMap(int[] nums, int k) {

        Map<Integer,Integer> key = new HashMap<>();

        for(int i = 0;i< nums.length;i++){
            key.put(nums[i] , key.getOrDefault(nums[i],0)+1);
        }

        int count = 0;
        for(int i : key.keySet()){
            if(key.containsKey(i) && key.containsKey(k-i)){
                if(i!=k-i){
                    count+= Math.min(key.get(i),key.get(k-i));
                    key.put(i,0);
                    key.put(k-i,0);
                }
                else{
                    count+= (int) Math.floor(key.get(i)/2);
                    key.put(i,0);
                }

            }
        }
        return count;

    }

    //2 pointer on sorted array

    public int maxOperationsSorted2p(int[] nums, int k) {
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        Arrays.sort(nums);

        while(i<j){
            if(nums[i]+nums[j]==k){
                count++;
                i++;
                j--;
            }
            else if(nums[i]+nums[j]<k && nums[i]<nums[j]){
                i++;
            }
            else{
                j--;
            }

        }
        return count;
    }


}
